package zodiaco;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	
	  private int idade;
	  private Signo signo;

	    public Pessoa(LocalDate dataNascimento) {
	        this.idade = (int) dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS);
	        this.signo = new Signo(MonthDay.of(dataNascimento.getMonth(), dataNascimento.getDayOfMonth()));
	    }

	    public int getIdade() {
	        return this.idade;
	    }

	
	    public Signo.Entidade getSigno() {
	        return this.signo.getEntidade();
	    }

	    @Override
	    public String toString() {
	        return "Idade: " + this.idade + "\tSigno: " + this.signo;
	    }

}
