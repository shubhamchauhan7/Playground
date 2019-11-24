import java.util.Scanner;
class Main
{
	public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
      	int base = in.nextInt();
      	int expo = in.nextInt();
      	int r;
      	r = power_of_number(base,expo);
      	System.out.println(r);
    }
  	public static int power_of_number(int b, int e)
    {
    	int i,sum = 1;
      	for(i=1;i<=e; i++)
        	sum = sum * b;
      	return sum;
    }
}