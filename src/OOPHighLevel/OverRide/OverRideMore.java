package OOPHighLevel.OverRide;
//方法覆写进阶
class Person3{
    private void print(){
        System.out.println("Person-->private print()");
    }
    public void fun(){
        this.print();
    }
}
class Student3 extends Person3{
    void print(){
        System.out.println("Student-->void print()");
    }
}

public class OverRideMore {
    public static void main(String[] args){
        new Student3().fun();
    }
    //此处调用的是父类的方法，子类的print并没有覆写父类的print
    //而是直接重新定义了一个print方法
}
//如果子类和父类声明了相同名称的属性，则在子类中直接访问时一定是采用“就近访问原则”
//即先找到本类中的属性，如果此时要调用父类中的属性
//直接使用“super.属性”格式即可
/*
* 父类定义string info=xxxx;
* 子类调用就是super.info;
**/