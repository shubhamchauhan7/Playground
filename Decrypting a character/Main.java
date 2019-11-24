import java.util.Scanner;
public class Main
{
    public static void main(String args[]) 
    {
    	Scanner in = new Scanner(System.in);
      	char ch = in.next().charAt(0);
      	int key = in.nextInt();
      	if(ch >= 'a' && ch <= 'z')
        {
        	if((ch-key) > 'a')
            {
            	ch = (char)(ch-key);
              	System.out.println(ch);
            }
          	else
            {
            	ch = (char)(ch+(26-key));
            	System.out.println(ch);
            }
        }
      	else if(ch >= 'A' && ch <= 'z')
        {
        	if((ch-key) > 'A')
            {
            	ch = (char)(ch-key);
              	System.out.println(ch);
            }
          	else
            {
            	ch = (char)(ch+(26-key));
            	System.out.println(ch);
            }
        }
    }
}