package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import play.db.jpa.Model;

@Entity
public class Medico extends Model {
	
	public String nome;
	public String estCivil;
	public String naturalCidade;
	public String nacionalidade;
	public String sexo;
	
	@Temporal(TemporalType.DATE)
	public Date dataNas;
	
	public String cpf;
	public String rg;
	public String email;
	public String nomeFacul;
	public int anoConc;
	public String residencia;
	public String orgResid;
	public String espPrincipal;
	public String titFormacao;
	public String cep;
	public String estResidencia;
	public String complemento;
	public String telefone;
	public String numCRM;
	public String cidade;
	public String bairro;
	public String rua;
	public int numCasa;
	public String estado;
	
	@ManyToMany(mappedBy="medicos")
	public List<Internacao>internacoes;

}
