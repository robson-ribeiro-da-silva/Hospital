package controllers;

import java.util.Arrays;
import java.util.List;

import models.AlaHospitalar;
import play.mvc.Controller;

public class Alas extends Controller {

	public static void form(AlaHospitalar alahospitalar) {
		List<String> tiposAla = Arrays.asList(new String[]{"Pediátria","Pediátria Masculina" ,"Pediátria Feminina" ,"Adulto Masculina", "Adulto Feminina"});
		render(alahospitalar, tiposAla);
	}

	public static void salvar(AlaHospitalar alahospitalar) {
		alahospitalar.save();
		listar();

	}

	public static void editar(Long id) {
		AlaHospitalar alahospitalar = AlaHospitalar.findById(id);
		renderTemplate("Alas/form.html", alahospitalar);
	}

	public static void detalhes(AlaHospitalar alahospitalar) {
		render(alahospitalar);

	}

	public static void listar() {
		List<AlaHospitalar> alahospitalares = AlaHospitalar.findAll();
		render(alahospitalares);

	}

	public static void remover(Long id) {
		AlaHospitalar alahospitalar = AlaHospitalar.findById(id);
		alahospitalar.delete();
		listar();

	}

}
