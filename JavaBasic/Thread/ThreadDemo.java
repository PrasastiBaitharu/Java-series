package thread; 

class MyThread extends Thread{
    @Override
    public void run(){
        int i=1;
        while (i<=100) {
            System.out.println("I am child thread 1");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=1;
        while (i<=100) {
            System.out.println("I am child thread 2");
            i++;
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread2 t2 = new MyThread2();        
        System.out.println("I am the main thread");
        t.start();
        t2.start();
    }
}
