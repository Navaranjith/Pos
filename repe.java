import java.util.*;
class Repe
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] b=new int[n];
        int x=0,y=0,d=0;
        String r="";
        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
        }
        Arrays.sort(b);
        for(int i=0;i<n-1;i++)
        {
            x=1;
            for(int j=i+1;j<n;j++)
            {
                if(b[i]==b[j])
                {
                    x++;
                }
            }
            if(x>1)
            {
            if(!r.contains(String.valueOf(b[i])))
            {
                r=r+String.valueOf(b[i]);
                r=r+" ";
            }
            }
            else
            d++;
            }
            if(d>0)
            {
                System.out.print("unique");
            }
            else
            
            System.out.print(r);
        
    }
}






