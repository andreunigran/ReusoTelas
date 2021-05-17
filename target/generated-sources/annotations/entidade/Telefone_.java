package entidade;

import entidade.Contato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-10T21:29:13")
@StaticMetamodel(Telefone.class)
public class Telefone_ { 

    public static volatile SingularAttribute<Telefone, String> numeroTelefone;
    public static volatile SingularAttribute<Telefone, Integer> id;
    public static volatile SingularAttribute<Telefone, Contato> contato;

}