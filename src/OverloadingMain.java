public class OverloadingMain {
    // Overloading main method is allowed, but it is not recommended.
    public static void main(int num) {
        System.out.println("int num = " + num);
    }

    public static void main(String[] args) {
        main(32);
    }
}
