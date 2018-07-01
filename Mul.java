import java.util.*;
class Mul
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=0;
        for(int i=1;i<=5;i++)
        {
            k=i*n;
            System.out.print(k+" ");
        }
    }
}
