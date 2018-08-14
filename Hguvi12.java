import java.util.*;
class Hguvi12
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c[]=new int[a];
        int temp=0;
        for(int i=0;i<a;i++)
        {
           c[i]=s.nextInt(); 
        }
        if(a>=b)
        {
            for(int i=0;i<a;i++)
            {
                for(int j=i+1;j<a;j++)
                {
                    if(c[i]<c[j])
                    {
                        temp=c[i];
                        c[i]=c[j];
                        c[j]=temp;
                    }
                }
            }
            System.out.print(c[b-1]);
        }
        else
        {
            System.out.print("not possible");
        }
    }
}
