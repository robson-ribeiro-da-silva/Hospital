package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class QuartosPorAla extends Model {
	
	public String numeroQuarto;
	
	@OneToMany(mappedBy="quarto")
	public  List<LeitosPorQuarto> leitos;
	
	@ManyToOne
	@JoinColumn(name="ala_id")
	public AlaHospitalar ala;
	

}
