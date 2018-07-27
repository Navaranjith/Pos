import java.util.*;
class Hguvi10
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int[] c=new int[a];
        int[] d=new int[b];
        int x=0;
        for(int i=0;i<a;i++)
        {
            c[i]=s.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            d[i]=s.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(d[i]==c[j])
                {
                    x++;
                }
            }
        }
        if(x==b)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}
