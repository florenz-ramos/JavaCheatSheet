package Intermediate;
import java.util.*;

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		for(int i=1;i<=number;i++){
			for(int j=1;j<=number;j++){
				int multiply=i*j;
				System.out.print(multiply+"\t");
			}
			System.out.println();
		}
	}
}
