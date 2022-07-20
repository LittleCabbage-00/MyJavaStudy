package OOP.Package;

class Person3{
    private String name;        //声明name属性
    private int age;            //声明age属性
    public void tell(){
        System.out.println(name+" "+age);
    }
    public String getName(){    //取得name
        return name;
    }
    public void setName(String n){//设置name的值
        name =n;
    }
    public int getAge(){        //取得age
        return age;
    }
    public void setAge(int a){  //设置age的值
        //if(a>=0&&a<=150)
        age=a;
    }
}
//private是用来封装的，由setter（设置值）和getter（获取值）取得值
//否则不允许调用，所以可以在setter方法处对age进行检查（也就是if判断）
//如果通过，就输出设定值，未通过就不会把值附给age，直接输出0
public class SetterAndGetter {
    public static void main(String[] args){
        Person3 per=new Person3();
        per.setName("Amy");
        per.setAge(200);
        per.tell();
    }
}
