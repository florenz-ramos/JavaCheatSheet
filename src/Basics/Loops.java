package Basics;

public class Loops
{
	public static void main(String[] args)
	{
		//four types of loop
		//do-while,while,for and foreach
		int x=0;
		
		//do while loop
		do{
		 x++;
		 System.out.println(x);
		}
		while(x<10);
		
		x=0; //reset x into 0
		
		//while loop
		while(x<10){
			x++;
			System.out.println(x);
		}
		
		//for loop
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		//foreach loop(check it in array class)
	}
	
}
