package entidade;
// Generated 24/08/2017 20:31:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pessoa generated by hbm2java
 */
@Entity
@Table(name="pessoa"
    ,schema="public"
)
public class Pessoa  implements java.io.Serializable {


     private int idpessoa;
     private Endereco endereco;
     private String nome;
     private String cpf;
     private String rg;
     private String telefone;
     private String sexo;
     private String email;
     private Set usuarios = new HashSet(0);
     private Set pedidos = new HashSet(0);

    public Pessoa() {
    }

	
    public Pessoa(int idpessoa, Endereco endereco, String nome, String cpf, String rg, String telefone, String sexo, String email) {
        this.idpessoa = idpessoa;
        this.endereco = endereco;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.sexo = sexo;
        this.email = email;
    }
    public Pessoa(int idpessoa, Endereco endereco, String nome, String cpf, String rg, String telefone, String sexo, String email, Set usuarios, Set pedidos) {
       this.idpessoa = idpessoa;
       this.endereco = endereco;
       this.nome = nome;
       this.cpf = cpf;
       this.rg = rg;
       this.telefone = telefone;
       this.sexo = sexo;
       this.email = email;
       this.usuarios = usuarios;
       this.pedidos = pedidos;
    }
   
     @Id 

    
    @Column(name="idpessoa", unique=true, nullable=false)
    public int getIdpessoa() {
        return this.idpessoa;
    }
    
    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idendereco", nullable=false)
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    @Column(name="nome", nullable=false, length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="cpf", nullable=false, length=11)
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    @Column(name="rg", nullable=false, length=10)
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }

    
    @Column(name="telefone", nullable=false, length=11)
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    @Column(name="sexo", nullable=false, length=1)
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa")
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa")
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }




}


