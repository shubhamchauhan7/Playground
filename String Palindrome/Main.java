import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
    	Scanner in = new Scanner(System.in);
      	String str = in.nextLine();
      	palindrome(str);
    } 
  	public static void palindrome(String str)
    {
    	int str_len = str.length();
      	int i,j;
      	boolean isMatching = false;
      	for(i=0, j=str_len-1; i<j; i++,j--)
        {
        	if(str.charAt(i) == str.charAt(j))
            	isMatching = true;
            else
            	break;
        }
        if(isMatching == true)
               System.out.println("Yes");
        else
               System.out.println("No");
    }
}