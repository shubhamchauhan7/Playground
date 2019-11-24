import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int i,r,k = n,c = 0,sum,p = 0;
      	while(k>0)
        {
        	k = k/10;
          	c++;
        }
      	k = n;
      	while(k>0)
        {
          	r = k%10;
        	for(i=1,sum=1; i<=c; i++)
            	sum = sum*r;
          	p = p + sum;
          	k = k/10;
        }
      	if(p == n)
          System.out.println("Armstrong Number");
      	else
          System.out.println("Not a Armstrong Number");
	}
}