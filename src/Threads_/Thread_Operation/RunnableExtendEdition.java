package Threads_.Thread_Operation;
//Runnable版本
class MyThread02 implements Runnable{
    private String name;
    private int time;

    public MyThread02(String name, int time) {
        this.name = name;
        this.time = time;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(this.time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.name+"线程，休眠"+this.time+"毫秒");
    }
}
public class RunnableExtendEdition {
    public static void main(String[] args) {
        MyThread02 mt1 = new MyThread02("线程A", 1000);
        MyThread02 mt2 = new MyThread02("线程B", 2000);
        MyThread02 mt3 = new MyThread02("线程C", 3000);
        new Thread(mt1).start();
        new Thread(mt2).start();
        new Thread(mt3).start();
    }
}
