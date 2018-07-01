import java.util.*;
class prim
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        int k=0,x=0;
        String p="";
        for(int i=n+1;i<a;i++)
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
                p=p+i+" ";
            }
        }
        System.out.print(p);
    }
}
