package OOPHighLevel.AbstractKind;
/**
 * 抽象类进阶
 * 实际就是比普通类多定义了一个抽象方法
 * 除了不能直接对对象实例化之外，没有任何不同
 * 另外，抽象方法一旦被创建，就必须被子类覆写
 */
abstract class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract String printInfo();
    //多定义的那个抽象方法
}
class Student extends Person{
    private String school;
    public Student(String name,int age,String school){
        super(name,age);
        this.school=school;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String printInfo(){
        return "name: "+super.getName()
                +"; age: "+super.getAge()
                +"; school: "+this.getSchool();
    }
}
public class AboutAbstractMore {
    public static void main(String[] args){
        Student stu=new Student("A",30,"cqupt");
        System.out.println(stu.printInfo());
    }
}
