package OOPHighLevel.ObjectDulAttitude.Detail;
//在编译阶段能调用哪些成员由编译类型决定，也就是类实例化的左半部分决定
public class PolyDetail {
    public static void main(String[] args) {
        Animal animal=new Cat();
//        animal.catchMouse();
        //运行时，调用方法为：从子类（运行类型）查找方法，然后调用，没有就找父类，一直找到object类
        //具体效果看子类（运行类型）的效果
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        //向下转型
        //语法：子类类型 引用名 = （子类类型）父类引用
        Cat cat=(Cat)animal;
        //此处编译类型是Cat，运行类型也是Cat
        cat.catchMouse();

        //要求父类的引用必须指向当前目标类型的对象
        //Dog dog=(Dog)animal;---->类转换异常

        System.out.println("ok~");
    }
}
