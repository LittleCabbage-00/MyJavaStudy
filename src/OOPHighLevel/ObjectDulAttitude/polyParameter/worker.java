package OOPHighLevel.ObjectDulAttitude.polyParameter;

public class worker extends employee{
    public worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("worker "+getName()+" is working....");
    }

    @Override
    public double Annual() {
        return super.Annual();
    }
}
