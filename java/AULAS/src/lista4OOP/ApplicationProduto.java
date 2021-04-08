package lista4OOP;

import java.util.Scanner;

public class ApplicationProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		
		System.out.print("Escolha o produto: ");
		produto1.setNomeDoProduto(leia.next());
		System.out.print("Escolha a marca: ");
		produto1.setMarca(leia.next());
		System.out.print("Qual o preço? R$");
		produto1.setPreco(leia.nextDouble());
		
		System.out.print("Escolha o produto: ");
		produto2.setNomeDoProduto(leia.next());
		System.out.print("Escolha a marca: ");
		produto2.setMarca(leia.next());
		System.out.print("Qual o preço? R$");
		produto2.setPreco(leia.nextDouble());
		
		System.out.printf("O produto %s da marca %s custa R$ %.2f", produto1.getNomeDoProduto(), produto1.getMarca(), produto1.getPreco());
		System.out.printf("\nO produto %s da marca %s custa R$ %.2f", produto2.getNomeDoProduto(), produto2.getMarca(), produto2.getPreco());
	}

}
