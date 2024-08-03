package br.edu.iftm.agenda.dao;

import br.edu.iftm.agenda.entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Long>{

    @Override
    public Class<Usuario> getClasseEntidade() {
        return Usuario.class;
    }
    
}
