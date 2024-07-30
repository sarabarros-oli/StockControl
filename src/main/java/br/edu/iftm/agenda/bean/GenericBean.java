package br.edu.iftm.agenda.bean;

import br.edu.iftm.agenda.logic.GenericLogic;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;

public abstract class GenericBean<E, L extends GenericLogic<E>> implements Serializable {
    
    @Getter
    private E entidade = novo();
    @Getter
    private List<E> entidades;
    
    public abstract E novo();
    
    public void salvar() {
        getLogic().salvar(entidade);
    }
    public void editar(E entidade){
        this.entidade = entidade;
    }
    public void deletar(E entidade) {
        this.entidades.remove(entidade);
    }
    public void listar() {
        this.entidades = getLogic().listar();
    }
    
    public abstract L getLogic();
    
}
