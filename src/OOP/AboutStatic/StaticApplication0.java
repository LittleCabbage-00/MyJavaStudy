package OOP.AboutStatic;
//static属性是所有对象共享的
//因此可以使用static属性统计一个类产生了多少个实例化对象
class Demo{
    private static int cnt=0;
    public Demo(){
        cnt++;
        System.out.println("have been make "+cnt+" object");
    }
}
public class StaticApplication0 {
    public static void main(String[] args){
        new Demo();
        new Demo();
        new Demo();
    }
}
