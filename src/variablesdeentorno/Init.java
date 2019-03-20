package variablesdeentorno;

public class Init {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
        
        System.out.println(System.getProperty("usuario"));
        System.out.println(System.getProperty("password"));
        
        for (String s : System.getenv().keySet()) {
            System.out.println("key:" + s);
            System.out.println("value: " + System.getenv(s));
        }
    }
}
