package com.company;
class testz extends Thread{
    @Override
    public void run() {
        int t=100;
        while(t>0){
            System.out.println(t+"thread");
            t--;
        }
    }
}
public class threadTest2 {
    public static void main(String[]args){
        testz m=new testz();
        m.start();
        //m.setDaemon(); this is use when u want to terminate your thread when your main terminates===use it 
        Thread.yield();
        int k=100;
        while(k>0){
            System.out.println(k+"main");
            k--;
        }

    }
}
