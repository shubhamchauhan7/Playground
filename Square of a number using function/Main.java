import java.util.Scanner;
class Main
{
  public static int sqr_of_numbers(int n)
  {
    int sqr = n*n;
    return sqr;
  }
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sqr = sqr_of_numbers(n);
      System.out.print(sqr);
	} 
}