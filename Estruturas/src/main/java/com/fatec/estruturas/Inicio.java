package com.fatec.estruturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {
		// qunado você usou phyton
		// String[] lista;
		// quando usar JAVA isso não é uma lista
		// em JAVA lista é Array
		// Array em C é (vector)
		// tamanho fixo - String[] 
		//String[] = new String [5];
		//String[] lista = null;
		//lista[0] = "A"; lista[4] = "F";
		
		List<String> textos = new ArrayList();
		textos.add("Qualquer coisa");
		// método de adicionar coisas
		textos.remove(0);
		// método de remover
		int tamanho = textos.size();
		// métodos para verificar o tamanho
		boolean estaVazio = textos.isEmpty();
		// verificar se a lista está vazia, método booleano
		textos.add(0, "novo");
		//inserir em uma posição completa
		
		
		//--------------------------------------------------------
	
		
		textos.add("Gerson");
		textos.add("Pedro");
		textos.add("Anna");
		
		Collections.sort(textos);
		
		
		
		// metodos base para ordenação de listas
		// utilizamos o Collections, que contem um metodo chamado sort, que recebe uma lista
		
		for (String t : textos) {
			System.out.println(t);
			
		/* existe uma estrutura de dados prontos, com tudo que uma estrutura de dados do 
		  tipo lista precisa para ordenar, inserir elemento, podemos percorrer a lsita com foreach, 
		  posso remover elementos em uma certa posição, e entre outros.
		*/

			
			
		}
		
	}

}
