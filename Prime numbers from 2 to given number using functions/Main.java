import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      	prime_number(n);
  	}
  	public static void prime_number(int n)
  	{
      	int i,j;
      	for(i=2; i<=n; i++)
        {
        	for(j=2; j<i; j++)
            {
          		if(i%j == 0)
                  break;
            }
          	if(i == j)
              System.out.println(i);
        }
  	}
}