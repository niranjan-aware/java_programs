package com.company;

class overflow extends Exception{
     public String toString(){
         return "stack is overflow";
     }
}

class underflow extends Exception{
    public String toString(){
        return "stack is underflow";
    }
}

class stack{
    private int size;
    private int top=-1;
    private int t[];
    public stack(int sz){
        size=sz;
        t=new int[sz];
    }
    public void push(int x)throws overflow{
        if(top==t[size-1]){
            throw new overflow();
        }
        top++;
        t[top]=x;
    }
    public int pop()throws underflow{
        int x=0;
        if(top==-1){
            throw new underflow();
        }
        x=t[top];
        top--;
        return x;
    }
}

public class stack_exception {
    public static void main(String[]args){
         stack st=new stack(3);
         try{
             st.push(1);
             st.push(2);
             st.push(3);
             st.push(4);
         }
         catch (overflow e){
             System.out.println(e);
         }

    }
}
