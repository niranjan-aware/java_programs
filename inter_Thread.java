package com.company;

class Mydata1{
    int value=0;
    boolean flag=true;
    synchronized public void setval(int v){
        while(flag!=true){
           try{ wait();}catch(Exception e){}
            value=v;
            flag=false;
            notify();
        }
                System.out.println(" prudced value: "+value);
    }
    synchronized public int getval(){
        int x = 0;
        while(flag!=false){
            try{ wait();}catch(Exception e){}

            x=value;
            flag=true;
            notify();
        }
        return x;
    }
}

class producer extends Thread{
    Mydata1 data;
    public void producer(Mydata1 data){
        this.data=data;
    }

    @Override
    public void run() {
        int t=5;
        int i=1;
        while(t>0){;
            data.setval(i);
            i++;
            t--;
        }
    }
}

class consumer extends Thread{
    Mydata1 data;
    public void consumer(Mydata1 data){
        this.data=data;
    }

    @Override
    public void run() {
        int k=5;
        while(k>0) {
            int y = data.getval();
            System.out.println(" value for Consumer: " + y);
            k--;
        }
    }
}

public class inter_Thread {
    public static void main(String[]args){
        Mydata1 data=new Mydata1();
        producer p=new producer();
        p.producer(data);
        p.start();
        consumer c=new consumer();
        c.consumer(data);
        c.start();
    }
}
//class MyData1
//{
//    int value;
//    boolean flag=true;
//
//    synchronized public void set(int v)
//    {
//        while(flag!=true)
//            try {wait();}catch(Exception e){}
//
//        value=v;
//        flag=false;
//        notify();
//    }
//
//    synchronized public int get()
//    {
//        int x=0;
//        while(flag!=false)
//            try {wait();}catch(Exception e){}
//
//
//        x=value;
//        flag=true;
//        notify();
//
//        return x;
//    }
//}
//
//class Producer extends Thread
//{
//    MyData1 data;
//
//    public Producer(MyData1 d)
//    {
//        data=d;
//    }
//    public void run()
//    {
//        int count=1;
//        while(true)
//        {
//            data.set(count);
//            System.out.println("Producer "+count);
//            count++;
//        }
//    }
//}
//
//class Consumer extends Thread
//{
//    MyData1 data;
//
//    public Consumer(MyData1 d)
//    {
//        data=d;
//    }
//    public void run()
//    {
//        int value;
//        while(true)
//        {
//            value=data.get();
//            System.out.println("Consumer "+value);
//        }
//    }
//}
//
//public class inter_Thread
//{
//    public static void main(String[] args)
//    {
//        MyData1 data=new MyData1();
//
//        Producer p=new Producer(data);
//        Consumer c=new Consumer(data);
//
//        p.start();
//        c.start();
//
//    }
//}