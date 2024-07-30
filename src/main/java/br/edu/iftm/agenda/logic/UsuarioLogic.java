package br.edu.iftm.agenda.logic;

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
    private EntityManager entityManager;
    
    @Override
    public void salvar(Usuario entidade) {
        entidade.setDataCadastro(new Date());
        entityManager.getTransaction().begin();
        entityManager.persist(entidade);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deletar(Usuario entidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> listar() {
        return entityManager.createQuery("from Usuario").getResultList();
    }

    
        
}
