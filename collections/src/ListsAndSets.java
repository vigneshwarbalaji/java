import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListsAndSets
{
    public static void main(String[] args) 
    {
        //Difference between lists and sets
        
        List<Integer>l1 = new ArrayList<Integer>();
        Set<Integer>s1 = new HashSet<Integer>();

        l1.add(3);
        l1.add(5);
        l1.add(5);
        l1.add(1);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(3);

        s1.add(3);
        s1.add(5);
        s1.add(5);
        s1.add(1);
        s1.add(6);
        s1.add(9);
        s1.add(6);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(7);
        s1.add(8);
        s1.add(10);

        //Lists usually preserves insertion order
        //List allows duplicates
        //list wont sort the elements
        System.out.println("\nThe elements in lists are: ");
        for (int x : l1) 
        {
            System.out.print(x+" ");    
        }

        //set wont preserves insertion order
        //set wont allow duplicate
        //set stores group of elements in natural ascending order
        System.out.println("\nThe elements in set are: ");
        for (int x : s1) 
        {
            System.out.print(x+" ");    
        }
    }
}