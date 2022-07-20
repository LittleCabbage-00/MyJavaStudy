package OOP.HeadObject;

class Person2{
    String name;
    int age;
    public void tell(){
        System.out.println(name+" "+age);
    }
}
//两个完全一样，修改1个会导致栈内容发生改变
//从程序运行结果可以发现，两个对象的输出内容是一样的
//实际上所谓的引用传递，就是将一个堆内存空间的使用权给多个栈内存空间
// 每个栈内存空间都可以修改堆内存的内容
public class ObjectExchange {
    public static void main(String[] args){
        Person2 per1=null;
        Person2 per2=null;
        per1=new Person2();
        per2=per1;
        per1.name="Someone";
        //per1.age=30;
        per2.age=50;
        System.out.print("per1 is :");
        per1.tell();
        System.out.print("per2 is :");
        per2.tell();
    }
}
