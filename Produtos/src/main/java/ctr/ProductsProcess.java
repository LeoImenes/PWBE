package ctr;

import java.util.ArrayList;
import java.util.Date;

import vo.Product;
import vo.dao.ProductsDAO;

public class ProductsProcess {

	public static ArrayList<Product> products;
	public static ProductsDAO bd = new ProductsDAO();
	
	public static void testes() {
		products = new ArrayList<>();
		products.add(new Product(1,"Camisa",new Date(),192.4,5));
		products.add(new Product(2,"Calça",new Date(),192.4,5));
		products.add(new Product(3,"Sapato",new Date(),192.4,5));
		products.add(new Product(4,"Air Fryer",new Date(),192.4,5));
		products.add(new Product(5,"Pasta de dente Colgate illuminous white",new Date(),192.4,5));
		products.add(new Product(6,"Melancia",new Date(),192.4,5));
		products.add(new Product(7,"Oregano",new Date(),192.4,5));
	}
	
	public static void abrir() {
		products = bd.abrir();
	}
	
	public static String salvar() {
		if(bd.salvar(products)) {
			return "<p> Dados salvos </p>";
		}else {
			
		}
		return "<p> Dados não savlos no CSV </p>";
			
	}
	
	
}
