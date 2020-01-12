package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner((System.in));
        System.out.print("Enter height: ");
        int n = in.nextInt();
        System.out.print("Enter width: ");
        int m = in.nextInt();
        int k = 1;
        for(int i = 1; i <= n; i++) {
            if (k == 0){
                k++;
                System.out.print(" ");
            }
            else k = 0;
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
