public class StrUpperCase {

    public static String toUpperCase(String str)
    {
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++)//TC= O(N) because we traverse single string one time
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str="hi, i am niraj";
        //Output should be= Hi, I Am Niraj
        System.out.println(toUpperCase(str));
    }
}
