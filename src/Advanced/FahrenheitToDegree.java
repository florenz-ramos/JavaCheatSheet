package Advanced;

import java.util.*;

public class FahrenheitToDegree
{
	public static void main(String[] args)
	{
		//input value
		Scanner scanner=new Scanner(System.in);
		
		double degrees=0;
		double fahrenheit=0;
        System.out.println("[1] Degrees to Fahrenheit");
		System.out.println("[2] Fahrenheit to Degrees");
		System.out.print("-->");
		int value=scanner.nextInt();
        switch(value){
			case 1:
				System.out.print("Enter Degree(s):");
				degrees=scanner.nextDouble();
				fahrenheit=(degrees * 9/5) + 32;
				System.out.println(fahrenheit);
				break;
			case 2:
				System.out.print("Enter Fahrenheit:");
				fahrenheit=scanner.nextDouble();
				degrees=(fahrenheit-32) *5/9;
				System.out.println(degrees);
				break;
			default:
				return;
		}
	
	}
}
