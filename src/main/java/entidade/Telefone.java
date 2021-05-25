
package entidade;

import interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefone implements Serializable, TemplateLista{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "numero_telefone",length = 15)
    private String numeroTelefone;
  
    @ManyToOne(fetch = FetchType.LAZY)
    private Contato contato;
    
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return numeroTelefone;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{numeroTelefone, contato};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"Numero","Contato"};
    }
    
    
    
}
