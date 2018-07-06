import java.util.*;
class Mon
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        char b='S';
        //String b={"Monday","Tuesday","wednesday","Thursday","Friday"};
        if(a.charAt(0)==b)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
