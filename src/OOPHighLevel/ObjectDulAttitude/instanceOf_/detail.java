package OOPHighLevel.ObjectDulAttitude.instanceOf_;

public class detail {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        AA aa=new BB();
        System.out.println(aa instanceof AA);
    }
}
class AA{ }
class BB extends AA{ }
