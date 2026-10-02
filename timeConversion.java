public class timeConversion {
    public static void main (String[]args)
    {
        //second
      int sec=60000;
      int min=sec/60;
      int hour=sec/3600;

      System.out.println("sec:"+sec);
      System.out.println("min:"+min);
      System.out.println("hour:"+hour);
//minute
    min=60;
    sec=min*60;
    hour=min/60;
      System.out.println("min:"+min);
      System.out.println("sec:"+sec);
      System.out.println("hour:"+hour);

      //hour
      hour=10;
      min=hour*60;
      sec=hour*3600;


      System.out.println("min:"+min);
      System.out.println("sec:"+sec);
      System.out.println("hour:"+hour);



      
    }
}
