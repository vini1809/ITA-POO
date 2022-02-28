package pacoteProdutos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompras {

	@Test
	public void testeQuantidadeNoCarrinho()
	{
		Produto p = new Produto(12, "Calça Jeans", 15);
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p, 3);
		assertEquals(CarrinhoDeCompras.getQuantidadeNoCarrinho(), 3);
		
	}

}
