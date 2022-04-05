package com.company;
class students_result{
    private String name;
    private int m1,m2,m3;
    public void set_marks(int m1,int m2,int m3){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    public void set_name(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int get_avg_marks(){
        return m1+m2+m3;
    }

}
public class Student_Result {
    public static void main(String[] args){
        students_result s=new students_result();
        s.set_marks(99,96,97);
        s.set_name("NIRANJAN");
        System.out.println(s.getName());
        System.out.println(s.get_avg_marks());
    }
}
