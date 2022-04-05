package com.company;
class student{
    private int mark1;
    private String sub_name;
    public void set_mark1(int m){
        if(m>0){
            mark1=m;
        }
        else{
            mark1=1;
        }
    }
    public int get_mark1(){
        return mark1;
    }
}
public class Student_marks {
    public static void main(String[] args){
         student s=new student();
         s.set_mark1(10);
        System.out.println(s.get_mark1());
    }
}
