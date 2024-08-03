package br.edu.iftm.agenda.bean;

import br.edu.iftm.agenda.logic.GenericLogic;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import lombok.Getter;

public abstract class GenericBean<E, L extends GenericLogic<E>> implements Serializable {
    
    @Getter
    private E entidade;
    @Getter
    private List<E> entidades;
    //CRIAR - LISTAR - EDITAR
    private enum EstadoTela {
        CRIAR, 
        LISTAR,
        EDITAR
    }
    @Getter
    private EstadoTela estadoDaTela = EstadoTela.LISTAR;
    
    public void novo(){
        try {
            this.entidade = getClasseEntidade().getConstructor().newInstance();
            estadoDaTela = EstadoTela.CRIAR;
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(GenericBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    };
    
    public void salvar() {
        getLogic().salvar(entidade);
        estadoDaTela = EstadoTela.LISTAR;
        FacesMessage fm = new FacesMessage("Salvo com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, fm);
    }
    public void editar(E entidade){
        this.entidade = entidade;
        estadoDaTela  = EstadoTela.EDITAR;
    }
    public void deletar(E entidade) {
        getLogic().deletar(entidade);
        getEntidades().remove(entidade);
    }
    public void listar() {
        if(!estadoDaTela.equals(EstadoTela.LISTAR)) {
            estadoDaTela  = EstadoTela.LISTAR;
            return;
        }
        this.entidades = getLogic().listar();
    }
    
    public abstract L getLogic();
    public abstract Class<E> getClasseEntidade();
    
}
