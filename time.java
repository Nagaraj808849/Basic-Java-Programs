public class time {//method area
   public static void main(String[]args)
   {
    int a=10;//stack
    int b=40;//stack
    int c=a+b;//stack
    String str=new String("sum"+c);//heap
    System.out.println(str+c);

   }
    }

