import java.util.*;
class Hguvi7
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
        for(int i=0;i<a;i++)
        {
            if(b[i]%2!=i%2)
            {
                System.out.print(b[i]+" ");
            }
        }
    }
}
