package br.unitins.calculadora.model;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped

public class Calculadora{
	private int numeroA;
	private int numeroB;
	private int resultado;
	
	public int getNumeroA() {
		return numeroA;
	}
	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}
	public int getNumeroB() {
		return numeroB;
	}
	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
}
