package OOP.CodeBlock;
//普通代码块
public class Normal {
    public static void main(String[] args){
        {
            int x=10;
            System.out.println("before x is "+x);
        }
        int x=50;
        System.out.println("after x is "+x);
    }
}
