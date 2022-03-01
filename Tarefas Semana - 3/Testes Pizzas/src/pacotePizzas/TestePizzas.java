package pacotePizzas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestePizzas {


 @Before
public void limparRegPizza() {
	Pizza.zeraIngredientes();
}

/*verifique se o valor da Pizza está correto de acordo com a quantidade de ingredientes*/
@Test
public void test() {
	Pizza pedidoP1 = new Pizza();
	
	pedidoP1.adicionaIngrediente("Calabresa");
	pedidoP1.adicionaIngrediente("Cebola");
	
	assertEquals(2, pedidoP1.getIngrediente().size());
}

/*Verifique também se o registro de ingredientes funcionou corretamente*/
@Test
public void testIngredientes() {
	Pizza pedidoP1 = new Pizza();
	
	pedidoP1.adicionaIngrediente("Calabresa");
	pedidoP1.adicionaIngrediente("Cebola");
	
	ArrayList<String> ingredientes = new ArrayList<String>();
	ingredientes.addAll(pedidoP1.getIngrediente());
	
	assertEquals(ingredientes, pedidoP1.getIngrediente());
}




}