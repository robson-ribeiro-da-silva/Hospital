package controllers;

import java.util.Arrays;
import java.util.List;
import models.Medico;
import play.mvc.Controller;
import play.mvc.With;

@With(Seguranca.class)
public class Medicos extends Controller{
	
	public static void form(Medico medico) {
		List<String> sexos = Arrays.asList(new String[]{"Masculino", "Feminino", "Outros",});
		List<String> estados = Arrays.asList(new String[]{"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Sul", "Rio Grande do Norte", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"});
		List<String> nacionalidades = Arrays.asList(new String[]{"Brasileiro(a)", "Estrangeiro(a)"});
		List<String> estadosCivis = Arrays.asList(new String[]{"Solteiro(a)", "Casado(a)", "Divociado(a)", "Viúvo(a)", "Outro"});
		render(medico, sexos, estados, nacionalidades, estadosCivis);
	}
	
	public static void salvar(Medico medico) {
		medico.save();
		flash.success("Médico cadastrado com sucesso!");
		listar();
	}
	
	public static void editar(Long id) {
		Medico medico = Medico.findById(id);
		List<String> sexos = Arrays.asList(new String[]{"Masculino", "Feminino", "Outros",});
		List<String> estados = Arrays.asList(new String[]{"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Sul", "Rio Grande do Norte", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"});
		List<String> nacionalidades = Arrays.asList(new String[]{"Brasileiro(a)", "Estrangeiro(a)"});
		List<String> estadosCivis = Arrays.asList(new String[]{"Solteiro(a)", "Casado(a)", "Divociado(a)", "Viúvo(a)", "Outro"});
		renderTemplate("Medicos/editar.html", medico, sexos, estados, nacionalidades, estadosCivis);
	}
	
	public static void detalhes(Medico medico) {
		render(medico);
	}
	
	public static void listar() {
		List<Medico> medicos = Medico.findAll();
		render(medicos);
	}
	
	public static void remover(Long id) {
		Medico medico = Medico.findById(id);
		medico.delete();
		flash.success("Médico removido com sucesso!");
		listar();
	}

}
