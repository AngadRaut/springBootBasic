package com.example.account_details_crud_operations;


class ConClass{

    private int a;
    private String name;
   public ConClass(int k, String userName){
       a=k;
       name=userName;
   }
   public void show(){
       System.out.println(a+" "+name);
   }
}

public class Mian {
    public static void main(String [] args){
        ConClass obj =new ConClass(101,"bahir");
        obj.show();
    }


}
