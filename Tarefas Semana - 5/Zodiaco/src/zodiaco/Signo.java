package zodiaco;

import java.time.Month;
import java.time.MonthDay;
import java.util.TreeMap;

public class Signo {
	
	 private Entidade entidade;

	    public Signo(MonthDay monthDay) {
	        this.entidade = HOROSCOPO.floorEntry(monthDay).getValue();
	    }

	    public Entidade getEntidade() {
	        return this.entidade;
	    }

	    @Override
	    public String toString() {

	        return this.entidade.name();
	    }

	    public enum Entidade {
	        ARIES,
	        TOURO,
	        GEMEOS,
	        CANCER,
	        LEAO,
	        VIRGEM,
	        LIBRA,
	        ESCORPIAO,
	        SAGITARIO,
	        CAPRICORNIO,
	        AQUARIO,
	        PEIXES
	    }

	    public static final TreeMap<MonthDay, Entidade> HOROSCOPO = new TreeMap<MonthDay, Entidade>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
	        put(MonthDay.of(Month.MARCH, 21), Entidade.ARIES);
	        put(MonthDay.of(Month.APRIL, 21), Entidade.TOURO);
	        put(MonthDay.of(Month.MAY, 21), Entidade.GEMEOS);
	        put(MonthDay.of(Month.JUNE, 21), Entidade.CANCER);
	        put(MonthDay.of(Month.JULY, 22), Entidade.LEAO);
	        put(MonthDay.of(Month.AUGUST, 23), Entidade.VIRGEM);
	        put(MonthDay.of(Month.SEPTEMBER, 23), Entidade.LIBRA);
	        put(MonthDay.of(Month.OCTOBER, 23), Entidade.ESCORPIAO);
	        put(MonthDay.of(Month.NOVEMBER, 22 ), Entidade.SAGITARIO);
	        put(MonthDay.of(Month.DECEMBER, 22), Entidade.CAPRICORNIO);
	        put(MonthDay.of(Month.JANUARY, 1), Entidade.CAPRICORNIO);
	        put(MonthDay.of(Month.JANUARY, 21), Entidade.AQUARIO);
	        put(MonthDay.of(Month.FEBRUARY, 20), Entidade.PEIXES);
	    }};


}
