class interOverflow {
    public static void main(String[] args) {
       byte b=127;
       System.out.println("Before overflow: "+b);
       b++;
       System.out.println("After overflow: "+b);
       b++;
       System.out.println("After overflow: "+b);
    }
}           