import java.util.*;
class Leap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a%400==0)||((a%100!=0)&&(a%4==0)))
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }
}
