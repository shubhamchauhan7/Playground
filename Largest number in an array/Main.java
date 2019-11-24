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
      	int n1 = arr[0];
      	for(i=1; i<n; i++)
        {
        	if(n1<arr[i])
              n1 = arr[i];
        }
      	System.out.println(n1);
    }
}