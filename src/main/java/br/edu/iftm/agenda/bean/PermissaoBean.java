package br.edu.iftm.agenda.bean;

import br.edu.iftm.agenda.entity.Permissao;
import br.edu.iftm.agenda.entity.Permissao;
import br.edu.iftm.agenda.logic.GenericLogic;
import br.edu.iftm.agenda.logic.PermissaoLogic;
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
public class PermissaoBean extends GenericBean<Permissao, PermissaoLogic>{
    
    @Inject
    private PermissaoLogic usuarioLogic;

    @Override
    public Class<Permissao> getClasseEntidade() {
        return Permissao.class;
    }
    
    @Override
    public PermissaoLogic getLogic() {
        return usuarioLogic;
    }
    
}
