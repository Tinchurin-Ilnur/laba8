package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ip-address");
        String input = in.nextLine();

        boolean result=input.matches("(((1[0-9][0-9])|(2[0-5][0-5]))\\.){3}((1[0-9][0-9])|(2[0-5][0-5]))");
        if(result) {
            System.out.println("OK");
        }
        else{
            System.out.println("Error");
        }
    }
}
