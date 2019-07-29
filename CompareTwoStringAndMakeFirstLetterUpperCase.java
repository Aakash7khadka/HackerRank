//program to compare two string and print them making the first letter as 
//uppercase

import java.io.*;
import java.util.*;

public class hack {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String c=A.concat(B);
        System.out.println(c.length());
        if(A.compareToIgnoreCase(B)>0)
        	
        {
        	System.out.println("Yes");
        	
        }
        else
        	System.out.println("No");
        A=A.substring(0, 1).toUpperCase()+A.substring(1);
        B=B.substring(0, 1).toUpperCase()+B.substring(1);
        System.out.println(A);
        System.out.println(B);
        
        
    }
}



