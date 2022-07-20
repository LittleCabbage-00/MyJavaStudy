package OOPHighLevel;

public class toString_ {
    public static void main(String[] args) {
        monster monster = new monster("xiao", "look", 100);
        System.out.println(monster.toString()+"\t"+monster.hashCode());
        //输出对象时，默认调用其toString()
        System.out.println(monster);
    }
}
class monster{
    private String name;
    private String job;
    private double sal;

    public monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //override toString()
    //alt+insert-->toString
    @Override
    public String toString() {
        //重写后，一般是把对象属性输出，也可以自己定制
        return "monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}