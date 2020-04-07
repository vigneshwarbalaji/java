
public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        int os[] = new int[1];
        int i = 0;
        try 
        {
            i = 1/0;
        }
        catch(NullPointerException e)
        {
            System.out.println("throwable block");
        }
        catch(ArithmeticException e)
        {
            //System.out.println(n.getMessage());
            System.out.println("ArithmeticException");
        } 
        catch (Exception e) 
        {
            //System.out.println(e.getMessage());
            System.out.println("Exception block");
        }
    }
}