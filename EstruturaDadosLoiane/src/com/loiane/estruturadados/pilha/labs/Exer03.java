package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer03 {
	public static void main(String[] args) {
		Pilha<Livro> pilha = new Pilha<>();
		
		Livro livroA = new Livro();
		livroA.setNome("A menina que roubava livros");
		livroA.setAutor("luana");
		livroA.setAnolancamento(1999);
		livroA.setIsbn("#324324235");
		
		Livro livroB = new Livro();
		livroB.setNome("Harry Potter");
		livroB.setAutor("luana");
		livroB.setAnolancamento(1999);
		livroB.setIsbn("#324324235");
		
		Livro livroC = new Livro();
		livroC.setNome("Como influenciar pessoas");
		livroC.setAutor("joao");
		livroC.setAnolancamento(1999);
		livroC.setIsbn("#324324235");
		
		Livro livroD = new Livro();
		livroD.setNome("O mundo assombrado peloes demônios");
		livroD.setAutor("maria");
		livroD.setAnolancamento(1999);
		livroD.setIsbn("#324324235");
		
		Livro livroE = new Livro();
		livroE.setNome("Hyper Science");
		livroE.setAutor("rodrigo");
		livroE.setAnolancamento(1999);
		livroE.setIsbn("#324324235");
		
		Livro livroF = new Livro();
		livroF.setNome("Assassinato no expresso do oriente");
		livroF.setAutor("joaquim");
		livroF.setAnolancamento(1999);
		livroF.setIsbn("#324324235");
		
		System.out.println("Pilha de livros criada, pilha está vazia? "+pilha.estaVazio());
		
		System.out.println("Epilhando livros:");
		
		pilha.empilha(livroA);
		pilha.empilha(livroB);
		pilha.empilha(livroC);
		pilha.empilha(livroD);
		pilha.empilha(livroE);
		pilha.empilha(livroF);
		
		System.out.println(pilha.getTamanho()+" livros foram empilhados:");
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criada, pilha está vazia? "+pilha.estaVazio());
		
		System.out.println("Espiando o topo da pilha: "+pilha.topo());
		
		System.out.println("Desempilhando livros:");
		
		while(!pilha.estaVazio()) {
			System.out.println("Desempilhando "+pilha.desempilha());
		}
		
		System.out.println("Todos os livros foram desempilhados, pilha vazia:"+pilha.estaVazio());

	}
}
