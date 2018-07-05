package controllers;

import java.util.List;

import models.Leito;
import play.mvc.Controller;

public class Leitos extends Controller{
	
	public static void form(Leito leito) {
		render(leito);

	}

	public static void salvar(Leito leito) {
		leito.save();
		listar();

	}

	public static void editar(Long id) {
		Leito leito = Leito.findById(id);
		renderTemplate("Leitos/form.html", leito);

	}

	public static void detalhes(Leito leito) {
		render(leito);

	}

	public static void listar() {
		List<Leito> leitos = Leito.findAll();
		render(leitos);

	}

	public static void remover(Long id) {
		Leito leito = Leito.findById(id);
		leito.delete();
		listar();

	}

}
