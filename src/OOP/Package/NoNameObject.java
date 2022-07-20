package OOP.Package;

//匿名对象
class Person6{
    private String name;
    private int age;
    public Person6(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public void tell(){
        System.out.println(getName()+" "+getAge());
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int i){
        if(i>0&&i<150)
            age=i;
    }
}
public class NoNameObject {
    public static void main(String[] args){
        new Person6("Jack",20).tell();//匿名对象
        //匿名对象就是一个堆内存空间，对象不管是否匿名
        //都必须在开辟堆内存空间之后才可以使用
    }
}
