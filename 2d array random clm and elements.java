/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/* package whatever; // don't place package name! */

//import java.util.*;
//import java.lang.*;
//import java.io.*;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main
{

	public static void main (String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int max=7;
		int min=2;
		int rand_clm=	(int)(Math.random() * ((max - min) + 1)) + min;
     	int [][] a=new int [5][rand_clm];
         max=20;
		 min=11;
     	for(int i=0;i<5;i++)
     	{
     	    for(int j=0;j<rand_clm;j++)
     	    {
     
	      	a[i][j]=(int)(Math.random() * ((max - min) + 1)) + min;
	      
     	    }
     	    
     	}
	   
	   for(int i=0;i<5;i++)
       {
	    int sum=0;
	    for(int j=0;j<rand_clm;j++)
	    {
	        sum+=a[i][j];
	        
	    }
	   System.out.println(sum);
    	}
	}
}