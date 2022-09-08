public class StringCompression {

    public static String compress(String str)
    {
        String newStr="";

        for(int i=0;i<str.length();i++)//TC = O(N) because i incrementing in both for and while so it can go till only N
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1)
            {
                newStr+=count.toString();
            }
        }

        return newStr;

    }

    public static void main(String[] args) {
         String  str="aaabbcccdd";
         //output should be- a3b2c3d2
         System.out.println(compress(str));
    }
}
