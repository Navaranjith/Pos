import java.util.*;
class Hguvi15
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
            x=x+b[i];
        }
        System.out.print(x);
    }
}
