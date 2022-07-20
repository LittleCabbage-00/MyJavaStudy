package OOP.Package;

//直接构造方法实现赋值
class Person5{
    private String name;
    private int age;
    public Person5(String name, int age){    //定义构造方法初始化
        this.setName(name);                 //与下面那个同为赋值，值特指是这个class里面的
        this.setAge(age);
    }
    public Person5(String name){            //定义第二个构造方法
        this.setName(name);
    }
    public void tell(){
        System.out.println(name+" "+age);
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int i){
        if(i>0&&i<150)                      //验证值是否合理
        age =i;
    }
}
public class MakeMethodToValue {
    public static void main(String[] args){
        Person5 per=new Person5("Jack",20);//调用构造方法，传递2个参数
        per.tell();
        Person5 ber=new Person5("Tom");//构造方法重载
        ber.tell();
    }
}
