package controllers;

import java.util.Arrays;
import java.util.List;

import models.Ala;
import play.mvc.Controller;

public class Alas extends Controller {

	public static void form(Ala ala) {
		List<String> tiposAla = Arrays.asList(new String[]{"Pediátria Masculina" ,"Pediátria Feminina" ,"Adulto Masculina", "Adulto Feminina"});
		render(ala, tiposAla);
	}

	public static void salvar(Ala ala) {
		ala.save();
		listar();

	}

	public static void editar(Long id) {
		Ala ala = Ala.findById(id);
		renderTemplate("Alas/form.html", ala);
	}

	public static void detalhes(Ala ala) {
		render(ala);

	}

	public static void listar() {
		List<Ala> alas = Ala.findAll();
		render(alas);

	}

	public static void remover(Long id) {
		Ala ala = Ala.findById(id);
		ala.delete();
		listar();

	}

}
