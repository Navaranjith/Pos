import java.util.*;
class ES
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        for(int i=0;i<n.length();i++)
        {
            if(i%2==0)
            {
                System.out.print(n.charAt(i+1));
            }
            else
            {
                System.out.print(n.charAt(i-1));
            }
        }
    }
}
