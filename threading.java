package com.company;
import java.lang.*;
//class mythread extends Thread{
//    @Override
//    public void run() {
//        int t=3;
//        while(t>0){
//            System.out.println(t+"hello");
//            t--;
//        }
//
//    }
//}
public class threading extends Thread{
//    public threading extends {}

    @Override
    public void run() {
        int t=3;
        while(t>0){
            System.out.println(t+"hello");
            t--;
        }
    }

    public static void main(String[]args){
        threading m=new threading();
        m.start();
        int t=3;
        while(t>0){
            System.out.println(t+"Niranjan");
            t--;
        }
    }
}
