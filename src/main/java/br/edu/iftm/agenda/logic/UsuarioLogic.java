package br.edu.iftm.agenda.logic;

import br.edu.iftm.agenda.dao.UsuarioDAO;
import br.edu.iftm.agenda.entity.Usuario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author danilo
 */
public class UsuarioLogic implements GenericLogic<Usuario> {
    @Inject
    private UsuarioDAO dao;
    
    @Override
    public void salvar(Usuario entidade) {
        if(entidade.getDataCadastro() == null) {
            entidade.setDataCadastro(new Date());
        }
        dao.salvar(entidade);
    }

    @Override
    public void deletar(Usuario entidade) {
        dao.deletar(entidade.getId());
    }

    @Override
    public List<Usuario> listar() {
        return dao.listar();
    }

    
        
}
