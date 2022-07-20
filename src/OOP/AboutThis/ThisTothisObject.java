package OOP.AboutThis;
class Person0{
    public String getInfo(){
        System.out.println("Person--> "+this);//直接打印this
        return null;                          //防止返回值出错
    }
}
public class ThisTothisObject {
    public static void main(String[] args){
        Person0 per0=new Person0();
        Person0 per1=new Person0();
        System.out.println("main method --> "+per0);//直接打印对象
        per0.getInfo();
        System.out.println("main method --> "+per1);//直接打印对象
        per1.getInfo();
    }
    //哪个对象调用了类里面的方法,this就表示哪个对象
}
