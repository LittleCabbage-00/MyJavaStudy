package OOP.HeadObject;

    class Person{
        String name;    //声明name属性
        int age;        //声明年龄属性

    public void tell(){ //输出信息的方法
        System.out.println(name+" "+age);
    }
}
    public class ObjectStudy {
        public static void main(String[] args){
            Person per=new Person();//此处不能是null，否则对象会未实例化，报错
            per.name="2";
            per.age=30;
            per.tell(); //调用类里面输出信息的方法
        }
}
