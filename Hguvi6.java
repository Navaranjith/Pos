import java.util.*;
class Hguvi6
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        int x=0,c=0;
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
            if(x>2)
            {
                System.out.print(b[i]);
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.print("unique");
        }
    }
}
