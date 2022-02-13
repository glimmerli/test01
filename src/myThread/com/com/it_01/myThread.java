package myThread.com.com.it_01;

public class myThread extends Thread {
        public void run(){
            for(int i=0;i<100;i++){
                System.out.println(i);
            }
        }
}
