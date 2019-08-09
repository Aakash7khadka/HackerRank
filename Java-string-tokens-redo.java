import java.io.*;
import java.util.*;

public class hack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s=s.trim();
        if(s.length()==0)
        {
            System.out.println(0);
            return;
        }
        
        String[] sp=s.split("[^a-zA-Z]+");//rather than using individual delimiters this method is efficient
        
        
          System.out.println(sp.length);
        for(String ss: sp)
  
            System.out.println(ss);
    
    }
}

