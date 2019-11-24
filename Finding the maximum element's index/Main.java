import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int i,j,l,index = 0;
    for(i=0; i<n; i++)
      arr[i] = in.nextInt();
    l=arr[0];
    for(i=1; i<n; i++)
    {
    	if(l<arr[i])
        {
        	l = arr[i];
          	index = i;
        }
    }
    System.out.println(index);
  }
}