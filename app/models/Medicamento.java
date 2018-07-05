package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Medicamento extends Model {
	
	public String nomeMedicamento;
	public String fabricante;
	
	public Date dataPrescrita;
	public int horariodosagem;
	public Date dataAplicar;
	

}
