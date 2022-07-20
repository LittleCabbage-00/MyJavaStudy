package OOPHighLevel.InterFaceKind;
/**
 * 接口的进阶：接口的继承
 */
interface Z{
    public String NAME="City";
    void printZ();
}
interface Y{
    public void printY();
}
interface X extends Y,Z{    //定义接口X的同时继承Y，Z接口
    public void printX();
}
class W implements X{       //子类实现接口X
    @Override
    public void printZ() {
        System.out.println("Z interface");
    }
    @Override
    public void printY() {
        System.out.println("Y interface");
    }
    @Override
    public void printX() {
        System.out.println("X interface");
    }
}
public class AboutInterfaceMore {
    public static void main(String[] args){
        W w=new W();
        w.printZ();
        w.printY();
        w.printX();
    }
}
