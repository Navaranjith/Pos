import java.util.*;
class odd
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        if(a<=100000)
        {
            for(int i=n+1;i<a;i++)
            {
                if(i%2!=0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
