package pacotePizzas;

public class PizzaTeste {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Cebola");
		
		p2.adicionaIngrediente("Frango");
		p2.adicionaIngrediente("Catupiry");
		p2.adicionaIngrediente("Mussarela");
	
		p3.adicionaIngrediente("Palmito");
		p3.adicionaIngrediente("Lombo");
		p3.adicionaIngrediente("Cheddar");
		p3.adicionaIngrediente("Cebola");
		p3.adicionaIngrediente("Mussarela");
		p3.adicionaIngrediente("Palmito");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		c.addPizza(p1);
		c.addPizza(p2);
		c.addPizza(p3);
	
		System.out.println("Total de pizzas no carrinho: " +c.totalPizzas());
		System.out.println("Valor total da compra: " + c.getPrecoTotal());
		
		System.out.println("Lista de ingredientes utilizados: \n" +Pizza.getListaIngredientes());
		

		
	}

}
