import java.util.*;
class Cam
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine().toLowerCase();
        String[] n=a.split(" ");
        String b="";
        String c="";
        for(int i=0;i<n.length;i++)
        {
            b=n[i].substring(0,1);
            b=b.toUpperCase();
            c=n[i].substring(1);
            System.out.print(b+c+" ");
        }
    }
}
