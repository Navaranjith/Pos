import java.util.*;
class Cam
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String[] n=a.split(" ");
        String b="";
        String c="",x="",y="";
        for(int i=0;i<n.length;i++)
        {
            b=n[i].substring(0,1);
            x=b.toUpperCase();
            c=n[i].substring(1);
            y=x+c;
            System.out.print(y+" ");
        }
    }
}
