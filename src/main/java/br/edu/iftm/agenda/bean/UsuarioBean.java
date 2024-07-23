package br.edu.iftm.agenda.bean;

import br.edu.iftm.agenda.entity.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Getter;

@Named
@SessionScoped
public class UsuarioBean implements Serializable{
 
    @Getter
    private Usuario entidade = new Usuario();
    @Getter
    private List<Usuario> entidades;
    
    public void salvar() {
        //Chamar banco de dados
        
    }
    
    
    public void listar() {
        //Chamar banco de dados
    }
    
}
