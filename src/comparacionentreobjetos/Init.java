package comparacionentreobjetos;

public class Init {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("1","Laura","Mendoza");
        Usuario u2 = new Usuario("1","Laura","Mendoza");
        
        System.out.println("Comparacion entre usuarios");
        System.out.println(u1 == u2);
        
        System.out.println("Comparacion con equals");
        System.out.println(u1.equals(u2));
    }
}
