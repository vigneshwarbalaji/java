import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TheNewCollections 
{
    Integer array[] = {1,2,3,4,5,6};

    List<Integer>integerArray = new ArrayList<Integer>();

    //List<Integer>l1 = (List<Integer>)Arrays.asList(array);

    List<Integer>list = (List<Integer>)Arrays.stream(array).boxed().collect(Collectors.toList());
}