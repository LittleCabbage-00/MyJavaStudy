package Generics.GenericsMethod;
//使用泛型统一传入的参数类型
class Info_0<T> {
    private T var;

    public T getVar() {
        return var;
    }
    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.var.toString();
    }
}
public class GenericsEnterClass {
    public static void main(String[] args) {
        Info_0<String> i1 = new Info_0<String>();
        Info_0<String> i2 = new Info_0<String>();
        i1.setVar("Hello");
        i2.setVar("someone");
        add(i1, i2);
    }
    public static <T> void add(Info_0<T> i1, Info_0<T> i2) {
        System.out.println(i1.getVar()+" "+i2.getVar());
    }
}
