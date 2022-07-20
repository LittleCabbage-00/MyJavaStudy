package Generics.GenericsMethod;
//通过泛型方法返回泛型类实例
class Info<T extends Number>{
    private T var;
    public Info(T var){
        this.var = var;
    }

    @Override
    public String toString() {
        return this.var.toString();
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
public class ReturnGenericsKind {
    public static void main(String[] args) {
        Info<Integer> i=fun(30);
        System.out.println(i.getVar());
    }
    public static <T extends Number> Info<T> fun(T t){
        /*
        此处的<T extends Number>是泛型类型
        方法中传入或返回的泛型类型由所设置的参数类型决定
         */
        Info<T> temp = new Info<T>(t);
        temp.setVar(t);
        return temp;
    }
}
