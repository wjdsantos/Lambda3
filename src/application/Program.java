package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

			//Reference method com m�todo est�tico
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(Product::staticPriceUpdate);  //Implementa��o de Consumer em uma classe interface com um metodo 
		                                  // statico que acrescenta 10% nos valores da lista
		
		list.forEach(System.out::println); //Usando um referente method para o println
	}

}
