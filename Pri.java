import java.util.*;
class Pri
{
    public static void main(String args[])
    {
        boolean t=true;
        int k=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            k=n%i;
            if(k==0)
            {
                t=false;
                break;
            }
        }
        if(t&&n>=1000)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
