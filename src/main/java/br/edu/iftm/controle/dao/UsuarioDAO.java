package br.edu.iftm.controle.dao;

import br.edu.iftm.controle.entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Long>{

    @Override
    public Class<Usuario> getClasseEntidade() {
        return Usuario.class;
    }
    
}
