import java.util.*;
class prim
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        int k=0,x=0;
        int p=0;
        if(n<=1000000&&a<=1000000)
        {
        for(int i=n;i<a;i++)
        {
            int c=0;
            for(k=i;k>=1;k--)
            {
               if(i%k==0)
               {
                  c+=1;
               }
            }
            if(c==2)
            {
                p++;
            }
        }
        }
        System.out.print(p);
    }
}

