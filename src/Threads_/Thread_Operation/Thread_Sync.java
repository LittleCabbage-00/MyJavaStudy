package Threads_.Thread_Operation;
//线程同步synchronized
class MyThread03 implements Runnable{
    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            this.sale();
        }
    }
    public synchronized void sale(){
        if (ticket>0){
            try {
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("卖票：ticket = "+ticket--);
        }
    }
}
public class Thread_Sync {
    public static void main(String[] args) {
        MyThread03 mt3 = new MyThread03();
        Thread t1 = new Thread(mt3);
        Thread t2 = new Thread(mt3);
        Thread t3 = new Thread(mt3);
        t1.start();
        t2.start();
        t3.start();
    }
}
