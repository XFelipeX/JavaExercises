package com.loiane.estruturadadosvetor.testes;

import com.loiane.estruturadadosvetor.Lista;
import com.loiane.estruturadadosvetor.VetorObjeto;

public class Aula_11 {
	public static void main(String[] args) {
		Lista<String> v = new Lista<>(2);
		v.adiciona("1");
		v.adiciona("2");
		
		System.out.println(v);
	}
}
