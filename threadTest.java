package com.company;
class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        int t=5;
        while(t>0){
            System.out.println("hello");
            t--;
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class threadTest {
    public static void main(String[]args){
        mythread m=new mythread("niranjan");
        m.start();
        m.interrupt();
        System.out.println(m.getName());
        System.out.println(m.getId());
        System.out.println(m.getState());
        System.out.println(m.getPriority());
        System.out.println(m.isAlive());

    }
}
