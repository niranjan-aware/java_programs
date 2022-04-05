package com.company;
class car{
    public void accelerate(){
        System.out.println("CAR is accelerated");
    }
    public void change_gear(){
        System.out.println("Gear is changed");
    }
}

class luxary_car extends car{
    public void openroof(){
        System.out.println("Roof is opened");
    }
    public void closemirror(){
        System.out.println("Mirror is closed");
    }
}

public class override_car {
    public static void main(String[]args){
         car c=new luxary_car();
         c.accelerate();
         c.change_gear();
//         c.operoof();     here when we take reference of parent class for child class then we can methods use only from parrent class
//         c.closemirror();
    }
}
