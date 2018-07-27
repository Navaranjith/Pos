import java.util.*;
class No
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int x=0;
        int[] b=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            x=0;
            for(int j=0;j<a;j++)
            {
                if(b[i]==b[j])
                {
                    x++;
                }
            }
            if(x==1)
            {
                System.out.print(b[i]);
            }
        }
    }
}
