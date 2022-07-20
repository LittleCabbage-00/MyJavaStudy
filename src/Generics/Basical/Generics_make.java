package Generics.Basical;

class Point0<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public Point0(T var){
        this.var=var;
    }
}

public class Generics_make {
    public static void main(String[] args) {
        //Point0<String> p=null;
        Point0<String> p = new Point0<>("张三");
        System.out.println("is: "+p.getVar());
    }
}
