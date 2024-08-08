/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.controle.dao;

import br.edu.iftm.controle.entity.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author danilo
 */
public abstract class GenericDAO<E, ID> implements Serializable{
    @Inject
    private EntityManager entityManager;
    
    public void salvar(E entidade) {
        
        entityManager.getTransaction().begin();
        entityManager.merge(entidade);
        entityManager.getTransaction().commit();
    }

    public void deletar(ID id) {
        entityManager.getTransaction().begin();
        E entidade = entityManager.find(getClasseEntidade(), id);
        entityManager.remove(entidade);
        entityManager.getTransaction().commit();
    }

    public List<E> listar() {
        return entityManager.createQuery("from "+getClasseEntidade().getName()).getResultList();
    }
    public abstract Class<E> getClasseEntidade();   
}
