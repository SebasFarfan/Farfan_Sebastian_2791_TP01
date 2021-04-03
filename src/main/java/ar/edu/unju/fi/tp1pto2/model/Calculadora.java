package ar.edu.unju.fi.tp1pto2.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private double op1;
	private double op2;
	public Calculadora(double op1, double op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}
	public Calculadora() {
		super();
	}
	public double getOp1() {
		return op1;
	}
	public void setOp1(double op1) {
		this.op1 = op1;
	}
	public double getOp2() {
		return op2;
	}
	public void setOp2(double op2) {
		this.op2 = op2;
	}
	
	public double sumar() {
		return this.op1+this.op2;
	}
	
	public double restar() {
		return this.op1-this.op2;
	}
	
	public double multiplicar() {
		return this.op1*this.op2;
	}
	
	public double dividir() {
		double a = 0;
		try {
			a=this.op1/this.op2;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			a=0;
		}
		return a;
	}

}
