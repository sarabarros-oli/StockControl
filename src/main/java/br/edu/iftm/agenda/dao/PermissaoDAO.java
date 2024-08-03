package br.edu.iftm.agenda.dao;

import br.edu.iftm.agenda.entity.Permissao;
import br.edu.iftm.agenda.entity.Usuario;

public class PermissaoDAO extends GenericDAO<Permissao, Long>{

    @Override
    public Class<Permissao> getClasseEntidade() {
        return Permissao.class;
    }
    
}
