package br.edu.iftm.controle.bean;

import br.edu.iftm.controle.entity.Permissao;
import br.edu.iftm.controle.entity.Usuario;
import br.edu.iftm.controle.logic.GenericLogic;
import br.edu.iftm.controle.logic.UsuarioLogic;
import br.edu.iftm.controle.util.EntityManagerProducer;
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
    public Class<Usuario> getClasseEntidade() {
        return Usuario.class;
    }
    
    @Override
    public UsuarioLogic getLogic() {
        return usuarioLogic;
    }
    
}
