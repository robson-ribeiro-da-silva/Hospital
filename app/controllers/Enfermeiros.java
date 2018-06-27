package controllers;

import java.util.Arrays;
import java.util.List;
import models.Enfermeiro;
import play.mvc.Controller;
import play.mvc.With;

@With(Seguranca.class)
public class Enfermeiros extends Controller {
	
	public static void form(Enfermeiro enfermeiro) {
		List<String> sexos = Arrays.asList(new String[]{"Masculino", "Feminino", "Outros",});
		List<String> estados = Arrays.asList(new String[]{"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Sul", "Rio Grande do Norte", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"});
		List<String> nacionalidades = Arrays.asList(new String[]{"Brasileiro(a)", "Estrangeiro(a)"});
		List<String> estadosCivis = Arrays.asList(new String[]{"Solteiro(a)", "Casado(a)", "Divociado(a)", "Viúvo(a)", "Outro"});
		render(enfermeiro, sexos, estados, nacionalidades, estadosCivis);
	}
	
	public static void salvar(Enfermeiro enfermeiro) {
		enfermeiro.save();
		flash.success("Enfermeiro cadastrado com sucesso!");
		listar();
	}
	
	public static void editar(Long id) {
		Enfermeiro enfermeiro = Enfermeiro.findById(id);
		List<String> sexos = Arrays.asList(new String[]{"Masculino", "Feminino", "Outros",});
		List<String> estados = Arrays.asList(new String[]{"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Sul", "Rio Grande do Norte", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"});
		List<String> nacionalidades = Arrays.asList(new String[]{"Brasileiro(a)", "Estrangeiro(a)"});
		List<String> estadosCivis = Arrays.asList(new String[]{"Solteiro(a)", "Casado(a)", "Divociado(a)", "Viúvo(a)", "Outro"});
		renderTemplate("Enfermeiros/editar.html", enfermeiro, sexos, estados, nacionalidades, estadosCivis);
	}
	
	public static void detalhes(Enfermeiro enfermeiro) {
		render(enfermeiro);
	}
	
	public static void listar() {
		List<Enfermeiro> enfermeiros = Enfermeiro.findAll();
		render(enfermeiros);
	}
	
	public static void remover(Long id) {
		Enfermeiro enfermeiro = Enfermeiro.findById(id);
		enfermeiro.delete();
		flash.success("Enfermeiro removido com sucesso!");
		listar();
	}

}