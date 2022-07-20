package Generics.Basical;

public class Generics_security {
    public static void main(String[] args) {
        Info i = new Info();//未指定泛型类型
        /*
        Info i = new Info<Object>();//没有意义，但是可以让警告消失
         */
        i.setVar("王五");
        System.out.println("is: "+i.getVar());
    }
}
