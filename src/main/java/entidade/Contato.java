
package entidade;

import interfaces.TemplateLista;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
@Entity
public class Contato implements Serializable, TemplateLista {

    @OneToMany(mappedBy = "contato",fetch =FetchType.LAZY)
    private List<Telefone> telefones;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 150)
    private String nome;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    
    private Integer idade;
    
     private String nomeMae;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public Object[] getDados() {
       return new Object[]{nome,idade};
    }

    @Override
    public String[] getTitulos() {
       return new String[]{"Nome", "Telefone"};
    }

}
