package Generics.Basical;

//通配符
public class Generics_wildcard {
    public static void main(String[] args) {
        Info<String> i = new Info<>();
        i.setVar("赵六");
        fun(i);
    }
    public static void fun(Info<?> temp){//通配符只能在使用时用，定义时不可使用
        System.out.println("is: "+temp);
    }
}
