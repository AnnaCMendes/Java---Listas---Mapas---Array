package com.fatec.estruturas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Meio {

	public static void main(String[] args) {
		// estrutura que chamamos de conjunto
		// qual a diferença de um conjunto para uma lista:
		//quando se usa uma lista se usa uma estrutura do tipo FIFO
		// FIFO ( first ind first out) - estrutura onde o elemento importa
		// Quando utilizamos:
		List<String> textos = new ArrayList();
		textos.add("Anna"); //esse elemento sempre é adicionado ao final da lista
		//com excessão se eu colocar em um índice especifico. 
		// aqui, se colocar-mos elementos repetidos, vão aparecer, na quantidade de repetições que inserimos.
		 
		 
		// Conjuntos: 
		// funciona como se fosse uma sacola
		// B =  [1,2] --- C = [2,1]
		// Não podemos ter elementos repetidos. Se colocar-mos o propio programa irá realizar a remoção dos repetidos.
		
		
		Set<String> conj = new HashSet();
		conj.add("Anna");
		conj.add("Gerson");
		conj.add("Pedro");
		conj.add("Mariana");
		for (String t : conj) {
			System.out.println(t);
			
		}
	}

}
