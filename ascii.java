public class ascii {
    public static void main(String[] args) {
        System.out.println("ASCII Characters:");
        for (int i = 1; i < 128; i++) {
            System.out.println(i + ": " + (char) i);
        }
    }
}
