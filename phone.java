package com.company;
class Pshone{
      public void call(){
          System.out.println("making calls");
      }
      public void sms(){
          System.out.println("sending sms");
      }
}

interface Camera{
    void click();
    void shoot();
}

interface Music{
    void play();
    void stop();
}

class SmartPhone extends Pshone implements Camera,Music{
    public  void video_call(){
        System.out.println("VC calling");
    }


    public void play() {
        System.out.println("playing song");
    }


    public void stop() {
        System.out.println("stopping music");
    }


    public void click() {
        System.out.println("clicking photo");
    }


    public void shoot() {
        System.out.println("shooting video");
    }
}

public class phone {
    public static void main(String[] args){
        Camera p=new SmartPhone();
        p.click();
    }
}
