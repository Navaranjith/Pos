import java.util.*;
class Sm
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int m=a*b;
        if(m%a==0 && m%b==0)
        {
           System.out.print(m);
        }
    }
}
