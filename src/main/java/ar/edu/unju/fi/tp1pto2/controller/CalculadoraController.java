package ar.edu.unju.fi.tp1pto2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp1pto2.model.Calculadora;

@Controller
public class CalculadoraController {
	@Autowired
	private Calculadora calculadora;
	
	/**
	 * Método que calcula la operacion suma op1+op2 
	 * @param op1 es un double
	 * @param op2 es un double
	 * @return una vista con el resultado de la operacion suma.
	 */
	@GetMapping("/ejecutarsuma")
	public ModelAndView getSuma(@RequestParam(name = "nro1") String op1, @RequestParam(name = "nro2") String op2) {
		this.calculadora.setOp1(Double.parseDouble(op1));
		this.calculadora.setOp2(Double.parseDouble(op2));
		String suma = String.valueOf(this.calculadora.sumar());
		ModelAndView modelAndView = new ModelAndView("resultado");
		modelAndView.addObject("resultado", suma);
		return modelAndView;
	}
	
	/**
	 * Método que calcula la operación resta op1-op2
	 * @param op1 es un double
	 * @param op2 es un double
	 * @return una vista con el resultado de la operación resta.
	 */
	@GetMapping("/ejecutarsustraccion")
	public ModelAndView getResta(@RequestParam(name = "nro1") String op1, @RequestParam(name = "nro2") String op2) {
		this.calculadora.setOp1(Double.parseDouble(op1));
		this.calculadora.setOp2(Double.parseDouble(op2));
		String resta = String.valueOf(this.calculadora.restar());
		ModelAndView modelAndView = new ModelAndView("resultado");
		modelAndView.addObject("resultado", resta);
		return modelAndView;
	}
	
	/**
	 * Método que calcula la operación producto op1*op2
	 * @param op1 es un double
	 * @param op2 es un double
	 * @return una vista con el resultado de la operación producto
	 */
	@GetMapping("/ejecutarproducto")
	public ModelAndView getProducto(@RequestParam(name = "nro1") String op1, @RequestParam(name = "nro2") String op2) {
		this.calculadora.setOp1(Double.parseDouble(op1));
		this.calculadora.setOp2(Double.parseDouble(op2));
		String producto = String.valueOf(this.calculadora.multiplicar());
		ModelAndView modelAndView = new ModelAndView("resultado");
		modelAndView.addObject("resultado", producto);
		return modelAndView;
	}
	
	/**
	 * Método que calcula la operación cociente op1/op2
	 * @param op1 es un double
	 * @param op2 es un double
	 * @return una vista con el resultado de la operación cociente.
	 */
	@GetMapping("/ejecutarcociente")
	public ModelAndView getCociente(@RequestParam(name = "nro1") String op1, @RequestParam(name = "nro2") String op2) {
		this.calculadora.setOp1(Double.parseDouble(op1));
		this.calculadora.setOp2(Double.parseDouble(op2));
		String cociente = String.valueOf(this.calculadora.dividir());
		ModelAndView modelAndView = new ModelAndView("resultado");
		modelAndView.addObject("resultado", cociente);
		return modelAndView;
	}
	
	/**
	 * Método que direcciona a la página calculadora.html
	 * @return la vista calculadora.html
	 */
	@GetMapping("/calculadora")
	public String getCalculadora() {
		return "menuoperaciones";
	}

}
