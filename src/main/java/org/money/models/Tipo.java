package org.money.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tipo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idTipo;
	private String descricao;
	private boolean gasto;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Movimento> movimentos;
	
	public long getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(long idTipo) {
		this.idTipo = idTipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isGasto() {
		return gasto;
	}
	public void setGasto(boolean gasto) {
		this.gasto = gasto;
	}
	public List<Movimento> getMovimentos() {
		return movimentos;
	}
	public void setMovimentos(List<Movimento> movimentos) {
		this.movimentos = movimentos;
	}
	

}
