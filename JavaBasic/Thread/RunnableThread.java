package thread;

class MyThread implements Runnable{
    public void run(){
        int i=0;
        while(i<=100){
            System.out.println("I am thread 1");
            i++;
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<=100){
            System.out.println("I am thread 2");
            i++;
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        MyThread bullet = new MyThread();
        Thread gun1 = new Thread(bullet);
        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
