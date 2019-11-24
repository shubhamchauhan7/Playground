import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {	
      	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
      	int arr[] = new int[n];
      	int i;
      	for(i=0; i<n; i++)
        	arr[i] = in.nextInt();
      	int v = in.nextInt();
      	sum(arr,v);
    }
  	public static void sum(int arr[], int v)
    {
    	int i,j;
      	for(i=0; i<arr.length-1; i++)
        {	
        	for(j=i+1; j<arr.length; j++)
            {
            	if(arr[i] + arr[j] == v)
                	System.out.println(arr[i] + "," + " " + arr[j]);
            }
        }
    }
}