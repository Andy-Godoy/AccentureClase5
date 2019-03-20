package implementacionstack;

import java.util.Stack;

public class GrabadorUsuario {
    Stack<Usuario> usuarios = new Stack<>();
    
    public void grabar(Usuario usu) {
        usuarios.push(usu);
    }
    public Usuario volverAtras() {
        return usuarios.pop();
    }
}
