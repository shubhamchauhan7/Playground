import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int num = n;
       int i,j;
       for(i=1; i<=n; i++)
       {
         for(j=num; j>=1; j--)
         {
           System.out.print(j);
         }
           System.out.print("\n");
           num = num-1;
       }
	}
}