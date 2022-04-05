package com.company;

public class Exeption_Handling {
    public static void main(String[] args){
        //  TRY - CATCH in this method write code which can occur an error and writ thing which works after catching
        int marks[]={1,3,2,4,5};
        try{
            System.out.println(marks[9]);
        }
        catch(Exception exeption){
            System.out.println("error occured");
        }
        System.out.println("hey Niranjan");
    }
}
