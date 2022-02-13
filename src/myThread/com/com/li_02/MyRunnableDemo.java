package myThread.com.com.li_02;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
//        Thread t1 = new Thread(mr);
//        Thread t2 = new Thread(mr);
            Thread t1 = new Thread(mr,"高铁");
            Thread t2 = new Thread(mr,"飞机");


        //启用线程
        t1.start();
        t2.start();
    }
}
