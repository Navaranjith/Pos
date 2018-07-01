import java.util.*;
class Pal
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a,x,y=0;
        while(a>0)
        {
            x=a%10;
            y=(y*10)+x;
            a=a/10;
        }
        if(b==y)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
