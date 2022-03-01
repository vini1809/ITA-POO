package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

import zodiaco.Pessoa;
import zodiaco.Signo;

class TestPessoa {

	 private Pessoa pessoa = null;

	    @Test
	    public void testPessoaAries() {
	        pessoa = new Pessoa(LocalDate.of(1989, Month.APRIL, 1));
	        assertEquals(32, pessoa.getIdade());
	        assertEquals(Signo.Entidade.ARIES, pessoa.getSigno());
	    }

	    @Test
	    public void testPessoaGemeos() {
	        pessoa = new Pessoa(LocalDate.of(1989, Month.MAY, 29));
	        assertEquals(32, pessoa.getIdade());
	        assertEquals(Signo.Entidade.GEMEOS, pessoa.getSigno());
	    }

	    @Test
	    public void testPessoaCancer() {
	        pessoa = new Pessoa(LocalDate.of(2007, Month.JUNE, 24));
	        assertEquals(14, pessoa.getIdade());
	        assertEquals(Signo.Entidade.CANCER, pessoa.getSigno());
	    }


}
