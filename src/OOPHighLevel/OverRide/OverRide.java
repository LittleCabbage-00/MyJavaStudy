package OOPHighLevel.OverRide;
//方法的覆写，此时子类的权限必须高于父类，否则飘红
//也就是如果person2里面的print是public，子类的print直接void的话，编译无法通过
class Person2{
    void print(){
        System.out.println("Person-->void print()");
    }
}
class Student2 extends Person2 {
    public void print(){
        super.print();              //super就代表了父类这个整体
        //格式是super.方法()
        System.out.println("Student-->public void print()");
    }
}
public class OverRide {
    public static void main(String[] args){
        //new Person2().print();
        new Student2().print();
    }
}
