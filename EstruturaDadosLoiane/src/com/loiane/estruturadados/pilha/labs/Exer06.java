package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer06 {
	public static void main(String[] args) {
		imprimeResultado("A+B(B*2))");
	}

	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolosBalanceados(String expressao) {
		char simbolo, topo;
		Stack<Character> pilha = new Stack<>();
		
		for(int i=0; i<expressao.length();i++) {
			simbolo = expressao.charAt(i);
			
			if(ABRE.indexOf(simbolo) > -1) {
				pilha.push(simbolo);
			} else if (FECHA.indexOf(simbolo)>-1) {
				if(pilha.isEmpty()) {
					return false;
				}else {
					topo = pilha.pop();
					
					if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}
		
		}
		
		return true;
	}
	
	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " está balanceado? "+ verificaSimbolosBalanceados(expressao));
	}
}
