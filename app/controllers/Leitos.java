package controllers;

import java.util.List;

import models.LeitosPorQuarto;
import play.mvc.Controller;

public class Leitos extends Controller{
	
	public static void form(LeitosPorQuarto leitosporquarto) {
		render(leitosporquarto);

	}

	public static void salvar(LeitosPorQuarto leitosporquarto) {
		leitosporquarto.save();
		listar();

	}

	public static void editar(Long id) {
		LeitosPorQuarto leitosporquarto = LeitosPorQuarto.findById(id);
		renderTemplate("Leitos/form.html", leitosporquarto);

	}

	public static void detalhes(LeitosPorQuarto leitosporquarto) {
		render(leitosporquarto);

	}

	public static void listar() {
		List<LeitosPorQuarto> leitosporquartos = LeitosPorQuarto.findAll();
		render(leitosporquartos);

	}

	public static void remover(Long id) {
		LeitosPorQuarto leitosporquarto = LeitosPorQuarto.findById(id);
		leitosporquarto.delete();
		listar();

	}

}
