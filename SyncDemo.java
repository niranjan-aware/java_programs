package com.company;
class MyData
{
   static int sum=0;
    synchronized public int sum(int a,int b)
    {
        sum=a+b;
      return a+b;
    }
}

class MyThread1 extends Thread
{
    MyData d;
    public MyThread1(MyData d)
    {
        this.d=d;
    }

    public void run()
    {
        System.out.println(d.sum(10,20));
     //  d.sum=
    }


}

class MyThread2 extends Thread
{
    MyData d;
    public MyThread2(MyData d)
    {
        this.d=d;
    }

    public void run()
    {
        System.out.println("kjhhgk"+d.sum);
       d.sum= d.sum(d.sum,30);
        System.out.println("kjhhgk"+d.sum);
    }


}

public class SyncDemo
{
    public static void main(String[] args)
    {
        MyData data=new MyData();

        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);

        t1.start();
        t2.start();
        long start = System.currentTimeMillis();
        long end = start + 3*1000;
        while (System.currentTimeMillis() < end) {
            // Some expensive operation on the item.
        }
        System.out.println(data.sum);


    }
}
