package com.loiane.estruturadados.fila.labs;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class PsAtendimento implements Runnable{

	private FilaComPrioridade<Pessoa> fila;
	
	public PsAtendimento(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {
		while(!fila.estaVazio()) {
			System.out.println(fila.desenfileira()+" atendida");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Atendimento concluído");
		
	}

}
