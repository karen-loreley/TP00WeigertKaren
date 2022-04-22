package ar.edu.unju.edm.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.calculadora;

@Controller
public class CalculadoraControler {
	@GetMapping("/menut")
public String mostrarMenucalculadora(){
	return "menu";
}
	@GetMapping("/calculoSuma")
	public String getSumaPage(@RequestParam (name = "num1")int num1, @RequestParam (name = "num2") int num2, Model model) {
		int resultadoS = 0;
		calculadora nuevaCalculadora = new calculadora();
		nuevaCalculadora.setNumero(num1);
		nuevaCalculadora.setNumerob(num2);
		resultadoS = nuevaCalculadora.resolversuma();
		model.addAttribute("resultadoS", resultadoS);
		
		return "resultado";
	}
	@GetMapping("/calculoResta")
	public String getRestaPage(@RequestParam (name = "num1")int num1, @RequestParam (name = "num2") int num2, Model model) {
		int resultadoR = 0;
		calculadora nuevaCalculadora = new calculadora();
		nuevaCalculadora.setNumero(num1);
		nuevaCalculadora.setNumerob(num2);
		resultadoR = nuevaCalculadora.resolverresta();
		model.addAttribute("resultadoR", resultadoR);
		
		return "resultado";
	}
	@GetMapping("/calculoProducto")
	public String getProductoPage(@RequestParam (name = "num1")int num1, @RequestParam (name = "num2") int num2, Model model) {
		int resultadoM = 0;
		calculadora nuevaCalculadora = new calculadora();
		nuevaCalculadora.setNumero(num1);
		nuevaCalculadora.setNumerob(num2);
		resultadoM = nuevaCalculadora.resolvermultiplicacion();
		model.addAttribute("resultadoM", resultadoM);
		
		return "resultado";
	}
	@GetMapping("/calculoCosiente")
	public String getCosientePage(@RequestParam (name = "num1")int num1, @RequestParam (name = "num2") int num2, Model model) {
		double resultadoD = 0;
		calculadora nuevaCalculadora = new calculadora();
		nuevaCalculadora.setNumero(num1);
		nuevaCalculadora.setNumerob(num2);
		resultadoD = nuevaCalculadora.resolverdivision();
		model.addAttribute("resultadoD", resultadoD);
		
		return "resultado";
	}
	@GetMapping("/calculoPotencia")
	public String getPotenciaPage(@RequestParam (name = "num1")int num1, @RequestParam (name = "num2") int num2, Model model) {
		double resultadoP = 0;
		calculadora nuevaCalculadora = new calculadora();
		nuevaCalculadora.setNumero(num1);
		nuevaCalculadora.setNumerob(num2);
		resultadoP = nuevaCalculadora.potencia();
		model.addAttribute("resultadoP", resultadoP);
		
		return "resultado";
	}
	@GetMapping("/calculoRaiz")
	public String getRaizPage(@RequestParam (name = "num1")int num1, @RequestParam (name = "num2") int num2, Model model) {
		double resultadoRa = 0;
		calculadora nuevaCalculadora = new calculadora();
		nuevaCalculadora.setNumero(num1);
		nuevaCalculadora.setNumerob(num2);
		resultadoRa = nuevaCalculadora.raiz();
		model.addAttribute("resultadoRa", resultadoRa);
		
		return "resultado";
	}

}