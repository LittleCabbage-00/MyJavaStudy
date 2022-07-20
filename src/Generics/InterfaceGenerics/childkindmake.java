package Generics.InterfaceGenerics;
//泛型接口 在子类定义上声明类型
interface Info<T>{
    public T getVar();
}
class InfoImpl<T> implements Info<T>{
    private T var;

    @Override
    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public InfoImpl(T var) {
        this.var = var;
    }
}
public class childkindmake {
    public static void main(String[] args) {
        InfoImpl<String> i = new InfoImpl<>("小明");
        System.out.println(i.getVar());
    }
}
