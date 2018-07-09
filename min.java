import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int min;
       for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        min=a[0];
        if(n>1 && n<100000)
        {
           for(int i=0;i<a.length;i++)
           {
                if(min>a[i])
                {
                   min=a[i];
                }
            }
            System.out.println(""+min);
        }
    }
}


