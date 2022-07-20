package OOPHighLevel.Debug_;

public class practice01 {
    public static void main(String[] args) {
        person jack=new person("jack",10);
        System.out.println(jack);
    }
}
class person{
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
