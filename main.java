package br.com.fiap.main;

import br.com.fiap.modelo.Computador;
import br.com.fiap.modelo.Monitor;

public class TestComputador {
	
	
	
	public static class TesteComputador{
		
		public static void main (String[] args){
			
			Computador objComputador = new Computador();
			Monitor objMonitor = new Monitor();
		
			objComputador.setMarcaPc("Positivo");
			objComputador.setPrecoPc(2.500);
			objComputador.setMonitor(objMonitor);
			
			objMonitor.setPolegada(20);
			objMonitor.setMarca("hp");
			objMonitor.setHertz("Hz 60");
			objMonitor.setPreco(500);
			
			System.out.println("Marca Computador: " + objComputador.getMarcaPc() +
			"\nMarca Monitor: " + objComputador.getMonitor().getMarca());
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
}
