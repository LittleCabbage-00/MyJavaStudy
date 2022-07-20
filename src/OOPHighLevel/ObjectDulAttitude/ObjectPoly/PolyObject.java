package OOPHighLevel.ObjectDulAttitude.ObjectPoly;

public class PolyObject {
    public static void main(String[] args) {
        //animal编译类型是Animal，运行类型是Dog
        //animal编译类型是Animal,可以指向（接收）子类的对象
        Animal animal=new Dog();
        //因为运行时，就执行到该行时，animal运行类型是Dog，这个cry就是Dog的cry
        animal.cry();

        //编译类型依然是Animal，运行类型变成了Cat
        animal=new Cat();
        animal.cry();

        animal=new Pig();
        animal.cry();
    }
}
