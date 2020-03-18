package br.unitins.calculadora.controller;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.palmas.calculadora.model.Calculadora;
import br.unitins.calculadora.application.Util;

@Named
@ApplicationScoped

public class CalculadoraController implements Serializable {

	private static final long serialVersionUID = 9127578866360663950L;
	
	private Calculadora calculadora;
	private int result=0;
	
	public Calculadora getCalculadora() {
		if(calculadora == null) 
			calculadora = new Calculadora();
		return calculadora;
	}
	
	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
	public void somando() {
		this.result = getCalculadora().getNumeroA() + getCalculadora().getNumeroB();
		calculadora.setResultado(result);
	}
	public void subtracao() {
		this.result = getCalculadora().getNumeroA() - getCalculadora().getNumeroB();
		calculadora.setResultado(result);
	}
	public void multiplicacao() {
		this.result = getCalculadora().getNumeroA() * getCalculadora().getNumeroB();
		calculadora.setResultado(result);
	}
	public void divisao() {
		this.result = getCalculadora().getNumeroA() / getCalculadora().getNumeroB();
		calculadora.setResultado(result);
	}	
}
