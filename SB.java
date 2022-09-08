public class SB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        //O(N) here
        //O(N^2) without string builder
        System.out.println(sb);
    }
}
