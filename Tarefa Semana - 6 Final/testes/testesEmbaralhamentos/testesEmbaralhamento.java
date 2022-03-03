package testesEmbaralhamentos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jogo.EmbaralhadorDois;
import jogo.EmbaralhadorUm;

class testesEmbaralhamento {

	@Test
	public void testeEmbaralhadorUm() {

			EmbaralhadorUm e = new EmbaralhadorUm();
			String s = "teste";
			assertNotEquals(e.embaralhar(s), s);
	}
	
	@Test
	public void testeEmbaralhadorDois() {

			EmbaralhadorDois e = new EmbaralhadorDois();
			String s = "teste";
			assertEquals(e.embaralhar(s), "etset");
	}
}
