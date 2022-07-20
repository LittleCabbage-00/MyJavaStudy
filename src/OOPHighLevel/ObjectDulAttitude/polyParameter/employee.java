package OOPHighLevel.ObjectDulAttitude.polyParameter;

public class employee {
    private String name;
    private double salary;

    public employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double Annual(){
        return 12*salary;
    }
}
