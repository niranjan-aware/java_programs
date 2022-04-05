package com.company;
import java.util.Scanner;

public class String_Func {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name="Niranjan";
        System.out.println(name.length());//length
        System.out.println(name+" and "+name);
        System.out.println(name.charAt(0));//character at index
        //replacing char in string
//        String name2 = name.replace(oldChar: 'N',newChar: 'H');
//        System.out.println(name2);
        System.out.println(name.substring(2,5));

    }
}
