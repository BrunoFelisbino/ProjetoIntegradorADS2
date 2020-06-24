package br.com.projeto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CsvQuestao7 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
  
   private String ano;
  private  int quantidade;

  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public String getAno() {
      return ano;
  }

  public void setAno(String ano) {
      this.ano = ano;
  }

  public int getQuantidade() {
      return quantidade;
  }

  public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
  }

 
  @Override
  public boolean equals(Object obj) {
      if (this == obj)
          return true;
      if (obj == null)
          return false;
      if (getClass() != obj.getClass())
          return false;
      CsvQuestao7 other = (CsvQuestao7) obj;
      if (ano != other.ano)
          return false;
      return true;
  }

  public CsvQuestao7(int id, String ano, int quantidade) {
      this.id = id;
      this.ano = ano;
      this.quantidade = quantidade;
  }



  
}
