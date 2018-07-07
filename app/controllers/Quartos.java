package controllers;

import java.util.List;
<<<<<<< HEAD

import models.Leito;
import models.Quarto;
=======
import models.QuartosPorAla;
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
import play.mvc.Controller;

public class Quartos extends Controller{
	
<<<<<<< HEAD
	public static void form() {
		List<Leito> leitos = Leito.findAll();
		render(leitos);
=======
	public static void form(QuartosPorAla quartosporala) {
		render(quartosporala);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

	public static void salvar(Quarto quarto, List<String> leitosIDs) {
		
		String IDs = "-1";
		if(leitosIDs != null)
			IDs = String.join(", ", leitosIDs);
			
		String query = "select l from Leito l where l.id in (" + IDs + ")";			
		List<Leito> leitosAssociados = Leito.find(query).fetch();
		for(Leito leito: leitosAssociados) {
			leito.quarto = quarto;
			leito.save();
		}
		
		query = "select l from Leito l where l.id not in ("+ IDs + ")";	
		System.out.println(query);
		List<Leito> leitosNaoAssociados = Leito.find(query).fetch();
		for(Leito leito: leitosNaoAssociados) {
			if(leito.quarto != null && 
			  leito.quarto.id == quarto.id) {
				leito.quarto = null;
				leito.save();
			}
		}
		quarto.save();
		flash.success("quarto salvo com sucesso!");
		listar();
	}

	public static void editar(Long id) {
<<<<<<< HEAD
		Quarto quarto = Leito.findById(id);
		renderTemplate("Quartos/form.html", quarto);

=======
		QuartosPorAla quartosporala = QuartosPorAla.findById(id);
		renderTemplate("Quartos/form.html", quartosporala);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

<<<<<<< HEAD
	public static void detalhes(Quarto quarto) {
		render(quarto);

=======
	public static void detalhes(QuartosPorAla quartosporala) {
		render(quartosporala);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

	public static void listar() {
<<<<<<< HEAD
		List<Quarto> quartos = Quarto.findAll();
		render(quartos);

=======
		List<QuartosPorAla> quartosporalas = QuartosPorAla.findAll();
		render(quartosporalas);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

	public static void remover(Long id) {
		Quarto quarto = Quarto.findById(id);
		quarto.delete();
		listar();
	}
}