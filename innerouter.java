package com.company;
class outer{
    int x=5;
    class inner{
        int y=10;
        void inner_display(){
            System.out.println(x+" "+y);
        }
    }
    void outer_display(){
        inner i=new inner();
        i.inner_display();
        System.out.println(i.y);
        System.out.println(x);//we can call directly y*****
    }

}
public class innerouter {
    public static void main(String[]args){
         outer.inner oi=new outer().new inner();
         oi.inner_display();
    }
}
