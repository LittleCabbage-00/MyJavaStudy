package OOPHighLevel.ObjectDulAttitude.polyParameter;

public class polyParameter {
    public static void main(String[] args) {
        worker amy = new worker("Amy", 1000);
        polyParameter polyParameter = new polyParameter();
        polyParameter.showEmpAnnual(amy);
        polyParameter.work(amy);
        manager bob = new manager("Bob", 5000, 30000);
        polyParameter.showEmpAnnual(bob);
        polyParameter.work(bob);
    }
    public void showEmpAnnual(employee e){
        System.out.println(e.Annual());
    }
    public void work(employee e){
        if (e instanceof worker){
           ((worker) e).work();
        }else if(e instanceof manager){
            ((manager) e).manager();
        }else{
            System.out.println("error!");
        }
    }
}
