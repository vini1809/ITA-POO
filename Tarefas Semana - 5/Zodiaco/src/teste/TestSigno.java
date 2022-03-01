package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.time.MonthDay;

import org.junit.jupiter.api.Test;

import zodiaco.Signo;

class TestSigno {

	 private Signo signo = null;

	    @Test
	    public void testAries() {
	        signo = new Signo(MonthDay.of(Month.MARCH, 21));
	        assertEquals(Signo.Entidade.ARIES, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.APRIL, 1));
	        assertEquals(Signo.Entidade.ARIES, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.APRIL, 20));
	        assertEquals(Signo.Entidade.ARIES, signo.getEntidade());
	    }

	    @Test
	    public void testTouro() {
	        signo = new Signo(MonthDay.of(Month.APRIL, 21));
	        assertEquals(Signo.Entidade.TOURO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.MAY, 1));
	        assertEquals(Signo.Entidade.TOURO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.MAY, 20));
	        assertEquals(Signo.Entidade.TOURO, signo.getEntidade());
	    }

	    @Test
	    public void testGemeos() {
	        signo = new Signo(MonthDay.of(Month.MAY, 21));
	        assertEquals(Signo.Entidade.GEMEOS, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.JUNE, 1));
	        assertEquals(Signo.Entidade.GEMEOS, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.JUNE, 20));
	        assertEquals(Signo.Entidade.GEMEOS, signo.getEntidade());
	    }

	    @Test
	    public void testCancer() {
	        signo = new Signo(MonthDay.of(Month.JUNE, 21));
	        assertEquals(Signo.Entidade.CANCER, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.JULY, 1));
	        assertEquals(Signo.Entidade.CANCER, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.JULY, 21));
	        assertEquals(Signo.Entidade.CANCER, signo.getEntidade());
	    }

	    @Test
	    public void testLeao() {
	        signo = new Signo(MonthDay.of(Month.JULY, 22));
	        assertEquals(Signo.Entidade.LEAO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.AUGUST, 1));
	        assertEquals(Signo.Entidade.LEAO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.AUGUST, 22));
	        assertEquals(Signo.Entidade.LEAO, signo.getEntidade());
	    }

	    @Test
	    public void testVirgem() {
	        signo = new Signo(MonthDay.of(Month.AUGUST, 23));
	        assertEquals(Signo.Entidade.VIRGEM, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.SEPTEMBER, 1));
	        assertEquals(Signo.Entidade.VIRGEM, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.SEPTEMBER, 22));
	        assertEquals(Signo.Entidade.VIRGEM, signo.getEntidade());
	    }

	    @Test
	    public void testLibra() {
	        signo = new Signo(MonthDay.of(Month.SEPTEMBER, 23));
	        assertEquals(Signo.Entidade.LIBRA, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.OCTOBER, 1));
	        assertEquals(Signo.Entidade.LIBRA, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.OCTOBER, 22));
	        assertEquals(Signo.Entidade.LIBRA, signo.getEntidade());
	    }

	    @Test
	    public void testEscorpiao() {
	        signo = new Signo(MonthDay.of(Month.OCTOBER, 23));
	        assertEquals(Signo.Entidade.ESCORPIAO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.NOVEMBER, 1));
	        assertEquals(Signo.Entidade.ESCORPIAO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.NOVEMBER, 21));
	        assertEquals(Signo.Entidade.ESCORPIAO, signo.getEntidade());
	    }

	    @Test
	    public void testSagitario() {
	        signo = new Signo(MonthDay.of(Month.NOVEMBER, 22));
	        assertEquals(Signo.Entidade.SAGITARIO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.DECEMBER, 1));
	        assertEquals(Signo.Entidade.SAGITARIO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.DECEMBER, 21));
	        assertEquals(Signo.Entidade.SAGITARIO, signo.getEntidade());
	    }

	    @Test
	    public void testCapricornio() {
	        signo = new Signo(MonthDay.of(Month.DECEMBER, 22));
	        assertEquals(Signo.Entidade.CAPRICORNIO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.JANUARY, 1));
	        assertEquals(Signo.Entidade.CAPRICORNIO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.JANUARY, 20));
	        assertEquals(Signo.Entidade.CAPRICORNIO, signo.getEntidade());
	    }

	    @Test
	    public void testAquario() {
	        signo = new Signo(MonthDay.of(Month.JANUARY, 21));
	        assertEquals(Signo.Entidade.AQUARIO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.FEBRUARY, 1));
	        assertEquals(Signo.Entidade.AQUARIO, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.FEBRUARY, 19));
	        assertEquals(Signo.Entidade.AQUARIO, signo.getEntidade());
	    }

	    @Test
	    public void testPeixes() {
	        signo = new Signo(MonthDay.of(Month.FEBRUARY, 20));
	        assertEquals(Signo.Entidade.PEIXES, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.MARCH, 1));
	        assertEquals(Signo.Entidade.PEIXES, signo.getEntidade());
	        signo = new Signo(MonthDay.of(Month.MARCH, 20));
	        assertEquals(Signo.Entidade.PEIXES, signo.getEntidade());
	    }


}
