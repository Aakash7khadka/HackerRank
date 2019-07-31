import java.util.ArrayList;
import java.util.Scanner;

public class hack{
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<>(); 
		Scanner obj=new Scanner(System.in);
		int n=0;
		n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> row=new ArrayList<>();
			int a=obj.nextInt();
			for(int j=0;j<a;j++)
			{
			row.add(obj.nextInt());
			
			}
			list.add(row);
		}
		n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			/*
			 * n=obj.nextInt(); int a=obj.nextInt();
			 */
			try {
				
				System.out.println(list.get(obj.nextInt()-1).get(obj.nextInt()-1));
			}
			catch(Exception e){
				System.out.println("Error!");
			}
			
		}
		
	}
}
