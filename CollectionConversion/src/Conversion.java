import java.util.*;

public class Conversion 
{
    public static void main(String[] args) 
    {
        //1st method
        //int array[] = {1,5,4,6,2,3};
        //List<Integer>al1 = Arrays.asList(array);
        //al1.addAll(Arrays.asList(array));

        //first method for converting a string array to a 
        //list but this method cannot
        //be used to convert integer array

        //The arrays converted to arraylist by using this method
        //are fixed in size and we cannot add more values to it
        /* 
        String array[] = {"viki","might","kite"};
        List al = Arrays.asList(array);
        System.out.println(al);
        */

        //2nd method
        //Converting array to arraylist by creating a new arraylist
        //and passing it inside the arraylist constructor but this method cannot
        //be used with primitive data types like integer
        //by using this method we can add new elements to the arraylist

        /*
        String names[] = {"viki","nick","Mike"};
        List<String>arraylist = new ArrayList<String>(Arrays.asList(names));
        arraylist.add("shane");
        arraylist.add("cook");
        System.out.println(arraylist);
        */

        //3rd method
        //using collections.add all
        //This method also cannot be used with primitive data types

        /*
        String names[] = {"viki","nick","mick"};
        List<String>arraylist = new ArrayList<String>();
        arraylist.addAll(arraylist);
        */

        /* Wrong and cannot be done
        as it produces incompatible types error
        cause int is a primitive data type
        int numbers[] = {1,2,3,45,1,2,62,14};
        List<Integer>al1 = new ArrayList<Integer>();
        al1.addAll(numbers);
        */

        //We cannot convert a integer array directly to
        int num[] = {1,4,5,2,3,8,9}; 
        List al1 = Arrays.asList(num);

        //System.out.println(al1);

        /*for(int i = 0;i < al1.size();i++)
        {
            System.out.print(al1.get(i));
        }*/

        char [] arr = {'z','b','c','a','g','k','x','y','d','e','f','h'
                      ,'i','j','m','l','n','w','q','r','s','t','u','v','o','p'};

                      Arrays.sort(arr);


                      //anagram logic using array method instead of writing
                      //single array and double array method
                      //System.out.println(arr);
                      for(int i = 0;i < arr.length;i++)
                      {
                          System.out.print(arr[i]);
                      }

                      char[] str1 = "triangle".toCharArray();
                      char[] str2 = "integrel".toCharArray();

                      Arrays.sort(str1);
                      Arrays.sort(str2);

                      boolean check = false;

                      if(str1.length == str2.length)
                      {
                            
                        for(int i = 0;i < str1.length && i < str2.length;i++)
                        {
                            if(str1[i] == str2[i])
                            {
                                check = true;
                                continue;
                            }
                            else
                            {
                                check = false;
                                break;
                            }
                        }

                        if(check == true)
                        {
                            System.out.println("\nIt is an anagram");
                        }
                        else{
                            System.out.println("\nnot an anagram");
                        }
                      }
                      else{
                        System.out.println("\nnot an anagram");
                      }

                      int minVal = Integer.MAX_VALUE;

                      int a[] = {7,0,1,6,1,10,52,25,24};

                      for (int i = 0; i < a.length; i++) {
                          if(a[i] < minVal)
                          {
                              minVal = a[i];
                          }
                      }

                      System.out.println("The minimum value is: "+minVal);

                      
                      int maxVal = Integer.MIN_VALUE;

                      int b[] = {7,0,1,6,1,10,52,25,24};

                      for (int i = 0; i < a.length; i++) {
                          if(b[i] > maxVal)
                          {
                              maxVal = b[i];
                          }
                      }

                      System.out.println("The maximum value is: "+maxVal);


                      //arrays class

                      //array.equals method
                      int [] sampleOne = {1,2,3,4,5};
                      int [] sampleTwo = {1,2,3,4,5};

                      if(Arrays.equals(sampleOne, sampleTwo))
                      {
                          System.out.println("Arrays are equal");
                      }
                      else
                      {
                          System.out.println("Not equal");
                      }

                      //arrays.fill
                      int [] sampleThree = new int[10];

                      Arrays.fill(sampleThree,5);

                      //value of sample three

                      System.out.println("\nWe had filled the sample three array with 5:");
                      for(int i = 0;i < sampleThree.length;i++)
                      {
                          System.out.print(sampleThree[i]+" ");
                      }

                      //Binary search is the fastest sorting algorithm
                      //better than linear search hence using such a search in 
                      //the following array

                      int [] sampleFour = {1,2,3,4,5,6,7,8,9,10};
                      
                      //This is faster than using linear search 
                      //which would take o(n)
                      //binary search would o(n/2)
                      int index = Arrays.binarySearch(sampleFour, 5);

                      System.out.println("\nNumber five is in the index: "+index);

                      //converting an array to string

                      String numString = Arrays.toString(sampleFour);
                      
                      //converted to string hence it concatenates
                      String newNumString = numString +"flyte";
                      
                      System.out.println("Value of new num string :"+newNumString);                     

                      System.out.println(numString+" ");

                      int [] sampleFive = Arrays.copyOf(sampleTwo, sampleTwo.length);

                      System.out.println("\nCopying sample two array value to sample five");

                      for (int i = 0; i < sampleFive.length; i++) {
                          System.out.print(sampleFive[i]+" ");
                      }

                      //copy of range method in Arrays

                      System.out.println("\nCopying the sample five array from index 2 to to its length in sample six: ");
                      int [] sampleSix = Arrays.copyOfRange(sampleFive,2,sampleFive.length);

                      for (int i = 0; i < sampleSix.length; i++) {
                        System.out.print(sampleSix[i]+" ");
                    }

                    //Strings and its method
                    //Strings can be declared in 2 ways
                    //String literal and using object

                    String newString = "Hello";

                    String objectString =  new String("World");
                    
                    String sampleString = "world order";

                    String sampleSubstring = sampleString.substring(6);

                    System.out.println("\nThe sample substring is : "+sampleSubstring);

                    String secondSampleString = "is this good or is this bad?";
                    String subStr = "is";
                    int stringIndex = secondSampleString.indexOf(subStr);

                    while(stringIndex != -1) {
                        System.out.print(stringIndex+" ");
                        stringIndex = secondSampleString.indexOf(subStr,stringIndex + 1);
                    }
                    
                    String sampleOneComp = "abc";
                    String sampleTwoComp = "abc";
                    String sampleOneCapsComparision = "ABC";
                    
                    if(sampleOneComp.equals(sampleTwoComp))
                    {
                        System.out.println("Equals");
                    }

                    if(sampleOneComp.equalsIgnoreCase(sampleOneCapsComparision))
                    {
                        System.out.println("Caps comparision equals");
                    }

                    String happyLine = "this is a great day";
                    String sampleLine = "Had an enormous day";

                    if(happyLine.startsWith("this")|| sampleLine.startsWith("this"))
                    {
                        System.out.println("The happy line starts with the given word");
                    }
                    else
                    {
                        System.out.println("The happy line does not starts with the given word");
                    }


                    if(sampleLine.startsWith("this"))
                    {
                        System.out.println("The sample line starts with the given word");
                    }
                    else
                    {
                        System.out.println("The sample line doesnot starts with the given word");
                    }
                    //System.out.println(secondSampleString.indexOf("is"));

                    if(sampleLine.endsWith("day"))
                    {
                        System.out.println("The happy line starts with the given word");
                    }
                    else
                    {
                        System.out.println("The happy line doesnot starts with the given word");
                    }

                    String trialString = "  abc     ";
                    String trimmedString = trialString.trim();

                    System.out.println("The trimmed string is "+trimmedString);

                    String trialAlpha = "abcdefghi";

                    String replacedAlpha = trialAlpha.replace('d','#');

                    System.out.println("Replaced string is: "+replacedAlpha);

                    String dupliString = "abcdabcdabcdabcd";

                    String dupliReplace = dupliString.replaceFirst("abcd","wxyz");

                    System.out.println("duplireplace "+dupliReplace);

                    String dupliReplaceString = "one two three two two five seven two";

                    String replacingTheGivenWord = dupliReplaceString.replaceAll("two","ten");

                    System.out.println(replacingTheGivenWord);

                    /*Map<Object, Object%gt; map = null;

                    boolean mapIsObject = map instanceof Map;*/

                    int [] nums = {1,1,2,2,2,3,4,4};

                    int count = 0;
                    int ind = 0;

                    for (int i = 0; i < nums.length - 1; i++) 
                    {
                        if(nums[i] == nums[i + 1])
                        {
                            continue;
                        }
                        else
                        {
                            count++;
                        }

                        ind = i;
                    }

                    if(nums[ind - 1] != nums[ind])
                    {
                        count++;
                    }
                    
    }
}