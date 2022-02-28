package pacoteProdutos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProdutoComTamanho {

	@Test
	public void testeEquals() {

		Produto pt = new ProdutoComTamanho(1, "Bone", 20, 5);
		Produto pt1 = new ProdutoComTamanho(1, "Calça", 22, 15);
		assertEquals(pt.equals(pt1), pt1.equals(pt));
	}	

	@Test
	public void testeHashCode()  {
		
		Produto pt = new ProdutoComTamanho(1, "Capacete", 25, 5);
		Produto pt1 = new ProdutoComTamanho(1, "Bone", 20, 5);
		assertEquals(pt.hashCode(), pt1.hashCode());
	
	}

}
