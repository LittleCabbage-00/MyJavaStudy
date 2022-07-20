package Generics;

//泛型的嵌套
class Info<T,V>{
    private T var;
    private V value;
    public Info(T var, V value){
        this.setVar(var);
        this.setValue(value);
    }
    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
class Demo01<S> {
    private S info;

    public Demo01(S info) {
        this.setInfo(info);
    }

    public S getInfo() {
        return info;
    }

    public void setInfo(S info) {
        this.info = info;

    }
}
public class classInclass {
    public static void main(String[] args) {
        Demo01<Info<String,Integer>> d=null;
        Info<String,Integer> i=null;
        i=new Info<String,Integer>("hello",1);
        d=new Demo01<Info<String,Integer>>(i);
        System.out.println("内容1："+d.getInfo().getVar());
        System.out.println("内容2："+d.getInfo().getValue());
    }
    }
