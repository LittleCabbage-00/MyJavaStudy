package Generics.InterfaceGenerics;
//在接口中指定具体类型
interface Info_0<T>{
    public T getVar();
}
class Interimpl_0 implements Info_0<String>{
    private String var;

    public Interimpl_0(String var) {
        this.setVar(var);
    }

    @Override
    public String getVar() {
        return this.var;
    }

    public void setVar(String var) {
        this.var = var;
    }
}
public class Interfacemakekind {
    public static void main(String[] args) {
        Interimpl_0 i = new Interimpl_0("立本");
        System.out.println(i.getVar());
    }
}
