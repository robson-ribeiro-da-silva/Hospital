package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;


import play.db.jpa.Model;

@Entity
public class Leito extends Model {
	
	public String numeroLeito;
	public boolean ocupado = false;

	@ManyToMany(mappedBy="leitos")
	public List<Quarto> quartos;
	
	
}
