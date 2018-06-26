import java.util.Scanner;
class Max
    
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        //int n=s.nextInt();
        int a[]=new int[3];
        int max;
       for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        max=a[0];
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

