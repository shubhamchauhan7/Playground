import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int i,j,k;
     int num = 0;
     for(i=1; i<=n; i++)
     {
       for(j=n; j>i; j--)
       {
         System.out.print(" ");
       }
       for(k=1; k<=i; k++)
       {
         num = num+1;
         System.out.print(num);
         System.out.print(" ");
       }
     System.out.print("\n");
     } 
  }
}