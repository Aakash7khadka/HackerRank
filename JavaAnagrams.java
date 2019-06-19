import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
    String a1=a.toLowerCase();
    String b1=b.toLowerCase();
   int index=0;
   int ac[]=new int[26];
    int bc[]=new int [26];
    for(int i=0;i<a.length();i++)
    {
        ac[i]=0;
        bc[i]=0;
    }

    for(int i=0;i<a.length();i++)
    {
        index=(a1.charAt(i))-97;
        
        ac[index]++;
         
    }
   
    for(int i=0;i<b.length();i++)
    {
         index=(b1.charAt(i))-97;
        bc[index]++;
       
    }
  
    if(ac!=bc)
    return false;
    else
    return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

