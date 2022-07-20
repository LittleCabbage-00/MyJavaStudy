package OOP.AboutStatic;

class Person3{
    private String name;
    private int age;
    private static String country="A country";//定义static属性
    public static void setCountry(String c){  //定义static方法
        country=c;
    }
    public Person3(String name,int age){      //构造方法
        this.name=name;
        this.age=age;
    }
    public void info(){
        System.out.println("name is "+this.name+", age is "+this.age+", city is "+country);
    }
    public static String getCountry(){      //取得static属性
        return country;
    }
}
public class StaticToMethod {
    public static void fenge(){
        for(int i=0;i<40;i++){
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Person3 p1=new Person3("Alpha",30);
        Person3 p2=new Person3("Beta",30);
        Person3 p3=new Person3("Zeta",30);
        p1.info();
        p2.info();
        p3.info();
        fenge();
        Person3.setCountry("B country");    //使用类名称调用static方法
        p1.info();
        p2.info();
        p3.info();
    }
    //非static声明可以调用static声明的属性和方法
    //但是static声明不能调用非static声明的属性和方法
    //也就是没有固定的方法可以调用固定的方法里面的值
    //但是固定的方法不能调用没有固定的值
}
