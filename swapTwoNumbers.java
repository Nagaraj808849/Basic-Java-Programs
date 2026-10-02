public class swapTwoNumbers {
    public static void main(String[]args)
    {
       int a=10;
       int b=20;
       System.out.println("Before Swapping");
       System.out.println("A:"+a+"\tB:"+b);

       a=a+b;
       b=a-b;
       a=a-b;


       System.out.println("After Swapping");
       System.out.println("A:"+a+"\tB:"+b);

    }
}
