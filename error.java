public class error {
    static int  add()
    {
        return 100;
    }
    public static void main(String[] args) {
        int a=2;
        int b=4;
        int area = 2*(a+b);
        //fix
        System.out.println("area of circle:"+area);//logical error
        //wrong return type
        System.out.println(add());//wrong return type
        int age=20;//duplicate local variable error
       age=25;//change the variable name otherwise update the value
       int Age=30;
        System.out.println(age);
        System.out.println(Age);
        int f=100;//data type miss match
       //byte g=f;//data type miss match
       //fix
       int g=f;

       

    }
}
