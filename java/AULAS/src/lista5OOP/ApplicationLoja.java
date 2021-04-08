package lista5OOP;

import java.io.IOException;
import java.util.ArrayList;

public class ApplicationLoja {
	
	public static void main(String args[]) throws IOException
	{
		Produto produto = new Produto("TV","45646",2000);
		ArrayList <Produto> listaPro = new ArrayList<Produto>();
		listaPro.add(produto);
		produto.setDescricao("PC");
		produto.setValorUnitario(5000);
		
		listaPro.add(produto);
		
		System.out.println(listaPro.get(1).getDescricao());
	}
}
