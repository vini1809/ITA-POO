
public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente (1.78,40);
		Paciente p2 = new Paciente (1.80,60);
		Paciente p3 = new Paciente (1.60,75);
		
		
		
		System.out.printf("IMC do paciente 1 � : "+"%.2f",p1.calculoImc());
		System.out.printf("\nIMC do paciente 2 � : "+"%.2f",p2.calculoImc());
		System.out.printf("\nIMC do paciente 3 � : "+"%.2f",p3.calculoImc());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Diagn�stico do paciente 1 � : "+p1.diagnostico());
		System.out.println("Diagn�stico do paciente 2 � : "+p2.diagnostico());
		System.out.println("Diagn�stico do paciente 3 � : "+p3.diagnostico());
	}	
	
}