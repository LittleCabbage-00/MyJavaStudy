package OOPHighLevel.ObjectDulAttitude.polyParameter;

public class manager extends employee{
    private double bonus;

    public manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void manager(){
        System.out.println("manager "+getName()+" is controlling....");
    }

    @Override
    public double Annual() {
        return super.Annual()+bonus;
    }
}
