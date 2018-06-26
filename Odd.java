import java.util.*;
class Odd
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>=1&&a<=100000)
        {
          if(a%2==0)
          {
              System.out.println("Even");
          }
          else
          {
              System.out.println("Odd");
          }
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
