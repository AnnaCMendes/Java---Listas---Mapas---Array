# Java---Listas---Mapas---Array

Aprendemos : 

- Listas (Array)
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

- Conjuntos (FIFO)

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

- Mapas
		// python - dicionário - todo dicionário funciona com uma tupla {id:valor} json
		// JAVA - dicionário é mapa 
		// como criar um MAPA no JAVA
		// <chave, valor> --- <k,v>
