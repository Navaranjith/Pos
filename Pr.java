import java.util.*;
class Pr
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        int y=0;
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            y=0;
            for(int j=0;j<a;j++)
            {
                if(b[i]==b[j]&& i!=j)
                {
                    y++;
                }
            }
            if(y==0)
            System.out.print(b[i]+" ");
            //else
            //System.out.print("No");
        }
    }
}
