package Generics.LimitGenerics;
//泛型的下限
class Info_0<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public Info_0(T var) {
        this.var = var;
    }

    public Info_0(){}//加的无参构造

    @Override
    public String toString() {
        return this.var.toString();
    }
}
public class downLimit {
    public static void main(String[] args) {
        Info_0<Object> i1 = new Info_0<Object>();
        Info_0<String> i2 = new Info_0<String>();
        i1.setVar(new Object());
        i2.setVar("王二");
        fun(i1);
        fun(i2);
    }
    public static void fun(Info_0<? super String> temp){
        System.out.println("is: "+temp);
    }
}
