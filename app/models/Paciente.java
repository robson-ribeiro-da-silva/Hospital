package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Paciente extends Model {
	
	public String nome;
	public String sexo;
	public Date dataNas;
	public String nacionalidade;
	public String naturalCidade;
	public String naturalEstado;
	public String tipoSanguineo;
	public String profissao;
	public String estCivil; 
	public String cpf;
	public String rg;
	public String cartaoSus;
	public String estado;
	public String cep;
	public String cidade;
	public String complemento;
	public String bairro;
	public String rua;
	public int numCasa;
	public String tel;
	public String telAdicional;
	public String email;
	
	@ManyToMany(mappedBy="pacientes")
	public List<Internacao>internacoes;
		
}