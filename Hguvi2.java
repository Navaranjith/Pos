import java.util.*;
class Hguvi2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        int x=0;
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
        Arrays.sort(b);
        for(int i=0;i<a-1;i++)
        {
            if(b[i]==b[i+1])
            {
                x++;
            }
        }
        if(x==a-1)
        {
            System.out.print(b[0]);
        }
        else
        {
            for(int i=a-1;i>=0;i--)
            {
                System.out.print(b[i]);
            }
        }
    }
}
