package OOP.AboutStatic;
//static可以为类中的属性进行自动编名操作
class Demo0{
    private String name;
    private static int cnt=0;
    public Demo0(){
        cnt++;
        this.name="DEMO~"+cnt;
    }
    public Demo0(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
//方法重载
public class StaticApplication1 {
    public static void main(String[] args){
        System.out.println(new Demo0().getName());
        System.out.println(new Demo0("A01").getName());
        System.out.println(new Demo0().getName());
        System.out.println(new Demo0("A02").getName());
        //System.out.println(new Demo0().getName());
    }
}
