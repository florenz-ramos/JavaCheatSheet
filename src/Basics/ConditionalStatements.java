package Basics;

public class ConditionalStatements
{
	public static void main(String[] args)
	{
		//if statement
		boolean isTrue=true;
		if(isTrue)
		{
			//the statement is true
		}
		
		//if and else statement
		int x=10;
		if(x==10){
			//x is 10
			System.out.println(x);
		}
		else{
			//x is not 10
			System.out.println("x is not 10");
		}
		
		//nested if
		if(x==10)
		{
		  //we can say that x is 10
		  if(isTrue)
		  {
			  //we can conclude that x is 10
		  }
		}
		
		
	}
}
