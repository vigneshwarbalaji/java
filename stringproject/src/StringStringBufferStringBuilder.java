public class StringStringBufferStringBuilder
{
    public static void main(String[] args) 
    {
        //String declaration
        
        String str = "javab Developer";
        String str1 = new String("Development");

        int length = str.length();

        System.out.println(length);

        System.out.println(str.codePointAt(3));

        System.out.println(str.codePointBefore(1));

        System.out.println(str.codePointAt(4));

        System.out.println(str.charAt(0));

        System.out.println(str.concat(" web developer"));

        str = str.concat("web developer");

        System.out.println(str);

        System.out.println(str.contains("web developer"));

        StringBuffer sb1 = new StringBuffer("development");

        sb1.append("Testing");

        System.out.println(sb1);

        System.out.println(sb1.capacity());
    }
}