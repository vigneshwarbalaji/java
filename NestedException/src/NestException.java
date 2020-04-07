
public class NestException 
{
    public static void main(String[] args) 
    {

        try
        {
            try
            {
                try
                {
                    int j = 1/0;              
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Array index out of bound exception");
                }

            }
            catch(NullPointerException e)
            {
                System.out.println("Null Pointer exception");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("This is an arithmetic exception");
        }

        String str = null;
        int num [] = {1,2};
        int k = 0;
        
        try 
        {
            if (str.equals("string")) 
            {
                System.out.println("equal");
            }
            else
            {
                System.out.println("Notequal");
            }
            try 
            {
                int j = num[3];
                try 
                {
                    int i = 1/0;    
                } 
                catch (ArithmeticException e) 
                {
                    System.out.println("Inside arithmetic exception");
                }
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
                //TODO: handle exception
                System.out.println("Inside array index outofbound exception");
            }
        } 
        catch (NullPointerException e) 
        {
            //TODO: handle exception
            System.out.println("Inside Nullpointer exception");
        }
    }

}   