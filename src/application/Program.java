package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

			//Express�o lambda declarada
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double factor = 1.1;
		Consumer<Product> cons = p -> {		//Criando variavel do tipo Consumer para fazer a atualiza��o dos pre�os em 10% 
			p.setPrice(p.getPrice() * factor); //As chaves foram colocadas somente para mostrar que podem ser usadas tamb�m
		};									//Mas o normal seria n�o utiliza-las e levar o calculo para a mesma linha
											//da declara��o da vari�vel.
		
		list.forEach(cons);  //Implementa��o de Consumer em declara��o direta no programa, usando a variavel.
								//N�o usando a referencia do metodo da classe Product
		
		list.forEach(System.out::println); //Usando um referente method para o println
	}

}
