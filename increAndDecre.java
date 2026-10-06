public class increAndDecre {
    public static void main(String[]args)
    {
        System.out.println("pre increment and post increment");
        int a=10;
        System.out.println(a++);
        System.out.println(a);

        System.out.println(a++);
        System.out.println(a);
        
        System.out.println(++a);
        System.out.println(a);

         System.out.println("pre decrement and post decrement");
         a=14;
        System.out.println(a--);//14
        System.out.println(a);//13

        System.out.println(a--);//13
        System.out.println(a);//12
        
        System.out.println(--a);//11
        System.out.println(a);//11

         System.out.println(a--);//11
        System.out.println(a);//10

        System.out.println("assignment with post increment ");
        int c=200;
        int d=c++;
        System.out.println(c);
        System.out.println(d);


       System.out.println("assignment with post increment ");
         c=200;
         d=++c;
        System.out.println(c);
        System.out.println(d);

         System.out.println("assignment with post decrement ");
         c=200;
         d=c--;
        System.out.println(c);
        System.out.println(d);

          System.out.println("assignment with pre decrement ");
         c=200;
         d=--c;
        System.out.println(c);
        System.out.println(d);

          System.out.println("assignment with simple expression ");
          int h=10;
          System.out.println(h++ +5);
          System.out.println(h);

          System.out.println(++h +5);
          System.out.println(h);

        System.out.println("assignment with complex expression ");
        h=10;
          System.out.println(h++ + ++h);//22
          System.out.println(h++ - ++h);//-1
          
          System.out.println(++h -++h);
          System.out.println(++h + h++);
          System.out.println(h);
          System.out.println(++h -(--h));

          System.out.println("assignment with char increment ");

          char s='a';
          System.out.println(s+1);
          System.out.println(s);

          System.out.println(++s);
          System.out.println(s);
           System.out.println("assignment with char decrement ");

          char s1='a';
          System.out.println(s1--);
          System.out.println(s1);

          System.out.println(--s1);
          System.out.println(s1);

          System.out.println("Assinment on boolean:connt be compled");
          /*boolean flag=true;
          flag++;
          ++flag;
          flag--;
          --flag */

        System.out.println("Assinment on fixed values:connt be compled");
        /*100++;
        ++100
        --100
        100-- */
         System.out.println("Assinment on mixed expression");
          h=12;
          System.out.println(h++ + (--h));
          System.out.println(h-- - ++h);
          
       
          System.out.println(h);
          System.out.println(++h -(--h));


         System.out.println("Ascii or unicode value ");
         char ch='A';
         System.out.println((char)(ch+1));






        

    }
}
