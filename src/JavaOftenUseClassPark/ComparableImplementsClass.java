package JavaOftenUseClassPark;

import java.util.Comparator;

//比较器
public class ComparableImplementsClass {
    public static void main(String[] args) {
        Student stu[] = {new Student("张三",20),
                new Student("李四",22),new Student("王五",20),
                new Student("赵六",20),new Student("孙七",22)} ;
        java.util.Arrays.sort(stu,new StudentComparator()) ;
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i]) ;
        }
    }
}
class Student{
    private String name ;
    private int age ;
    public Student(String name,int age){
        this.name = name ;
        this.age = age ;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true ;
        }
        if(!(obj instanceof Student)){
            return false ;
        }
        Student stu = (Student) obj ;
        if(stu.name.equals(this.name)&&stu.age==this.age){
            return true ;
        }else{
            return false ;
        }
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public String getName(){
        return this.name ;
    }
    public int getAge(){
        return this.age ;
    }
    @Override
    public String toString(){
        return name + "\t\t" + this.age  ;
    }
};

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2){
        if(s1.equals(s2)){
            return 0 ;
        }else if(s1.getAge()<s2.getAge()){
            return 1 ;
        }else{
            return -1 ;
        }
    }
};
