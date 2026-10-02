/*import java.util.Scanner;
public class sum {


    public static int add(int n1, int n2)
    {
        int sum= n1+n2;
        return sum ;
    }
     public static int sub(int n1, int n2)
    {
        int sub= n1-n2;
        return sub ;
        }

    public static void main(String[]args)
    {

        int a,b;
       System.out.println("Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int c=add(a,b);
        int d=sub(a,b);
        System.out.println("The sum of two numbers is: "+c);
        System.out.println("The difference of two numbers is: "+d);
    }
    
}*/
/*class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println(sum);
    }
}*/
class Main1 {
    public static void main(String[] args) {

      int a = 10;
      int b = 20;

       System.out.println("before swapping");
       System.out.println("a= "+a+" b= "+b);
      
       int temp = a;
       a = b;
       b = temp;
       System.out.println("after swapping");
       System.out.println("a= "+a+" b= "+b);

    
    }
}