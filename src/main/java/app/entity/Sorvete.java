package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela SORVETE
* @generated
*/
@Entity
@IdClass(SorvetePK.class)
@Table(name = "\"SORVETE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Sorvete")
public class Sorvete implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Id
    @Column(name = "valor", nullable = true, insertable=true, updatable=true)
        private java.lang.Double valor;

    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * @generated
    */
    @Column(name = "sabor", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String sabor;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User user;

    /**
    * @generated
    */
    @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipo;

    /**
    * Construtor
    * @generated
    */
    public Sorvete(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Sorvete setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Sorvete setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém sabor
    * return sabor
    * @generated
    */
    
    public java.lang.String getSabor(){
        return this.sabor;
    }

    /**
    * Define sabor
    * @param sabor sabor
    * @generated
    */
    public Sorvete setSabor(java.lang.String sabor){
        this.sabor = sabor;
        return this;
    }
    /**
    * Obtém valor
    * return valor
    * @generated
    */
    
    public java.lang.Double getValor(){
        return this.valor;
    }

    /**
    * Define valor
    * @param valor valor
    * @generated
    */
    public Sorvete setValor(java.lang.Double valor){
        this.valor = valor;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    
    public User getUser(){
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Sorvete setUser(User user){
        this.user = user;
        return this;
    }
    /**
    * Obtém tipo
    * return tipo
    * @generated
    */
    
    public java.lang.String getTipo(){
        return this.tipo;
    }

    /**
    * Define tipo
    * @param tipo tipo
    * @generated
    */
    public Sorvete setTipo(java.lang.String tipo){
        this.tipo = tipo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Sorvete object = (Sorvete)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        if (valor != null ? !valor.equals(object.valor) : object.valor != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        result = 31 * result + ((valor == null) ? 0 : valor.hashCode());
        return result;
    }

}