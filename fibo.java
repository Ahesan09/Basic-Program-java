import java.util.*;
class fibo
{ 
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
    int n= sc.nextInt();
	int a=0,b=1,c=0;
	System.out.print("Fibonacci series: " + a + " + " + b);
	for(int i=3;i<=n;i++)
	{
	    c=a+b;
	    System.out.print(" + " + c);
		a=b;
		b=c;
	}


	
	}
}	