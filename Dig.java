import java.util.*;
class Dig
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=0;
        while(n!=0)
        {
            n=n/10;
            k++;
        }
        System.out.print(k);
    }
}
