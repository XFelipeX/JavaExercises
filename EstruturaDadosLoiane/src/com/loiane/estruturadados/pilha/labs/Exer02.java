package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer02 {
	public static void main(String[] args) {
		Pilha<Integer> pilhaPar = new Pilha<>();
		Pilha<Integer> pilhaImpar = new Pilha<>();
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=10;i++) {
			System.out.println("Digite um número");
			int num = scan.nextInt();
			
			if(num==0) {
				//pilha par
				
				Integer desempilhado = pilhaPar.desempilha();
				
				if(desempilhado==null) {
					System.out.println("a pilha de elementos pares esta vazia");
				}else {
					System.out.println("desempilhando da pilha de pares pois número "+num);
				}
				
				//pilha impar
				
				desempilhado = pilhaImpar.desempilha();
				
				if(desempilhado==null) {
					System.out.println("a pilha de elementos ímpares esta vazia");
				}else {
					System.out.println("desempilhando da pilha de ímpares pois número "+num);
				}
			}
			else if(num%2==0) {
				System.out.println("Número par, empilhando "+num);
				pilhaPar.empilha(num);
			}else{
				System.out.println("Número ímpar, empilhando "+num);
				pilhaImpar.empilha(num);
			}
		}
		
		System.out.println("desempilhando pares");
		while(!pilhaPar.estaVazio()) {
				System.out.println("desempilhando pilha de elementos pares "+pilhaPar.desempilha());
		}
		
		System.out.println("desempilhando ímpares");
		while(!pilhaImpar.estaVazio()) {
			System.out.println("desempilhando pilha de elementos impares "+pilhaImpar.desempilha());
		}
	}
}
