public class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton singleInstance;

    // Step 2: Private constructor to restrict instantiation from outside
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Public method to provide access to the instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
