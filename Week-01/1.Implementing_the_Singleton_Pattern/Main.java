public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        // Verifying both are the same instance
        System.out.println("Are both instances same? " + (s1 == s2));
    }
}
