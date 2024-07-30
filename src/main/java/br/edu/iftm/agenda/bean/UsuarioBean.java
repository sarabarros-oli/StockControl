package br.edu.iftm.agenda.bean;

import br.edu.iftm.agenda.entity.Permissao;
import br.edu.iftm.agenda.entity.Usuario;
import br.edu.iftm.agenda.logic.GenericLogic;
import br.edu.iftm.agenda.logic.UsuarioLogic;
import br.edu.iftm.agenda.util.EntityManagerProducer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import lombok.Getter;

@Named
@SessionScoped
public class UsuarioBean extends GenericBean<Usuario, UsuarioLogic>{
    
    @Inject
    private UsuarioLogic usuarioLogic;

    @Override
    public Usuario novo() {
        return new Usuario();
    }
    
    @Override
    public UsuarioLogic getLogic() {
        return usuarioLogic;
    }
    
}
