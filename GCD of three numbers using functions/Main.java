import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
      	int n1 = in.nextInt();
      	int n2 = in.nextInt();
      	int n3 = in.nextInt();
      	int r = gcd_of_3_numbers(n1,n2,n3);
      	System.out.println(r);
	}
  	public static int gcd_of_3_numbers(int n1, int n2, int n3)
    {
    	int min1,gcd1=0,gcd2=0,min2;
    	if(n1<n2)
        	min1 = n1;
      	else
        	min1 = n2;
      	while(min1>=1)
        {
        	if((n1%min1 == 0) && (n2%min1 == 0))
            {
            	gcd1 = min1;
              	break;
            }
            min1--;
        }
      	if(gcd1<n3)
        	min2 = gcd1;
      	else
        	min2 = n3;
      	while(min2>=1)
        {
        	if((gcd1%min2 == 0) && (n3%min2 == 0))
            {
            	gcd2 = min2;
              	break;
            }
            min2--;
        }
      	return gcd2;
    }
}