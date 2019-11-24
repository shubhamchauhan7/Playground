import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int i,k = n,sum,c=0,r;
      	while(k>0)
        {
          	r = k%10;
        	for(i=r,sum=1; i>0; i--)
            	sum = sum * i;
          	k = k/10;
          	c = c + sum;
        }
      	if(c == n)
      		System.out.println("Yes");
      	else
        	System.out.println("No");
	}
}