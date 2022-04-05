package com.company;
class circle{
    public double r;
    public double area(){
        return r*r*Math.PI;
    }
    public double peri(){
        return Math.PI*2*r;
    }
}
public class Cl {
    public static void main(String[] args){
        circle c=new circle();
        c.r=5;
        System.out.println(c.area());

    }
}
