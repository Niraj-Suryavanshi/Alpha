import java.util.Scanner;

public class Strings
{
    public static boolean isPalindrome(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }

    public static void printLetter(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
    
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyzabce#1");

        //Strings are IMMUTABLE

        // Scanner sc=new Scanner(System.in);
        // String name;
        // // sc.next(); takes single word before the space or next line
        // name=sc.nextLine();//takes complete line of text
        // System.out.println(name);
        // System.out.println(name.length());

        //concatenation
        String firstName="Niraj";
        String secondName="Suryavanshi";
        String fullName=firstName+" "+secondName;
        // System.out.println(fullName);

        // System.out.println(fullName.charAt(9));

        // printLetter(fullName);

        String word="121";
        System.out.println(isPalindrome(word));

    }
}