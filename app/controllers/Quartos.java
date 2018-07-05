package controllers;

import java.util.List;

import models.Leito;
import models.Quarto;
import play.mvc.Controller;

public class Quartos extends Controller{
	
	public static void form() {
		List<Leito> leitos = Leito.findAll();
		render(leitos);
	}

	public static void salvar(Quarto quarto, List<String> leitosIDs) {
		
		if(leitosIDs == null || leitosIDs.isEmpty()) {
			quarto.leitos = null;
		} else {
			String IDs = "(" + String.join(", ", leitosIDs) + ")";
			String query = "select l from Leito l where l.id in " + IDs;
			List<Leito> leitos = Leito.find(query).fetch();
			quarto.leitos = leitos;
		}
		quarto.save();
		flash.success("quarto salvo com sucesso!");
		listar();

	}

	public static void editar(Long id) {
		Quarto quarto = Leito.findById(id);
		renderTemplate("Quartos/form.html", quarto);

	}

	public static void detalhes(Quarto quarto) {
		render(quarto);

	}

	public static void listar() {
		List<Quarto> quartos = Quarto.findAll();
		render(quartos);

	}

	public static void remover(Long id) {
		Quarto quarto = Quarto.findById(id);
		quarto.delete();
		listar();

	}

}
