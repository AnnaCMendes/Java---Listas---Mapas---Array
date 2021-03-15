package com.fatec.estruturas;

import java.util.HashMap;
import java.util.Map;

public class Final {
	public static void main(String[] args) {
		// python - dicionário - todo dicionário funciona com uma tupla {id:valor} json
		// JAVA - dicionário é mapa 
		// como criar um MAPA no JAVA
		// <chave, valor> --- <k,v>
		
		Map<String, String> mapinha = new HashMap();
		mapinha.put("nome1", "Anna");
		mapinha.put("nome2", "Gerson");
		mapinha.put("nome3", "Pedro");
		
		// remoção de mapa é pela chave especifica
		// adiconar mapa, usamos o put
		
		System.out.println(mapinha.get("nome2"));
	}
}
