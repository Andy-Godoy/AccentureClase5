package estructuraset;

import java.util.HashSet;
import java.util.Set;

public class Init {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("1","Laura","Mendoza");
        Usuario u2 = new Usuario("1","Laura","Mendoza");
        
        Set<Usuario> conjuntoDeUsuarios = new HashSet<Usuario>();
        conjuntoDeUsuarios.add(u1);
        conjuntoDeUsuarios.add(u2);
        
        System.out.println(conjuntoDeUsuarios.size());
        for (Usuario u : conjuntoDeUsuarios) {
            System.out.println(u.hashCode());
        }
    }
}
