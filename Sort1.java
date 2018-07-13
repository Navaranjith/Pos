import java.util.*;
class Sort1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b[]=new int[a];
        int temp;
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(int i=0;i<a-1;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.print(b[a-1]);
    }
}
