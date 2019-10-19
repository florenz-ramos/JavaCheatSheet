package Advanced;
import java.util.*;

public class NumberToBinary
{
	public static void main(String[] args)
	{
	  //input value
	  Scanner scanner=new Scanner(System.in);
	  int value=scanner.nextInt();
	 
	  String convertedValue=Integer.valueOf(value).toBinaryString(value);
	  System.out.println(convertedValue);
	  
	  
	  
	}
}
