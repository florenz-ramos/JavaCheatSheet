package Intermediate;

public class Factorial
{
	public static void main(String[] args)
	{
	  int factorial=Factorial(9);
	  System.out.println(factorial);
	  Fact(5);
	}
	
	//using factorial
	public static int Factorial(int n){
		if(n==1) return 1;
	  return n*Factorial(n-1);
	}
	
	//using for loop
	public static void Fact(int n){
		int value=1;
		for(int i=1;i<=n;i++){
		   value*=i;
		   System.out.println(value);
		}
	}
}
