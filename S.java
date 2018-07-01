import java.util.*;
class S
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k=0;
        for(int i=0;i<b;i++)
        {
            k+=a[i];
            //System.out.print(k);
        }
        System.out.print(k);
    }
}
