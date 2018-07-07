package controllers;

import java.util.Arrays;
import java.util.List;

import com.sun.org.apache.xpath.internal.operations.String;

import models.Medicamento;
import models.Paciente;
import play.mvc.Controller;

public class Medicamentos extends Controller{
	
	public static void form(Medicamento medicamento) {
		List<Integer> horas = Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24});
		List<Paciente> pacientes = Paciente.findAll();
		render(medicamento, horas, pacientes);

	}

	public static void salvar(Medicamento medicamento) {
		
		medicamento.save();
		listar();

	}

	public static void editar(Long id) {
		Medicamento medicamento = Medicamento.findById(id);
		renderTemplate("Medicamentos/form.html", medicamento);

	}

	public static void detalhes(Medicamento medicamento) {
		render(medicamento);

	}

	public static void listar() {
		List<Medicamento> medicamentos = Medicamento.findAll();
		render(medicamentos);

	}

	public static void remover(Long id) {
		Medicamento medicamento = Medicamento.findById(id);
		medicamento.delete();
		listar();

	}

}
