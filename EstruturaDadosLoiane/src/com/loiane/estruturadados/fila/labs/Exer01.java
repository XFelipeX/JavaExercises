package com.loiane.estruturadados.fila.labs;

import java.util.LinkedList;
import java.util.Queue;

public class Exer01 {
	public static void main(String[] args) {
		Queue<Documento> filaImpressora = new LinkedList<>();
		
		filaImpressora.add(new Documento("A",1));
		filaImpressora.add(new Documento("B",3));
		filaImpressora.add(new Documento("C",9));
		filaImpressora.add(new Documento("D",2));
		filaImpressora.add(new Documento("E",1));
		
		while(!filaImpressora.isEmpty()) {
			Documento doc = filaImpressora.remove();
			System.out.println("Imprimindo documento "+ doc.getNome());
			try {
				Thread.sleep(200 * doc.getNumFolhas());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Todos os documentos foram impressos.");
	}
}
