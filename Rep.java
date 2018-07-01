import java.util.*;
class Rep
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        String a="";
        for(int i=n.length()-1;i>=0;i--)
        {
            a+=n.charAt(i);
        }
        System.out.print(a);
    }
}
