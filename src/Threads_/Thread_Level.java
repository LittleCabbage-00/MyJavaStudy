package Threads_;
//线程优先级
class MyThread09 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            }catch (Exception e){ }
                System.out.println(Thread.currentThread().getName()+"运行，i = "+i);

        }
    }
}
public class Thread_Level {
    public static void main(String[] args) {
        Thread mt09_1 = new Thread(new MyThread09(), "线程A");
        Thread mt09_2 = new Thread(new MyThread09(), "线程B");
        Thread mt09_3 = new Thread(new MyThread09(), "线程C");
        //mt09_1.setPriority(Thread.MAX_PRIORITY);
        mt09_1.setPriority(10);
        //mt09_2.setPriority(Thread.NORM_PRIORITY);
        mt09_2.setPriority(5);
        //mt09_3.setPriority(Thread.MIN_PRIORITY);
        mt09_3.setPriority(1);
        mt09_1.start();
        mt09_2.start();
        mt09_3.start();
        System.out.println("主方法优先级为："+Thread.currentThread().getPriority());
    }
}
