package br.com.fiap.modelo;

public class Computador {

	private String marcaPc;
	private double precoPc;
	private Monitor monitor;
	
	//Setters (Entrada)
	
	public void setMarcaPc (String marcaPc){
		this.marcaPc = marcaPc;
	}
	
	public void setPrecoPc (double precoPc){
		this.precoPc = precoPc;
	}
	
	public void setMonitor (Monitor monitor){
		this.monitor = monitor;
	}
	
	//getters (saida)
	public String getMarcaPc(){
		return marcaPc;	
	}
	
	public double getPrecoPc(){
		return precoPc;
	}
	
	public Monitor getMonitor(){
		return monitor;
	}
	

	}
	
