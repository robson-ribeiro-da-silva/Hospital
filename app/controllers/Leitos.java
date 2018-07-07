package controllers;

import java.util.List;
<<<<<<< HEAD

import com.sun.org.apache.xpath.internal.operations.String;

import models.Leito;
import models.Medicamento;
import models.Paciente;
=======
import models.LeitosPorQuarto;
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
import play.mvc.Controller;

public class Leitos extends Controller{
	
<<<<<<< HEAD
	public static void form(Leito leito) {
		//List<Medicamento> medicamentos = Medicamento.findAll();
		render(leito);

=======
	public static void form(LeitosPorQuarto leitosporquarto) {
		render(leitosporquarto);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

	public static void salvar(Leito leito) {
		/*
		if(medicamentosIDs == null || medicamentosIDs.isEmpty()) {
			leito.medicamentos = null;
		} else {
			String IDs = "(" + String.join(", ", medicamentosIDs) + ")";
			java.lang.String query = "select m from Medicamento m where m.id in " + IDs;
			List<Medicamento> medicamentos = Medicamento.find(query).fetch();
			leito.medicamentos = medicamentos;
		}*/
		
		leito.save();
		listar();
	}

	public static void editar(Long id) {
<<<<<<< HEAD
		Leito leito = Leito.findById(id);
		renderTemplate("Leitos/form.html", leito);

=======
		LeitosPorQuarto leitosporquarto = LeitosPorQuarto.findById(id);
		renderTemplate("Leitos/form.html", leitosporquarto);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

<<<<<<< HEAD
	public static void detalhes(Leito leito) {
		render(leito);

=======
	public static void detalhes(LeitosPorQuarto leitosporquarto) {
		render(leitosporquarto);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

	public static void listar() {
<<<<<<< HEAD
		List<Leito> leitos = Leito.findAll();
		render(leitos);

=======
		List<LeitosPorQuarto> leitosporquartos = LeitosPorQuarto.findAll();
		render(leitosporquartos);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

	public static void remover(Long id) {
		Leito leito = Leito.findById(id);
		leito.delete();
		listar();
	}

}