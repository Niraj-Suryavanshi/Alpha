public class StringCompare {
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        if(s1==s2)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }

        if(s1==s3)
        {
            System.out.println("Strings are equal");
        }
        else//execute this because s1 and s2 point to same string object and s3 point to new created object in memory
        {
            System.out.println("Strings are not equal");
        }

        // if(s1.equals(s3))//used to compare by the value stored in an object
        // {
        //     System.out.println("Strings are equal");
        // }
        // else
        // {
        //     System.out.println("Strings are not equal");
        // }


    }
}
