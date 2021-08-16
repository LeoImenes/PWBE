package vo.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import vo.Product;

public class ProductsDAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo = "c:\\dbs\\product.csv";
	private ArrayList<Product> product;
	private Product products;

	public boolean salvar(ArrayList<Product> products) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo,false));
			for(Product c: products) {
				bw.write(c.toCSV());
			}
			bw.close();
			return true;
		} catch (IOException e) {
			System.out.println("Erro ao gravar arquivo "+e);
			return false;
		}
	}
	public ArrayList<Product> abrir(){
	product = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = null;
			while((linha = br.readLine()) != null) {
				products = new Product(linha.split(";"));
				product.add(products);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado "+e);
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo "+e);
		}
		return product;
	}

	
	
}
