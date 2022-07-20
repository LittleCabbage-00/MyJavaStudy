package Generics.Basical;

//泛型的安全警告
public class Info<T> {
    private T var;

    public Info() {
        this.var = var;
    }

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
