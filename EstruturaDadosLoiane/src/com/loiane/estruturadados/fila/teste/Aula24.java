package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Aula24 {
	public static void main(String[] args) {
		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
		
		fila.enfileira(new Paciente("A",0));
		fila.enfileira(new Paciente("B",1));
		fila.enfileira(new Paciente("C",3));
		
		System.out.println(fila);
		
		fila.desenfileira();
		
		System.out.println(fila);
		
	}
}
