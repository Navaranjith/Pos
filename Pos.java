import java.util.*;
class Pos
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>=1&&a<=100000)
        {
            System.out.println("Positive");
        }
        else if(a==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}
