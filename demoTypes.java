public class demoTypes {
    
    public static void main(String[] args) {
        byte b=15;
        short s=20;

        int i=30;
        long l=40l;
        double d=34.44;
        float f=44.55f;
        System.out.println("byte");
        System.out.println("byte+byte:"+(b+b));
        System.out.println("int+byte:"+(b+i));
        System.out.println("short+byte:"+(s+b));
        System.out.println("double+byte:"+(d+b));
        System.out.println("long+byte:"+(l+b));
        System.out.println("float+byte:"+(f+b));

        System.out.println("int");

        System.out.println("int+int:"+(i+i));
        System.out.println("int+byte:"+(b+i));
        System.out.println("short+int:"+(i+s));
        System.out.println("double+int:"+(d+i));
        System.out.println("long+int:"+(l+i));
        System.out.println("float+int:"+(f+i));
        
    }
}
