package OOPHighLevel.Extend;
//关于继承的学习
class Person0{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Student0 extends Person0{
    //student是person的子类，继承之后可以使用person下面的所有定义
    //下面对方法进行扩展，设置新的属性
    private String school;
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
}
public class AboutExtend {
    public static void main(String[] args){
        Student0 stu=new Student0();
        stu.setName("A");
        stu.setAge(8);
        stu.setSchool("CQUPT");
        System.out.println("name: "+stu.getName()+"; age: "+stu.getAge()+"; school: "+stu.getSchool());
    }
}
