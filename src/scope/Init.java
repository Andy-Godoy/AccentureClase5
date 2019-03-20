package scope;

class Cli {
}

public class Init {
    public static String m1(Cli c) {
        String s = new String("ESPACIO MEMORIA");
        c = null;
        return s;
    }
    public static void main(String[] args) {        
        Cli z = new Cli();
        String x = m1(z);
        
    }
}
