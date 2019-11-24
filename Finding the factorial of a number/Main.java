import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(fact(n));
  }
  
  public static int fact(int n)
  {
  	if(n == 0)
    	return 1;
    else
    {
    	int num = fact(n-1);
    	return n * num;
    }
  }
}