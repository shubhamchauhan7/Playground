import java.util.Scanner;
class Main
{ 
  public static void main(String args[]) 
  { 
  	Scanner in = new Scanner(System.in);
    int rows = in.nextInt();
    int cols = in.nextInt();
    int arr1[][] = new int[rows][cols];
    int arr2[][] = new int[rows][cols];
    int subt[][] = new int[rows][cols];
    int i,j;
    for(i=0; i<rows; i++)
    {
    	for(j=0; j<cols; j++)
        {
        	arr1[i][j] = in.nextInt();
        }
    }
    for(i=0; i<rows; i++)
    {
    	for(j=0; j<cols; j++)
        {
        	arr2[i][j] = in.nextInt();
        }
    }
    for(i=0; i<rows; i++)
    {
    	for(j=0; j<cols; j++)
        {
        	subt[i][j] = arr1[i][j] - arr2[i][j];
          	System.out.print(subt[i][j] + " ");
        }
      	System.out.println();
    }
    //for(i=0; i<rows; i++)
    //{
    	//for(j=0; j<cols; j++)
        //{
        	//System.out.print(subt[i][j] + " ");
        //}
      	//System.out.println();
    //}
  }
}