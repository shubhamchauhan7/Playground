import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
  	Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    substring(str1, str2);
  } 
  public static void substring(String str1, String str2)
  {
  	int str1_len = str1.length();
    int str2_len = str2.length();
    int i,j,c=0;
    for(i=0; i<(str1_len-str2_len+1);)
    {
    	for(j=0; j<str2_len; )
        {
        	if(str1.charAt(i) == str2.charAt(j))
            {
            	i++;
              	j++;
            }
          	else
            {
              i++;
              break;
            }
        }
      	if(j == str2_len)
        {
          i--;
          c++;
        }
    }
    System.out.print(c);
  }
}