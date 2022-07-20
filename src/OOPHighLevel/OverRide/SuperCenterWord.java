package OOPHighLevel.OverRide;
//super关键字的作用
//super就是去访问父类的属性用的，和this用法类似，但是对象不同
class Person4{
    private String name;
    private int age;
    public Person4(String name,int age){
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
    public String getInfo(){
        return "name: "+this.name+"; age: "+this.age;
    }
}
class Student4 extends Person4{
    private String school;
    public Student4(String name,int age,String school){
        super(name,age);
        this.setSchool(school);
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getInfo(){            //覆写父类中的方法
        return super.getInfo()+"; school: "+this.school;
                                        //扩充父类中的方法
    }
}
public class SuperCenterWord {
    public static void main(String[] args){
        Student4 stu=new Student4("Amy",30,"CQUPT");
        System.out.println(stu.getInfo());
    }
}
