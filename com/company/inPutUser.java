package com.company;
import java.util.Scanner;

public class inPutUser {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter your username");
        String username = s.nextLine();
        System.out.println(username);

        inPutUser a = new inPutUser();
        System.out.println(a.fibonnaci(1));

    }
    public int fibonnaci(int n){
        if (n == 1){
           System.out.println("Number is one");
        }
        return n;
    }
}
