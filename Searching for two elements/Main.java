import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
      	int arr[] = new int[n];
      	int i,j,p=0;
      	for(i=0; i<n; i++)
          arr[i] = in.nextInt();
      	int n1 = in.nextInt();
      	int n2 = in.nextInt();
      	for(i=0; i<n; i++)
        {
            	if(arr[i] == n1 || arr[i] == n2)
                {	
                  	p++;
                	System.out.println(i);
                }
        }
      	if(p != 2)
          System.out.println("-1");
    }
}