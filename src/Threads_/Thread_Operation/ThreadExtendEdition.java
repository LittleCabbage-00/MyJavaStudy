package Threads_.Thread_Operation;
//线程操作范例，继承Thread版本
class MyThread01 extends Thread{
    private int time;
    public MyThread01(String name, int time) {
        super(name);
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"线程，休眠"+this.time+"毫秒");
    }
}
public class ThreadExtendEdition {
    public static void main(String[] args) {
        MyThread01 mt01 = new MyThread01("线程A", 1000);
        MyThread01 mt02 = new MyThread01("线程B", 2000);
        MyThread01 mt03 = new MyThread01("线程C", 3000);
        mt01.start();
        mt02.start();
        mt03.start();
    }
}
