import java.util.*;
public class Hguvi11
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String[] b=a.split(" ");
        String c="";
        for(int i=0;i<b.length;i++)
        {
            c=b[i];
            char[] x=c.toCharArray();
            for(int j=x.length-1;j>=0;j--)
            {
                System.out.print(x[j]);
            }
            System.out.print(" ");
            c="";
        }
	}
}



