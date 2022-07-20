package Threads_;
//线程的后台执行
class MyThread08 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"在运行。");
        }
    }
}
public class Thread_Daemon {
    public static void main(String[] args) {
        MyThread08 mt8 = new MyThread08();
        Thread t8 = new Thread(mt8, "线程");
        t8.setDaemon(true);
        t8.start();
        t8.interrupt();
    }
}
