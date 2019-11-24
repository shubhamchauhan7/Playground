import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
      	System.out.println(sum(n));
    }
  
  	public static int sum(int n)
    {
    	if(n == 1)
          	return 1;
      	else
        {
        	int num = sum(n-1);
          	return n + num;
        }
    }
}