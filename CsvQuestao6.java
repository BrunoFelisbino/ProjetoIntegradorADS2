package br.com.projeto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CsvQuestao6 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
  
   private int ano;
  private  int quantidade;

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CsvQuestao6 other = (CsvQuestao6) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    public CsvQuestao6(int id, int ano, int quantidade) {
        super();
        this.id = id;
        this.ano = ano;
        this.quantidade = quantidade;
    }

}
