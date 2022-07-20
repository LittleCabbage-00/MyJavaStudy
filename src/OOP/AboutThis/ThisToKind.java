package OOP.AboutThis;
//this指的是当前class（类）的对象，类似类里面的全局变量
//谁调用，this就代表谁，this=这整个class
class Person{
    private String name;
    private int age;
    private String n;
    public Person(){
        System.out.println("A new example was made.");
    }
    public Person(String name,int age){
        this();        //在这里访问Person()无参构造器，且this()只能在此构造器第一行
        //只能在构造器中使用，方法中使用不了，语法：this(构造器参数)
        this.name=name;//明确表示为类中的name属性赋值
        this.age=age;  //明确表示为类中的age属性赋值
    }
    public String out(){//获取信息
        return "name is "+name+"; age is "+age;
    }
    public Person(String n){
        n =n;           //由于没有this指定n是这个类里面的n，输出的是构造方法里面的参数，也就是null
    }
    public String info(){
        return "name is "+n;
    }
}
class People{
    String a;
    String b;
    public People(){
        System.out.println("test");
    }
    public People(String a,String b){
        this();
        this.a=a;
        this.b=b;
    }
    public String out(){
        return a+" "+b;
    }
}
public class ThisToKind {
    public static void fenge(){
        for(int i=0;i<20;i++){
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Person per=new Person("someone",30);
        //调用构造实例化方法
        System.out.println(per.out());
        Person per0=new Person("nobody");
        System.out.println(per0.info());
        fenge();
        People peo=new People("A","B");
        System.out.println(peo.out());
    }
}
