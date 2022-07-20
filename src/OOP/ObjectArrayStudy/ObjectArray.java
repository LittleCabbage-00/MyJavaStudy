package OOP.ObjectArrayStudy;
//对象数组，就是用创造的对象去声明数组

class Person0{
    private String name;
    public Person0 (String name){       //通过构造方法设置内容
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
public class ObjectArray {
    public static void fenge(int x){
        System.out.println("");
        for(int i=0;i<x;i++){
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Person0 per0[]=new Person0[4];
        //对象数组初始化之前，每个元素都是默认值
        System.out.println("未初始化：");
        for(int i=0;i<per0.length;i++){
            System.out.print(per0[i]+"、");
        }
        //为数组里面的每个元素初始化，每一个都是对象，需要单独实例化
        per0[0]=new Person0("A");
        per0[1]=new Person0("B");
        per0[2]=new Person0("C");
        per0[3]=new Person0("D");
        fenge(20);
        System.out.println("动态初始化：");
        for(int i=0;i<per0.length;i++){
            System.out.print(per0[i].getName()+"、");
        }
        //动态初始化，下面是静态初始化
        fenge(30);
        //声明一个对象数组，里面3个对象，使用静态初始化
        Person0[] per={new Person0("Alpha"),new Person0("Beta"),new Person0("Gamma")};
        System.out.println("静态初始化：");
        for(int i=0;i<per.length;i++){
            System.out.print(per[i].getName()+"、");
        }
    }
}
