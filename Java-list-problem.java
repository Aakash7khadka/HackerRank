import java.util.ArrayList;
import java.util.Scanner;

public class hack{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		int n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			int add=obj.nextInt();
			list.add(add);
			
		}
		n=obj.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String query=obj.next();
			if(query.equals("Insert"))
			{
				int in=obj.nextInt();
				int val=obj.nextInt();
				list.add(in,val);
			}
			else  if(query.equals("Delete")) 
			{
				int in=obj.nextInt();
				list.remove(in);
			}
			
		}
		for(int i:list)
			System.out.print(i+" ");
	}
	
}
