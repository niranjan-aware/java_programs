package com.company;
import java.lang.*;
//class myrunnable implements Runnable{
//    @Override
//    public void run() {
//        int t=3;
//        while(t>0){
//            System.out.println(t+"hello");
//            t--;
//        }
//    }
//}
public class threading_using_runnable implements Runnable{
    @Override
    public void run() {
        int t=3;
        while(t>0){
            System.out.println(t+"Niranjan");
            t--;
        }
    }

    public static void main(String[]args){
         threading_using_runnable m=new threading_using_runnable();
         Thread t=new Thread(m);
         t.start();
        int k=3;
        while(k>0){
            System.out.println(t+"hello");
            k--;
        }
    }
}
