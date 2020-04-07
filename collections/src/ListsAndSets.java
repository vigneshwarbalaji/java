import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
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

        s1.add(21);
        s1.add(11);
        s1.add(3);
        s1.add(49);
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
        System.out.println("\n\nThe elements in set are: ");
        for (int x : s1) 
        {
            System.out.print(x+" ");    
        }

        //2nd method of iteration

        System.out.println("\n\nUsing normal for loop in list");
        for(int i = 0;i < l1.size();i++)
        {
            System.out.print(l1.get(i)+" ");
        }

        l1.remove(1);

        System.out.println("\n\nAfter removing the element in the list");
        for(int i = 0;i < l1.size();i++)
        {
            System.out.print(l1.get(i)+" ");
        }

        l1.add(1,5);

        System.out.println("\n\nAfter inserting element based on index in the list");
        for(int i = 0;i < l1.size();i++)
        {
            System.out.print(l1.get(i)+" ");
        }

        Map<Integer,Integer>map = new HashMap<Integer,Integer>();

        map.put(1, 100);
        map.put(2, 200);
        map.put(3,300);

        System.out.println("\nElements inside maps are");
        for(Map.Entry mapelement : map.entrySet())
        {
            int key = (int)mapelement.getKey();
            int value = (int)mapelement.getValue();

            System.out.print(" "+key+" "+value);
        }

        Queue<Integer>q1 = new PriorityQueue<Integer>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);


        System.out.println("\n\npriority queue elements are");
        for (int x : q1) 
        {
            System.out.print(x+" ");    
        }

        System.out.print("peeked element in priority queue "+q1.peek());
        
        System.out.println("\n\npriority queue elements are");
        for (int x : q1) 
        {
            System.out.print(x+" ");    
        }

        System.out.print("polled element in priority queue "+q1.poll());

        System.out.println("\n\npriority queue elements are");
        for (int x : q1) 
        {
            System.out.print(x+" ");    
        }
    }
}