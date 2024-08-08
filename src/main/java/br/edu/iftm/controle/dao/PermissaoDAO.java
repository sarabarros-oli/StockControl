package br.edu.iftm.controle.dao;

import br.edu.iftm.controle.entity.Permissao;
import br.edu.iftm.controle.entity.Usuario;

public class PermissaoDAO extends GenericDAO<Permissao, Long>{

    @Override
    public Class<Permissao> getClasseEntidade() {
        return Permissao.class;
    }
    
}
