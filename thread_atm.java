package com.company;

 class myatm{

    synchronized public void showbalance(String name){
        System.out.println(name+" your balance is accurate");
        try{Thread.sleep(100);}catch(Exception e){}
    }

     synchronized public void withdrawamt(String name,int amt){
        System.out.println("amt withdrawed from "+name+" bank is "+amt);
         try{Thread.sleep(100);}catch(Exception e){}
    }
}

class atm extends Thread{
    myatm a;
    public atm(myatm a){this.a=a;}
    @Override
    public void run() {
    a.showbalance("niranjan");
    a.withdrawamt("niranjan",50);
    }
}

public class thread_atm {
    public static void main(String[]args){
        myatm a=new myatm();
        atm t1=new atm(a);
        t1.start();
        atm t2=new atm(a);
        t2.start();
    }
}
