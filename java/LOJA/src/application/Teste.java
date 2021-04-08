package application;

import java.util.Locale;

import entity.Produto;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Produto prod1 = new Produto("Camisa","xl001",100.25);
		
		prod1.setValorUnitario(80);		
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario());
		System.out.println();
	}

}
