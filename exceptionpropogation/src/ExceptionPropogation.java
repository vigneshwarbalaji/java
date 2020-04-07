
public class ExceptionPropogation 
{
    void m()
    {
        int i = 1/0;
    }
    void n()
    {
        m();
    }
    void o()
    {
        try 
        {
            n();    
        } catch (Exception e) {

            System.out.println("Exception handled");
            //TODO: handle exception
        }
    }
    public static void main(String[] args) 
    {
        ExceptionPropogation ep = new ExceptionPropogation();
        ep.o();
    }
}