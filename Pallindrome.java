import java.io.*;
import java.util.*;

public class hack {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
		/*It is one of the easy way to reverse
		 * StringBuilder s=new StringBuilder(A); System.out.println(s.reverse());
		 */
        String rev="";
        int i=0;
        while(i<A.length())
        {
        	rev=A.charAt(i)+rev;
        	i++;
        }
        if(A.equals(rev))
        	System.out.println("Yes");
        else
        	System.out.println("No");
        
    }
}



