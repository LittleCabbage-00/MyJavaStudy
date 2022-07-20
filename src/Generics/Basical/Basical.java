package Generics.Basical;
//泛型的基本应用
public class Basical {
    public static void main(String[] args) {
        Point<Integer> p=new Point<Integer>();
        p.setVar(30);
        System.out.println(p.getVar()*2);

        Point<String> b=new Point<String>();
        b.setVar("张三");
        System.out.println(b.getVar());
    }
}
class Point<T>{
    private T var;
    public T getVar(){
        return var;
    }
    public void setVar(T var){
        this.var=var;
    }
}
