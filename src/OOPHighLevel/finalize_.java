package OOPHighLevel;
//finalize的使用
public class finalize_ {
    public static void main(String[] args) {
        car car = new car("Benz");
        car=null;
        //这时，对象就成了垃圾对象，没有任何引用，会被JVM的垃圾回收器回收
        //销毁前会调用这个finalize(),可以对这个finalize方法里面进行重写，去实现释放资源，以及其他自定义操作
        //如果不重写，则就是object类的默认方法，重写之后就能实现自己的业务逻辑
        System.gc();//主动调用垃圾回收器
    }
}
class car{
    private String name;

    public car(String name) {
        this.name = name;
    }
    //重写finalize

    @Override
    protected void finalize() throws Throwable {
        System.out.println("throw the car,free the rom....");
    }
}