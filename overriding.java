
package com.company;
//
class tv{
    public void change_channel(){
        System.out.println("TV Channel is changed");
    }
    public void switch_on(){
        System.out.println("TV is switched ON");
    }
}

class smart_tv extends tv{
    @Override
    public void change_channel(){
        System.out.println("SMART TV Channel is changed");
    }
    public void switch_on(){
        System.out.println("SMART TV is switched ON");
    }
}

public class overriding {
    public static void main(String[] args){
//        tv t=new tv();
//        t.change_channel();
//        t.switch_on();
//        smart_tv t1=new smart_tv();
//        t1.change_channel();
//        t1.switch_on();

        tv t2=new smart_tv();
        t2.change_channel();
        t2.switch_on();
    }
}
