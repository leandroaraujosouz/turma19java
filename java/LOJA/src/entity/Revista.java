package entity;

public class Revista extends Produto{
	
	private String editora;

	public Revista(String descricao, String codigo, double valorUnitario, String editora) {
		super(descricao, codigo, valorUnitario);
		this.editora = editora;
	}
	
	

}
