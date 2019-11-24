import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int arr[] = new int[n];
      	int i,j,temp,c = 0;
      	for(i=0; i<n; i++)
          arr[i] = in.nextInt();
      	for(i=0; i<n; i++)
        {
        	if(arr[i] == 0)
              c++;
        }
      for(i=0; i<n-c;)
      {
      	if(arr[i] == 0)
        {
        	temp = arr[i];
          	for(j=i; j<n-1; j++)
            	arr[j] = arr[j+1];
          	arr[j] = temp;
        }
        else
          i++;
      }
      for(i=0; i<n; i++)
        System.out.print(arr[i] + " ");
    }
}