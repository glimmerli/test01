package myThread.com.com.it_01;
/*
Thread 类
线程是程序中执行的线程。 Java虚拟机允许应用程序同时执行多个执行线程

 */
public class myThreadDemo {
    public static void main(String[] args) {
        Thread my1 = new myThread();
        myThread my2 = new myThread();
        my2.run();
        my1.run();
    }
}
