package com.fatec.estruturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {
		// qunado voc� usou phyton
		// String[] lista;
		// quando usar JAVA isso n�o � uma lista
		// em JAVA lista � Array
		// Array em C � (vector)
		// tamanho fixo - String[] 
		//String[] = new String [5];
		//String[] lista = null;
		//lista[0] = "A"; lista[4] = "F";
		
		List<String> textos = new ArrayList();
		textos.add("Qualquer coisa");
		// m�todo de adicionar coisas
		textos.remove(0);
		// m�todo de remover
		int tamanho = textos.size();
		// m�todos para verificar o tamanho
		boolean estaVazio = textos.isEmpty();
		// verificar se a lista est� vazia, m�todo booleano
		textos.add(0, "novo");
		//inserir em uma posi��o completa
		
		
		//--------------------------------------------------------
	
		
		textos.add("Gerson");
		textos.add("Pedro");
		textos.add("Anna");
		
		Collections.sort(textos);
		
		
		
		// metodos base para ordena��o de listas
		// utilizamos o Collections, que contem um metodo chamado sort, que recebe uma lista
		
		for (String t : textos) {
			System.out.println(t);
			
		/* existe uma estrutura de dados prontos, com tudo que uma estrutura de dados do 
		  tipo lista precisa para ordenar, inserir elemento, podemos percorrer a lsita com foreach, 
		  posso remover elementos em uma certa posi��o, e entre outros.
		*/

			
			
		}
		
	}

}
