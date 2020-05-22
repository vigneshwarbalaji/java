

public class Anagram
{    

    public static boolean areAnAnagram(char [] firstString,char [] secondString)
    {
        int NO_OF_CHARS = 256;

        int count[] =  new int[NO_OF_CHARS];

        int lenOfFirstString = firstString.length;
        int lenOfSecondString = secondString.length;

        if(lenOfFirstString != lenOfSecondString)
        {
            return false;
        }
        
        for(int i = 0;i < lenOfFirstString && i < lenOfSecondString;i++)
        {
            count[i]++;
            count[i]--;
        }

        for(int i = 0; i < NO_OF_CHARS;i++)
        {
            if(count[i] != 0)
            {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) 
    {
        char[] firstString = "triangle".toCharArray();
        char[] secondString = "integral".toCharArray();

        boolean check = areAnAnagram(firstString,secondString);

        if(check)
        {
            System.out.println("The given strings are an anagram");
        }
        else
        {
            System.out.println("The given strings are not an anagram");
        }
    }
}