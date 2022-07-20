package OOPHighLevel.Extend;
//更进一步的继承，子类对象实例化之前会先默认调用父类的构造方法
//相当于在子类里面调用了一个super()，（叫超类，或者叫父类）的无参构造
class Person1{
    private String name;
    private int age;
    public Person1(){
        System.out.println("make in the fulei");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Student1 extends Person1{
    private String school;
    public Student1(){
        //super();                      //加不加这句效果相同
        System.out.println("make in the zilei");
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
}
public class AboutExtendMore {
    public static void main(String[] args){
        Student1 stu=new Student1();
        stu.setName("jack");
        stu.setAge(8);
        stu.setSchool("cqupt");
        System.out.println("name: "+stu.getName()+"; age: "+stu.getAge()+"; school；"+stu.getSchool());
    }
}
