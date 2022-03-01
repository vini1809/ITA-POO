package zodiaco;

import java.time.LocalDate;
import java.time.Month;

public class Principal {

	 public static void main(String[] args) {
	        final LocalDate nascimento = LocalDate.of(1989, Month.SEPTEMBER, 18);
	        Pessoa pessoa = new Pessoa(nascimento);
	        System.out.println("Quem nasceu em " + nascimento + " possui " + pessoa);
	    }

	
}
