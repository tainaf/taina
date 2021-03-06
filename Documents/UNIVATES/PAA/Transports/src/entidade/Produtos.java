package entidade;
// Generated 24/08/2017 20:31:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Produtos generated by hbm2java
 */
@Entity
@Table(name="produtos"
    ,schema="public"
)
public class Produtos  implements java.io.Serializable {


     private int idprodutos;
     private String nome;
     private int peso;
     private String descricao;
     private Set pedidos = new HashSet(0);

    public Produtos() {
    }

	
    public Produtos(int idprodutos, String nome, int peso, String descricao) {
        this.idprodutos = idprodutos;
        this.nome = nome;
        this.peso = peso;
        this.descricao = descricao;
    }
    public Produtos(int idprodutos, String nome, int peso, String descricao, Set pedidos) {
       this.idprodutos = idprodutos;
       this.nome = nome;
       this.peso = peso;
       this.descricao = descricao;
       this.pedidos = pedidos;
    }
   
     @Id 

    
    @Column(name="idprodutos", unique=true, nullable=false)
    public int getIdprodutos() {
        return this.idprodutos;
    }
    
    public void setIdprodutos(int idprodutos) {
        this.idprodutos = idprodutos;
    }

    
    @Column(name="nome", nullable=false, length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="peso", nullable=false)
    public int getPeso() {
        return this.peso;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }

    
    @Column(name="descricao", nullable=false, length=45)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="produtoses")
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }




}


