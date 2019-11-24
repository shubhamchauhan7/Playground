import java.util.Scanner;
class Main {
   public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int i,j,k,l;
     for(i=1; i<=n; i++)
     {
       for(j=n; j>i; j--)
       {
         System.out.print(" ");
       }
       for(k=1; k<=i; k++)
       {
         System.out.print("*");
       }
       for(l=1; l<i; l++)
       {
         System.out.print("*");
       }
     System.out.print("\n");
     }
     
	}
}