package Advanced;

import java.util.*;

public class InputStudentNames
{
	public static void main(String[] args)
	{
		//input value
		Scanner scanner=new Scanner(System.in);
		String[] names=new String[10];//input 10 names
		for(int i=0;i<names.length;i++)
		{
			names[i]=scanner.next();
		}
		System.out.println("Names:");
		for(String name:names){
			System.out.println(name);
		}
		
		
	}
}
