package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

			//Reference method com m�todo n�o est�tico
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(Product::nonStaticPriceUpdate);  //Implementa��o de Consumer em uma classe interface com um metodo 
		                                  // n�o statico, ou seja que trabalha com o proprio atributo.
		
		list.forEach(System.out::println); //Usando um referente method para o println
	}

}
