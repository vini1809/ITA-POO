package CalculoImc;

public class Principal {

	public static void main (String [] args) {
		

		Paciente p1 = new Paciente(90,1.80);
		Paciente p2 = new Paciente(120,1.90);
		Paciente p3 = new Paciente(60,1.85);
		
		System.out.printf("IMC do paciente 1 é: "+p1.calcularIMC()+ ", o dignostico foi: " +p1.diagnostico());
		System.out.printf("\nIMC do paciente 2 é: "+p2.calcularIMC()+ ", o dignostico foi: " +p2.diagnostico());
		System.out.printf("\nIMC do paciente 3 é: "+p3.calcularIMC()+ ", o dignostico foi: " +p3.diagnostico());
}
	
	
}