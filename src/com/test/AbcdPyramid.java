package com.test;

import java.util.Scanner;

public class AbcdPyramid {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = sc.nextInt(); // Read the number of rows for the upper half
        
        // 1. Upper Triangle (Pyramid)
        for (int i = 1; i <= n; i++) {
            // Logic to print leading spaces for proper alignment
            for (int spc = n - i; spc > 0; spc--) {
                System.out.print(" ");
            }
            
            // Logic to print characters (e.g., A, ABA, ABCBA)
            char c = 'A';
            int totalChars = (i * 2) - 1; // Calculate total characters per row
            for (int j = 1; j <= totalChars; j++) {
                System.out.print(c);
                // Increment character up to the midpoint, then decrement
                if (j <= totalChars / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            System.out.println(); // Move to the next line
        }
        
        // 2. Lower Triangle (Inverted Pyramid to complete the rhombus)
        for (int i = n - 1; i >= 1; i--) {
            // Logic to print leading spaces
            for (int spc = n - i; spc > 0; spc--) {
                System.out.print(" ");
            }
            
            // Logic to print characters for the lower half
            char c = 'A';
            int totalChars = (i * 2) - 1;
            for (int j = 1; j <= totalChars; j++) {
                System.out.print(c);
                // Increment character up to the midpoint, then decrement
                if (j <= totalChars / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}