public class OOPSHelloApp {
    public static void main(String[] args) {
        
        if (args.length > 0) {
            // If argument is provided
            System.out.println("Hello " + args[0]);
        } else {
            // Default message
            System.out.println("Hello");
        }
    }
}