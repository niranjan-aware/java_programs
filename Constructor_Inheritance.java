package com.company;
class rectangle{
     int length,breadth,x=99;
    rectangle(){
        length=breadth=1;
    }
    rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
     int area(){
        return length * breadth;
    }
}

class cuboid extends rectangle{
    int h,x=120;
    cuboid(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
    int volume(){
        return area()*h;
    }
    void display(){
        System.out.println(x);
        System.out.println(super.x);
    }
}

public class Constructor_Inheritance {
    public static void main(String[] args){
       cuboid c=new cuboid(2,2,2);
        System.out.println(c.volume());
        c.display();
    }
}
