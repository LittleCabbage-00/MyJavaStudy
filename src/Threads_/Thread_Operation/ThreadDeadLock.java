package Threads_.Thread_Operation;
//进程死锁，多个线程共享同一资源的时候就需要进行同步
//以保证资源操作的完整性，过多的同步就会造成死锁
class ZhangSan{
    public void say(){
        System.out.println("张三对李四说：“你给我画，我就把书给你”。");
    }
    public void get(){
        System.out.println("张三得到画了。");
    }
}
class LiSi{
    public void say(){
        System.out.println("李四对张三说：“你给我画，我就把书给你”。");
    }
    public void get(){
        System.out.println("李四得到画了。");
    }
}
public class ThreadDeadLock implements Runnable{
    private static ZhangSan zs=new ZhangSan();
    private static LiSi ls=new LiSi();
    private boolean flag=false;

    @Override
    public void run() {
        if (flag){
            synchronized (zs){
                zs.say();
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (ls){
                    zs.get();
                }
            }
        }else {
            synchronized (ls){
                ls.say();
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (zs){
                    ls.get();
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadDeadLock t1 = new ThreadDeadLock();
        ThreadDeadLock t2 = new ThreadDeadLock();
        t1.flag=true;
        t2.flag=false;
        Thread thA = new Thread(t1);
        Thread thB = new Thread(t2);
        thA.start();
        thB.start();
    }
}
