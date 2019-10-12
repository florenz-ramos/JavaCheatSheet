package Intermediate;
import java.util.*;

public class OddOrEven
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		//input number
		int number=scanner.nextInt();
		if(number%2==0){
			System.out.println(number+" is even");
		}
		else{
			System.out.println(number+" is odd");
		}
		
	}
}
