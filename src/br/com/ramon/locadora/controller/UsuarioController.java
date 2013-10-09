
package br.com.ramon.locadora.controller;

import br.com.ramon.locadora.model.Usuario;
import br.com.ramon.locadora.model.persistencia.UsuarioDAOImplements;
import br.com.ramon.locadora.model.persistencia.dao.UsuarioDAO;
import java.util.List;


public class UsuarioController {
    public int salvar(Usuario u){
        UsuarioDAO dao = new UsuarioDAOImplements();
        return dao.salve(u);
    }
    public List<Usuario> listarTodos(){
    UsuarioDAO dao = new UsuarioDAOImplements();
    return dao.listAll();
    }
}
