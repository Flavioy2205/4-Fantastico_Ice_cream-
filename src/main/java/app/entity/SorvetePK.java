package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class SorvetePK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  private java.lang.Double valor;

  /**
   * Construtor
   * @generated
   */
  public SorvetePK(){
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
  public SorvetePK setId(java.lang.String id){
    this.id = id;
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
  public SorvetePK setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
SorvetePK object = (SorvetePK)obj;
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
