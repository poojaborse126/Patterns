package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number4 {
	public static void main( String arg[]) throws NumberFormatException, IOException{ 
		BufferedReader br=new BufferedReader(new 
		InputStreamReader(System.in)); 
		        System.out.println("Enter the value for n"); 
		        int n=Integer.parseInt(br.readLine()); 
		        		 int i,j,k; 
		        	        for(i=1;i<=n;i++) 
		        	        {for(j=1;j<=i;j++) 
		        	                System.out.print(j); 
		        	            for(k=i-1;k>=1;k--) 
		        	                System.out.print(k); 
		        	            System.out.println();   } 
		        	        for(i=n-1;i>=1;i--) 
		        	        {for(j=1;j<=i;j++) 
		        	                System.out.print(j); 
		        	            for(k=i-1;k>=1;k--) 
		        	                System.out.print(k); 
		        	            System.out.println(); 
		        	        }    } 
}
