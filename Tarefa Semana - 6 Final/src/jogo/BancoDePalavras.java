package jogo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BancoDePalavras {
	
private ArrayList<String> palavras = new ArrayList<String>();
	
	private void leitor() throws IOException {
		
	try {
			palavras.clear();		
			BufferedReader lerArq = new BufferedReader(new FileReader("arquivo.txt"));
			String linha = lerArq.readLine();
			while (linha != null)
			{
				palavras.add(linha.toLowerCase()); 
				 linha = lerArq.readLine();
			}
			lerArq.close();

		} catch (FileNotFoundException e) {
			
			System.out.println("Arquivo n�o encontrado");
		}
	}
	
	private ArrayList <String> getListaPalavras () throws IOException{
		
		this.leitor();
		return palavras; 

	}

	public String getPalavraAleatoria () throws IOException
	{
	
		 @SuppressWarnings("unchecked")
		ArrayList<String> palavrasCopia = (ArrayList<String>) getListaPalavras().clone(); 
		 
		Collections.shuffle(palavrasCopia); 
		String a = palavrasCopia.get(0);
		return a;
	}

}
