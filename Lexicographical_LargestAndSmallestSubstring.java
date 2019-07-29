//Lexicographical largest and smallest substring
import java.util.Scanner;

public class hack {

   public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int len=s.length();
        int i=0;
        String sub="";
        if(i+k<=len)
        {
             smallest=s.substring(0, k);
             largest=s.substring(0, k);
            while((i+k)<=len)
            {
                sub=s.substring(i,i+k);
                
                i++;
                if(smallest.compareTo(sub)>0)
                    smallest=sub;
                if(largest.compareTo(sub)<0)
                    largest=sub;
                
                    
            }
            
            
            
        }
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
