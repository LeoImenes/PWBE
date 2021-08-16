package vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	private int id;
	private String nome;
	private Date data;
	private double valor;
	private int qtde;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Product(int id, String nome, Date data, double valor, int qtde) {
		
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.valor = valor;
		this.qtde = qtde;
	}
	
	public Product(String[] vetor){
		try {
		this.id = Integer.valueOf(vetor[0]);
		this.nome = (vetor[1]);
		
			this.data = sdf.parse(vetor[2]);
	
		this.valor = Double.valueOf(vetor[0]);
		this.qtde =Integer.valueOf(vetor[4]);
		}	 catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	@Override
	public String toString() {
		return id + ";" + nome+";" + sdf.format(data) +";" + valor + ";" + qtde + "\r\n";
	}
	
	public String toHTML() {
		return "<tr><td>"+ id + "</td><td>" + nome+"</td><td>" + sdf.format(data) +"</td><td>" + valor + "</td><td>" + qtde + "</td></tr>";
	}
	
	public String toCSV() {
		return id + "\t" + nome+"\t" + sdf.format(data) +"\t" + valor + "\t" + qtde + "\n";
	}
	
	
	

	
	
	
}
