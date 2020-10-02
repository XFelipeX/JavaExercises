package com.loiane.estruturadadosvetor.testes;

import java.util.ArrayList;

public class Aula_12 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("A");
		arrayList.add("C");

		System.out.println(arrayList);
		
		arrayList.add(1, "B");

		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		
		if(existe) {
			System.out.println("Elemento existe no Array");
		}else {
			System.out.println("Elemento não existe no Array");
		}
		
		int pos = arrayList.indexOf("B");
		
		if(pos>-1) {
			System.out.println("pos "+pos);
		}else {
			System.out.println("pos inválida");
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
	}
}
