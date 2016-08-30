package org.money.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movimento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idMovimento;
	private double valor;
	private String descricao;
	private Date dataOcorreu;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 private Tipo tipo;

	public long getIdMovimento() {
		return idMovimento;
	}

	public void setIdMovimento(long idMovimento) {
		this.idMovimento = idMovimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataOcorreu() {
		return dataOcorreu;
	}

	public void setDataOcorreu(Date dataOcorreu) {
		this.dataOcorreu = dataOcorreu;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	

}
