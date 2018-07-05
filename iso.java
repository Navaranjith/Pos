import java.util.*;
class iso
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        int x=0;
        for(int i=0;i<a.length();i++)
        {
            if(b.contains(String.valueOf(a.charAt(i))))
             x++;
        }
        if(x>0)
         System.out.println("yes");
        else
         System.out.println("no");
    }
}

