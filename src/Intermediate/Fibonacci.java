package Intermediate;

public class Fibonacci
{
	public static void main(String[] args)
	{
		int fibo=Fibo(10);
		System.out.println(fibo);
		LoopFibo(10);	
	}
	//using recursion
	private static int Fibo(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		return Fibo(n-1) + Fibo(n-2);
	}
	//using for loop
	private static void LoopFibo(int n)
	{
		if (n == 0) {
			System.out.println(0);
          return;
		}

        if (n == 1){
			System.out.println(1);
            return;
        }

        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
			System.out.println(nth);
        }

	}
	
}
