package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer04 {
	public static void main(String[] args) {
		Stack<Livro> stack = new Stack<>();
		
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
		
		System.out.println("Pilha de livros criada, pilha está vazia? "+stack.isEmpty());
		
		System.out.println("Epilhando livros:");
		
		stack.push(livroA);
		stack.push(livroB);
		stack.push(livroC);
		stack.push(livroD);
		stack.push(livroE);
		stack.push(livroF);
		
		System.out.println(stack.size()+" livros foram empilhados:");
		System.out.println(stack);
		
		System.out.println("Pilha de livros criada, pilha está vazia? "+stack.isEmpty());
		
		System.out.println("Espiando o topo da pilha: "+stack.peek());
		
		System.out.println("Desempilhando livros:");
		
		while(!stack.isEmpty()) {
			System.out.println("Desempilhando "+stack.pop());
		}
		
		System.out.println("Todos os livros foram desempilhados, pilha vazia:"+stack.isEmpty());

	}
}
