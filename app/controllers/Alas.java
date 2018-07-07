package controllers;

import java.util.Arrays;
import java.util.List;
<<<<<<< HEAD

import models.Ala;
import models.Quarto;
=======
import models.AlaHospitalar;
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
import play.mvc.Controller;

public class Alas extends Controller {

	public static void form() {
		List<Quarto> quartos = Quarto.findAll();
		List<String> tiposAla = Arrays.asList(new String[]{"Pediátria Masculina" ,"Pediátria Feminina" ,"Adulto Masculina", "Adulto Feminina"});
		render( quartos, tiposAla);
	}

	public static void salvar(Ala ala, List<String> quartosIDs) {
		
		String IDs = "-1";
		if(quartosIDs != null)
			IDs = String.join(", ", quartosIDs);
			
		String query = "select q from Quarto q where q.id in (" + IDs + ")";			
		List<Quarto> quartosAssociados = Quarto.find(query).fetch();
		for(Quarto quarto: quartosAssociados) {
			quarto.ala = ala;
			quarto.save();
		}
		
		query = "select q from Quarto q where q.id not in ("+ IDs + ")";	
		System.out.println(query);
		List<Quarto> quartosNaoAssociado = Quarto.find(query).fetch();
		for(Quarto quarto: quartosNaoAssociado) {
			if(quarto.ala != null && 
			   quarto.ala.id == ala.id) {
				quarto.ala = null;
				quarto.save();
			}
		}		
		
		ala.save();
		listar();
	}

	public static void editar(Long id) {
		Ala ala = Ala.findById(id);
		renderTemplate("Alas/form.html", ala);
	}

<<<<<<< HEAD
	public static void detalhes(Ala ala) {
		render(ala);

=======
	public static void detalhes(AlaHospitalar alahospitalar) {
		render(alahospitalar);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

	public static void listar() {
<<<<<<< HEAD
		List<Ala> alas = Ala.findAll();
		render(alas);

=======
		List<AlaHospitalar> alahospitalares = AlaHospitalar.findAll();
		render(alahospitalares);
>>>>>>> branch 'master' of https://github.com/robson-ribeiro-da-silva/Hospital.git
	}

	public static void remover(Long id) {
		Ala ala = Ala.findById(id);
		ala.delete();
		listar();
	}

}