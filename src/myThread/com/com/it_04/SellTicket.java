package myThread.com.com.it_04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable{
   private int tickets=100;
    private Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {   //try  finally 块进行锁
                lock.lock();
                if (tickets > 0) {
                    //相同的票买了多次
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售卖第" + tickets + "票");

                    tickets--;
                }
            }finally {
                lock.unlock();
            }

        }
    }
}
