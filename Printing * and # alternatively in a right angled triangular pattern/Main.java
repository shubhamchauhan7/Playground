import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int num = 0;
        for(int row=1; row<=n; row++)
        {
           for(int col=1; col<=row; col++)
           {
             num = num+1;
             if(num%2 == 1)
                System.out.print("*");
             else
                System.out.print("#");
           }
          System.out.print("\n");
        }
    }
}