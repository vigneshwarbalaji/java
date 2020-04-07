
public class CatchInsideFinally 
{
    public static void main(String[] args) 
    {
        try 
        {
            i = 1/0;    
        }
        finally{
            try{
                
            }
            catch(ArithmeticException e)
            {

            }
        }    
    }
}