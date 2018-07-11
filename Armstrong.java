import java.util.*;
public class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int n=a+1;n<b;n++) 
        {
            int d=0;
            int r=0;
            int rr=n;
            while(rr!=0) 
            {
                rr/=10;
                d++;
            }
            rr = n;
            while(rr!=0) 
            {
                int m=rr%10;
                r+=Math.pow(m,d);
                rr/=10;
            }
            if(r==n)
            System.out.print(n+" ");
        }
    }
}
