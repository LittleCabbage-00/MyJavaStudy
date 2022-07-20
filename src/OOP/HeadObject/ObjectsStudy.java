package OOP.HeadObject;

    class Person1{
        String name;
        int age;
        public void tell(){
            System.out.println(name+" "+age);
        }
    }
    public class ObjectsStudy {
        public static void main(String[] args){
            Person1 per1;           //声明per1
            Person1 per2;           //声明per2
            per1=new Person1();     //实例化per1
            per2=new Person1();     //实例化per2
            per1.name="Miller";
            per1.age=5;
            per2.name="Mann";
            per2.age=15;
            System.out.print("per1 is: ");
            per1.tell();            //per1调用方法
            System.out.print("per2 is :");
            per2.tell();            //per2调用方法
        }
}
