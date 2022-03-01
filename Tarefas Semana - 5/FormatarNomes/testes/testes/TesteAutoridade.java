package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import interfaces.Autoridade;
import interfaces.ComTitulo;
import interfaces.FormatadorNome;
import interfaces.Informal;
import interfaces.Respeitoso;

class TesteAutoridade {

	@Test
	public void testeInformal()
	{
		FormatadorNome fn = new Informal();
		Autoridade a = new Autoridade ("Breno", "Oliveira", fn);
		assertEquals(a.getTratamento(), "Breno");
	}
	
	@Test
	public void testeRespeitosoMasculino ()
	{
		FormatadorNome fn = new Respeitoso(true, false);
		Autoridade a = new Autoridade ("Breno", "Oliveira", fn);	
		assertEquals(a.getTratamento(), "Sr. Breno Oliveira");
	}
	
	@Test
	public void testeRespeitosoFeminino ()
	{
		FormatadorNome fn = new Respeitoso(false, true);
		Autoridade a = new Autoridade ("Isabele", "Ferreira", fn);	
		assertEquals(a.getTratamento(), "Sra. Isabele Ferreira");
	}
	
	@Test
	public void testeComTitulo ()
	{
		FormatadorNome fn = new ComTitulo("Magn�fico");
		Autoridade a = new Autoridade ("Breno", "Oliveira", fn);			
		assertEquals(a.getTratamento(), "Magn�fico Breno Oliveira");
	}


}
