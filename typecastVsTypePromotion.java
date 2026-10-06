public class typecastVsTypePromotion {
    public static void main(String[]args)
    {
        //error no out put
     /*  int a=10;
      byte b=a;
      System.out.println(b);*///error
//type cast chance to data loss
     /*  int a=10;
      byte b=(byte)a;
      System.out.println(b);*///no error

//no data loss
      /*  int a=10;
      int b=11;
      System.out.println(b);*///no data loss

      //how long stores in float
      long l=2134567890876543l;
      float f=l;
      System.out.println(l);
      System.out.println(f);

      //how long stores in double

  
      double d=l;
      System.out.println(l);
      System.out.println(d);

    }
}
