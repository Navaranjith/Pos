import java.util.*;
class R
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        while(n!=0)
        {
           a=a*10;
           a+=n%10;
           n=n/10;
        }
        System.out.print(a);
    }
}

