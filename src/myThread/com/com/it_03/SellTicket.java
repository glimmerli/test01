package myThread.com.com.it_03;

public class SellTicket implements Runnable{
   private int tickets=100;
   private  Object obj=new Object(); //Object 表示任意对象
    @Override
    public void run() {
        while (true){
            synchronized (obj){ //同步代码块synchronized()
            if(tickets>0){
                //相同的票买了多次

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售卖第"+ tickets +"票");

                    tickets--;
                }
            }
        }
    }
}
