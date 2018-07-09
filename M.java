import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int max;
       for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        max=a[0];
        if(n>1 && n<100000)
        {
           for(int i=0;i<a.length;i++)
           {
                if(max<a[i])
                {
                   max=a[i];
                }
            }
            System.out.println(""+max);
        }
    }
}


