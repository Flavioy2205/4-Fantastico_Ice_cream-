package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela FORNECEDORMASSA
* @generated
*/
@Entity
@Table(name = "\"FORNECEDORMASSA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.fornecedormassa")
public class fornecedormassa implements Serializable {

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
    @Column(name = "nomedofornecedor", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomedofornecedor;

    /**
    * @generated
    */
    @Column(name = "tipoproduto", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipoproduto;

    /**
    * @generated
    */
    @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cnpj;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="fk_sorvete_id", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
                    ,
    @JoinColumn(name="fk_sorvete_valor", nullable = true, referencedColumnName = "valor", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
                    
    })
        
        private Sorvete sorvete;

    /**
    * @generated
    */
    @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valor;

    /**
    * @generated
    */
    @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidade;

    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;

    /**
    * Construtor
    * @generated
    */
    public fornecedormassa(){
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
    public fornecedormassa setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nomedofornecedor
    * return nomedofornecedor
    * @generated
    */
    
    public java.lang.String getNomedofornecedor(){
        return this.nomedofornecedor;
    }

    /**
    * Define nomedofornecedor
    * @param nomedofornecedor nomedofornecedor
    * @generated
    */
    public fornecedormassa setNomedofornecedor(java.lang.String nomedofornecedor){
        this.nomedofornecedor = nomedofornecedor;
        return this;
    }
    /**
    * Obtém tipoproduto
    * return tipoproduto
    * @generated
    */
    
    public java.lang.String getTipoproduto(){
        return this.tipoproduto;
    }

    /**
    * Define tipoproduto
    * @param tipoproduto tipoproduto
    * @generated
    */
    public fornecedormassa setTipoproduto(java.lang.String tipoproduto){
        this.tipoproduto = tipoproduto;
        return this;
    }
    /**
    * Obtém cnpj
    * return cnpj
    * @generated
    */
    
    public java.lang.String getCnpj(){
        return this.cnpj;
    }

    /**
    * Define cnpj
    * @param cnpj cnpj
    * @generated
    */
    public fornecedormassa setCnpj(java.lang.String cnpj){
        this.cnpj = cnpj;
        return this;
    }
    /**
    * Obtém sorvete
    * return sorvete
    * @generated
    */
    
    public Sorvete getSorvete(){
        return this.sorvete;
    }

    /**
    * Define sorvete
    * @param sorvete sorvete
    * @generated
    */
    public fornecedormassa setSorvete(Sorvete sorvete){
        this.sorvete = sorvete;
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
    public fornecedormassa setValor(java.lang.Double valor){
        this.valor = valor;
        return this;
    }
    /**
    * Obtém quantidade
    * return quantidade
    * @generated
    */
    
    public java.lang.Integer getQuantidade(){
        return this.quantidade;
    }

    /**
    * Define quantidade
    * @param quantidade quantidade
    * @generated
    */
    public fornecedormassa setQuantidade(java.lang.Integer quantidade){
        this.quantidade = quantidade;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    
    public java.util.Date getData(){
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public fornecedormassa setData(java.util.Date data){
        this.data = data;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
fornecedormassa object = (fornecedormassa)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}