package models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class LeitosPorQuarto extends Model {
	
	public String numeroLeito;
	public boolean ocupado = false;

	@ManyToOne
	@JoinColumn(name="quarto_id")
	public QuartosPorAla quarto;
	
	
}
