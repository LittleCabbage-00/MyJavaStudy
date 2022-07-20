package OOPHighLevel.hashcode_;

public class HashCode {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa1 = new AA();
        AA aa2=aa;
        System.out.println(aa.hashCode()+"\t"+aa1.hashCode()+"\t"+aa2.hashCode());
    }
}
class AA{

}