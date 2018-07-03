package controllers;

import java.util.List;

import models.QuartosPorAla;
import play.mvc.Controller;

public class Quartos extends Controller{
	
	public static void form(QuartosPorAla quartosporala) {
		render(quartosporala);

	}

	public static void salvar(QuartosPorAla quartosporala) {
		quartosporala.save();
		listar();

	}

	public static void editar(Long id) {
		QuartosPorAla quartosporala = QuartosPorAla.findById(id);
		renderTemplate("Quartos/form.html", quartosporala);

	}

	public static void detalhes(QuartosPorAla quartosporala) {
		render(quartosporala);

	}

	public static void listar() {
		List<QuartosPorAla> quartosporalas = QuartosPorAla.findAll();
		render(quartosporalas);

	}

	public static void remover(Long id) {
		QuartosPorAla quartosporala = QuartosPorAla.findById(id);
		quartosporala.delete();
		listar();

	}

}
