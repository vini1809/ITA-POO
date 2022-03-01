
public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente (1.78,40);
		Paciente p2 = new Paciente (1.80,60);
		Paciente p3 = new Paciente (1.60,75);
		
		
		
		System.out.printf("IMC do paciente 1 é : "+"%.2f",p1.calculoImc());
		System.out.printf("\nIMC do paciente 2 é : "+"%.2f",p2.calculoImc());
		System.out.printf("\nIMC do paciente 3 é : "+"%.2f",p3.calculoImc());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Diagnóstico do paciente 1 é : "+p1.diagnostico());
		System.out.println("Diagnóstico do paciente 2 é : "+p2.diagnostico());
		System.out.println("Diagnóstico do paciente 3 é : "+p3.diagnostico());
	}	
	
}