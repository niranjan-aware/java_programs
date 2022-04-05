package com.company;
interface test{
    void meth1();
    void meth2();
}

class test2 implements test{
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
    void meth3(){
        System.out.println("meth 3");
    }
}

public class Interfaces {
    public static void main(String[] args){
        test t=new test2();
        t.meth1();
        t.meth2();
    }
}
