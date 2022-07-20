package JavaOftenUseClassPark;
//对象克隆
public class ObjectCloneClass {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("张三");
        Person p2=(Person) p1.clone();
        p2.setName("李四");
        System.out.println(p1);
        System.out.println(p2);
    }
}
class Person implements Cloneable{
    private String name=null;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "姓名： "+this.getName();
    }
}
