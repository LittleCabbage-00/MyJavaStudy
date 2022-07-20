package OOP.AboutStatic;
//static关键字
class Person2{
    String name;                        //定义name属性（未封装）
    int age;                            //定义age属性（未封装）
    static String country="A country";  //使用static方法定义城市属性
    public Person2(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void info(){                 //打印信息的方法
        System.out.println("name is "+this.name+", age is "+this.age+", city is "+country);
    }
}
public class StaticBasal {
    public static void fenge(){
        for(int i=0;i<40;i++){
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Person2 p1=new Person2("Alpha",30);
        Person2 p2=new Person2("Beta",30);
        Person2 p3=new Person2("Zeta",30);
        p1.info();
        p2.info();
        p3.info();
        fenge();
        p1.country="B country";         //修改了全局static属性
        p1.info();
        p2.info();
        p3.info();
        //static声明的属性是所有对象共享的
        fenge();
        Person2.country="C country";    //使用类名称修改static属性内容
        p1.info();
        p2.info();
        p3.info();
    }
}
