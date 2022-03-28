package com.company;
import java.util.Scanner;
public class Even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int a = sc.nextInt();
        if (a%2==0)
            System.out.println("The no is Even");
        else{
            System.out.println("The no is odd ");
        }

    }
}
