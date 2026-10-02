public class stackFrame {
    static void A() 
        {
            b();

        }
         static void b() 
        {
            c();

        }
         static void c() 
        
        {
           System.out.println("Hello");

        }

    
    public static void main(String[]args)
    {
       A();
    }
}
