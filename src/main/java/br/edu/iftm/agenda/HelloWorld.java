package br.edu.iftm.agenda;

import br.edu.iftm.agenda.entity.Usuario;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Getter;

@Named
@SessionScoped
public class HelloWorld implements Serializable {
    
    @Getter
    private String mensagem = "Hello JSF";
    
}
