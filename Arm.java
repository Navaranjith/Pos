import java.util.*;
class Arm
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a;
        int x,y=0;
        while(a>0)
        {
            x=a%10;
            a=a/10;
            y=y+(x*x*x);
        }
        if(b==y)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
