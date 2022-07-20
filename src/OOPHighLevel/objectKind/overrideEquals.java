package OOPHighLevel.objectKind;

public class overrideEquals {
    public static void main(String[] args) {
        person person1 = new person("A", 20, '1');
        person person2 = new person("A", 20, '1');
        System.out.println(person1.equals(person2));
    }
}
class person{
    private String name;
    private int age;
    private char gender;

    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }else if(obj instanceof person){
            person p=(person) obj;
            return this.name.equals(p.name)&&this.age==p.age&&this.gender==p.gender;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}