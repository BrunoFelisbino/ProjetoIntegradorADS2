package br.com.projeto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CsvQuestao9  implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String questao;
	private int qunatidade;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestao() {
		return questao;
	}
	public void setQuestao(String questao) {
		this.questao = questao;
	}
	public int getQunatidade() {
		return qunatidade;
	}
	public void setQunatidade(int qunatidade) {
		this.qunatidade = qunatidade;
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CsvQuestao9 other = (CsvQuestao9) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public CsvQuestao9(int id, String questao, int qunatidade) {
		super();
		this.id = id;
		this.questao = questao;
		this.qunatidade = qunatidade;
	}
	
	
	

}
