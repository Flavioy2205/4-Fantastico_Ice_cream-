package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela FORNECEDORCOPINHO
* @generated
*/
@Entity
@Table(name = "\"FORNECEDORCOPINHO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.fornecedorcopinho")
public class fornecedorcopinho implements Serializable {

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
    @Column(name = "nomefornecedor", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomefornecedor;

    /**
    * @generated
    */
    @Column(name = "tipodoproduto", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipodoproduto;

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
    @Column(name = "tamanhocopo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tamanhocopo;

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
    public fornecedorcopinho(){
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
    public fornecedorcopinho setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nomefornecedor
    * return nomefornecedor
    * @generated
    */
    
    public java.lang.String getNomefornecedor(){
        return this.nomefornecedor;
    }

    /**
    * Define nomefornecedor
    * @param nomefornecedor nomefornecedor
    * @generated
    */
    public fornecedorcopinho setNomefornecedor(java.lang.String nomefornecedor){
        this.nomefornecedor = nomefornecedor;
        return this;
    }
    /**
    * Obtém tipodoproduto
    * return tipodoproduto
    * @generated
    */
    
    public java.lang.String getTipodoproduto(){
        return this.tipodoproduto;
    }

    /**
    * Define tipodoproduto
    * @param tipodoproduto tipodoproduto
    * @generated
    */
    public fornecedorcopinho setTipodoproduto(java.lang.String tipodoproduto){
        this.tipodoproduto = tipodoproduto;
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
    public fornecedorcopinho setCnpj(java.lang.String cnpj){
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
    public fornecedorcopinho setSorvete(Sorvete sorvete){
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
    public fornecedorcopinho setValor(java.lang.Double valor){
        this.valor = valor;
        return this;
    }
    /**
    * Obtém tamanhocopo
    * return tamanhocopo
    * @generated
    */
    
    public java.lang.String getTamanhocopo(){
        return this.tamanhocopo;
    }

    /**
    * Define tamanhocopo
    * @param tamanhocopo tamanhocopo
    * @generated
    */
    public fornecedorcopinho setTamanhocopo(java.lang.String tamanhocopo){
        this.tamanhocopo = tamanhocopo;
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
    public fornecedorcopinho setQuantidade(java.lang.Integer quantidade){
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
    public fornecedorcopinho setData(java.util.Date data){
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
fornecedorcopinho object = (fornecedorcopinho)obj;
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