import java.util.Scanner;
class Main{
  public static int sum_of_numbers(int n)
  {
    int i,sum = 0;
    for(i=1; i<=n; i++)
      sum = sum + i;
      return sum;
  }
  public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = sum_of_numbers(n);
      System.out.print(sum);
	}
}