
public class Paciente {
	
	
	private double altura;
	
	private double peso;
	
	
	public Paciente (double altura, double peso) {
		
		this.altura = altura;
		
		this.peso = peso;	
		
	}
	
   public double calculoImc() {
	   
	   return this.peso / (this.altura* this.altura);
	 
   }
   
   public String diagnostico() {
	   
	   if(calculoImc() <16)
		   return "baixo peso muito grave";
	   else if (calculoImc() > 16 && calculoImc() < 16.99)
			return "Baixo peso grave";
		else if  (calculoImc() > 17 && calculoImc() < 18.49)
			return "Baixo peso";
		else if (calculoImc() > 18.50 && calculoImc() < 24.99)
			return "Peso normal";
		else if (calculoImc() > 25 && calculoImc() < 29.99)
			return "Sobrepeso";
		else if (calculoImc() > 30 && calculoImc() < 34.99)
			return "Obesidade grau I";
		else if (calculoImc() > 35 && calculoImc() < 39.99)
			return "Obesidade grau II";
		else if (calculoImc() >= 40)
			return "Obesidade grau III (obesidade mórbida) ";
			return "";
	   
	   
   }
	
   
   
	

}