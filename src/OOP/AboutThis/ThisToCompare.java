package OOP.AboutThis;

class Person1{
    private String name;
    private int age;
    public Person1 (String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public boolean compare(Person1 per){
        //调用此方法时里面存在两个对象：当前对象和传入对象
        Person1 p1=this;        //表示当前调用方法的对象，为per1
        Person1 p2=per;         //传递到方法中的对象，为per2
        if (p1==p2){            //比较地址是否一致
            return true;
        }
        if (p1.name.equals(p2.name)&&p1.age==p2.age){
            //比较每一个属性是否一致
            return true;
        }else{
            return false;
        }
    }
    //getter和setter方法
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
}
public class ThisToCompare {
    public static void main(String[] args){
        Person1 per1=new Person1("A",10);
        Person1 per2=new Person1("A",10);
        if(per1.compare(per2)){         //进行对象比较
            System.out.println("equals");
        }
        else{
            System.out.println("not equals");
        }
    }
}
