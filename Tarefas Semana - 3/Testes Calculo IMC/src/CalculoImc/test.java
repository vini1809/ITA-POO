package CalculoImc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void baixoPesoMuitoGrave() {
		Paciente p1 = new Paciente(55, 1.90);
		assertEquals(15.20, p1.calcularIMC(), 0.1);
	}
	@Test
	void baixoPesoGrave() {
		Paciente p1 = new Paciente(60, 1.90);
		assertEquals(16.60, p1.calcularIMC(), 0.1);
	}
	@Test
	void baixoPeso() {
		Paciente p1 = new Paciente(54, 1.75);
		assertEquals(17.60, p1.calcularIMC(), 0.1);
	}
	@Test
	void PesoNormal() {
		Paciente p1 = new Paciente(60, 1.75);
		assertEquals(19.50, p1.calcularIMC(), 0.1);
	}
	@Test
	void Sobrepeso() {
		Paciente p1 = new Paciente(80, 1.75);
		assertEquals(26.10, p1.calcularIMC(), 0.1);
	}
	@Test
	void ObesidadeGraud1() {
		Paciente p1 = new Paciente(90, 1.70);
		assertEquals(31.10, p1.calcularIMC(), 0.1);
	}
	@Test
	void ObesidadeGrau2() {
		Paciente p1 = new Paciente(110,1.70);
		assertEquals(38.00, p1.calcularIMC(), 0.1);
	}
	@Test
	void ObesidadeGrau3() {
		Paciente p1 = new Paciente(140,1.70);
		assertEquals(48.40, p1.calcularIMC(), 0.1);
	}

}