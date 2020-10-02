package com.loiane.estruturadadosvetor.testes;
import com.loiane.estruturadadosvetor.VetorObjeto;

public class Aula_10 {
	public static void main(String[] args) {
		VetorObjeto v = new VetorObjeto(3);
		
		Contato c1 = new Contato("Contato 1","123432","contato@gmail.com");
		Contato c2 = new Contato("Contato 2","12r3432","contato@gmail.com");
		Contato c3 = new Contato("Contato 3","123w432","contato@gmail.com");
		Contato c4 = new Contato("Contato 1","123432","contato@gmail.com");
		
		v.adiciona(c1);
		v.adiciona(c2);
		v.adiciona(c3);
		
		System.out.println("Tamanho do vetor "+v.tamanho());
		int pos = v.busca(c4);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor!");
		}else {
			System.out.println("Elemento não existe no vetor!");
		}
		
		System.out.println(v);
	}
}
