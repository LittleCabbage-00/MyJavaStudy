package Threads_;
//线程的强制执行，当线程强制运行时，其他线程无法运行，
//需要等待其运行完成之后才可以继续运行
class MyThread05 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"运行 --> "+i);
        }
    }
}
public class Thread_join {
    public static void main(String[] args) {
        MyThread05 my5 = new MyThread05();
        Thread t = new Thread(my5, "线程");
        t.start();
        for (int i = 0; i < 50; i++) {
            if (i>10){
                try {
                    t.join();
                }catch (Exception e){
                }
            }
            System.out.println("main线程运行 --> "+i);
        }
    }
}
