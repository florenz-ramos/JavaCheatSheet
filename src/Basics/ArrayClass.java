package Basics;

public class ArrayClass
{
	public static void main(String[] args)
	{
		//array of strings;
		String[] names={"John","Jane","Susan"};
		String[] surnames=new String[3];  //3 is the size of array
	    //add values in array
		surnames[0]="John";
		surnames[1]="Jane";
		surnames[2]="Susan";
		
		//use foreach loop to get the values in array
		for(String name:names){
			System.out.println(name);
		}
		for(String surname:surnames){
			System.out.println(surname);
		}
	}
}
