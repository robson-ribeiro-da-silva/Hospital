package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Medicamento extends Model {
	
	public String nomeMedicamento;
	public String fabricante;
	public Medicamento(String nomeMedicamento, String fabricante) {
		super();
		this.nomeMedicamento = nomeMedicamento;
		this.fabricante = fabricante;
	}
	public String getNomeMedicamento() {
		return nomeMedicamento;
	}
	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
