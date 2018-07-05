package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Medicamento extends Model {
	
	public String nomeMedicamento;
	public String fabricante;
	
}
