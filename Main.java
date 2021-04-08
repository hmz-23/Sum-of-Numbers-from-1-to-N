package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,sum = 0;
        System.out.println("Enter the value of n: ");
        n =sc.nextInt();
        for(i=1;i<=n;i++)
            sum = sum + i;
        System.out.println("The sum of numbers from 1 to n: " +sum);
    }
}
