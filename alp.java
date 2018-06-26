import java.util.*;
class alp
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("No");
        }
    }
}
