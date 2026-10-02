public class typeCAsting {
    public static void main(String[] args) {
        byte a=10;
        int b=a;//no loss
        long i=100000000;//no loss
        float f=i;//no loss
        double g=f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(i);
        System.out.println(f);
        System.out.println(g);


         double t=100;
         float y=(float)t;//type casting (explicit)
         short h=(short)t;
         System.out.println(y);
         System.out.println(h);

         int l=150;
         byte n =(byte)l;
         System.out.println(n);

         
         
         
     }

}
