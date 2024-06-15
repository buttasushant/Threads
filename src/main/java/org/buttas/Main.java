package org.buttas;

class MyThread1 extends Thread{
    public void run(){
      //  while(true){
        System.out.println("Good Morning!!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
      //  }
    }
}

class MyThread2 extends Thread{
    public void run(){
       // while(true){
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
       // }
    }
}

public class Main {
    public static void main(String[] args)  {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setPriority(1);
        t1.setPriority(5);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();

       // t1.wait();

        System.out.println(t1.getState());

    }
}