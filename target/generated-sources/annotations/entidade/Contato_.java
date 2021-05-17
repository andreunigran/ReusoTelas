package entidade;

import entidade.Telefone;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-10T21:29:13")
@StaticMetamodel(Contato.class)
public class Contato_ { 

    public static volatile SingularAttribute<Contato, Integer> idade;
    public static volatile SingularAttribute<Contato, String> nome;
    public static volatile SingularAttribute<Contato, Integer> id;
    public static volatile SingularAttribute<Contato, Date> dataNascimento;
    public static volatile ListAttribute<Contato, Telefone> telefones;
    public static volatile SingularAttribute<Contato, String> nomeMae;

}