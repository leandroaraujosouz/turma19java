package application;

import java.util.Scanner;

import entities.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Funcionario func1 = new Funcionario("123123","exeplo funcionario",3,10);
		
		String nome;
		double valorHora;
		System.out.print("Digite o nome do funcionario: ");
		nome = leia.next();
		
		System.out.print("Digite valor da hora: ");
		valorHora = leia.nextDouble();
		func1.setNome(nome);
		func1.setValorHora(valorHora);
		
		System.out.println("matricula: "+func1.getMatricula()+"\nFuncionario: "+func1.getNome()+"\n"+
							"Salario: R$"+func1.salario());
	}

}
