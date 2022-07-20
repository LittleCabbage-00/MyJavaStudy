package Threads_;

class MyThread extends Thread{
    private String name;

    public MyThread(String name) {
        this.name = name;
    }
    public void run(){      //覆写thread里面的run
        for (int i = 0; i < 10; i++) {
            System.out.println(name+"运行，i = "+i);
        }
    }
}
public class About {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A ");
        MyThread mt2 = new MyThread("线程B ");
//        mt1.run();
//        mt2.run();
        mt1.start();
        mt2.start();
    }
}
