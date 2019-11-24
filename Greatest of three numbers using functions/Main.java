import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      	Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
      	int n2 = in.nextInt();
      	int n3 = in.nextInt();
      	int r;
      	r = greatest_of_3_numbers(n1,n2,n3);
      	System.out.println(r);
	}
  	public static int greatest_of_3_numbers(int n1, int n2, int n3)
    {
    	if(n1>n2)
        {
        	if(n1>n3)
              return n1;
          	else
              return n3;
        }
      	else
        {
        	if(n2>n3)
              return n2;
          	else
              return n3;
        }
    }
}