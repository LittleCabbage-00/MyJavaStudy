package Threads_;

class MyThread01 implements Runnable{
    private String name;

    public MyThread01(String name) {
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name+"运行，i = "+i);
        }
    }
}
public class Runnable_ {
    public static void main(String[] args) {
        MyThread01 my1 = new MyThread01("线程A ");
        MyThread01 my2 = new MyThread01("线程B ");
        Thread t1 = new Thread(my1);
        Thread t2 = new Thread(my2);
        t1.start();
        t2.start();
    }
}
