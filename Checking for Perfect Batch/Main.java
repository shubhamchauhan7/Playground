import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int i,j,sum,k,p = 0,ans = 0;
    for(i=0; i<n; i++)
      arr[i] = in.nextInt();
    for(i=0; i<n; i+=3)
    {
      	j = 1;
      	k = i;
      	sum = 0;
    	while(j<=3)
        {
        	sum = sum + arr[k];
          	k++;
          	j++;
        }
      	if(i<3)
          ans = sum;
      	else
        {
        	if(ans != sum)
              p = 1;
        }
    }
    if(p==0)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}