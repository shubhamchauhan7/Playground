import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
      	String str = in.nextLine();
      	StringBuilder sb = new StringBuilder(str);
      	int s = 0, e = sb.length()-1;
      	reverse_string(sb,s,e);
    }
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        int i,j,k;
      	char temp;
      	for(i=start_idx,j=end_idx; i<j; i++,j--)
        {
        	temp = sb.charAt(i);
          	sb.setCharAt(i, sb.charAt(j));
          	sb.setCharAt(j, temp);
        }
      	for(i=0; i<end_idx; i++)
        {
        	for(j=i; ; j++)
            {
            	if(sb.charAt(j) == ' ')
                  break;
            }
          	k = i;
          	i = j;
          	for(j=j-1; k<j; k++,j--)
            {
            	temp = sb.charAt(k);
              	sb.setCharAt(k, sb.charAt(j));
              	sb.setCharAt(j, temp);
            }
        }
      	System.out.print(sb);
    }
}