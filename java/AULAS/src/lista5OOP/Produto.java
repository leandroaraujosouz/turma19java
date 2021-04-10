package lista5OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int qtdeEstoque = 0;
	static Scanner leia = new Scanner(System.in);
	static List <Produto> listaPro = new ArrayList<>();
	char opcao;
	public Produto() {
		
	}
	
	public Produto(String descricao, String codigo, double valorUnitario)
	{
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	
	public void incluirEstoque(int qtdeEstoque)
	{
		this.qtdeEstoque = this.qtdeEstoque + qtdeEstoque;
	}
	
	public void tirarEstoque(int qtdeEstoque)
	{
		if(this.qtdeEstoque >= qtdeEstoque)
		{
			this.qtdeEstoque = this.qtdeEstoque - qtdeEstoque;
		}
		else
		{
			System.out.println("Estoque abaixo do pedido");
		}
	}
	
	public void cadastrar()
	{
		
		char continua;
		boolean confirma = false;
		Produto prod = new Produto();
		do
		{
			System.out.println("Digite o codigo: ");
			codigo = leia.next();
			
			for(Produto itens : listaPro)
			{
				if(itens.getCodigo().contains(codigo) == true)
				{
					System.out.println("Codigo de Produto já cadastrado");
					confirma = true;
					break;
					
				}
				
			}
			if(confirma == false)
			{
				System.out.println("Digite a Descrição: ");
				descricao = leia.next();
				
				System.out.println("Digite o Valor Unit.: ");
				valorUnitario = leia.nextDouble();
				
				prod = new Produto(descricao,codigo,valorUnitario);
				listaPro.add(prod);
			}
			else
			{
				confirma = false;
			}
			do
			{
				System.out.println("Deseja cadastrar de novo? S -sim ou N - Não: ");
				continua = leia.next().toUpperCase().charAt(0);
				if(continua != 'S' && continua != 'N')
				{
					System.out.println("Opção invalida!!! Tente novamente");
				}
			}while(continua != 'S' && continua != 'N');
		}while(continua != 'N');
	}
	
	
	public void remove()
	{
		String codigo;
		char remover;
		System.out.println("Digite o codigo do produto: ");
		codigo = leia.next();
		boolean confirma = false;
		for(Produto itens : listaPro)
		{
			if(itens.getCodigo().contains(codigo) == true)
			{
				System.out.println("Codigo: "+itens.getCodigo()+" | Descrição: "+itens.getDescricao());
				System.out.println("Confirmar remoção? 1 - sim 2 - Não: ");
				remover = leia.next().charAt(0);
				confirma = true;
				if(remover == '1')
				{
					listaPro.remove(itens);
					System.out.println("Produto removido!!!");
					
				}else if(remover != '2')
				{
					System.out.println("Sua opção é invalida!!!");
				}
				break;	
			}
			else
			{
				confirma = false;
			}	
		}
		if(confirma == false)
		{
			System.out.println("Produto não cadastrado!!!");
		}
		System.out.print("Digite qualquer valor para voltar: ");
		opcao = leia.next().charAt(0);
	}
	
	public void atualizar()
	{
		String codigo;
		char alterar;
		System.out.println("Digite o codigo do produto: ");
		codigo = leia.next();
		boolean confirma = false;
		for(int x=0; x < listaPro.size();x++)
		{
			if(listaPro.get(x).getCodigo().contains(codigo) == true)
			{	
				System.out.print("Digite a descrição: ");
				descricao = leia.next();
				System.out.print("Digite a valor Unit.: ");
				valorUnitario = leia.nextDouble();
				System.out.println("Codigo: "+listaPro.get(x).getCodigo()+" | Descrição: "+listaPro.get(x).getDescricao()+" | ValorUnit: "+listaPro.get(x).getValorUnitario());
				System.out.println("Codigo: "+listaPro.get(x).getCodigo()+" | Descrição: "+descricao+" | ValorUnit: "+valorUnitario);
				System.out.println("Confirmar Alteração 1 - sim 2 - Não: ");
				alterar = leia.next().charAt(0);
				confirma = true;
				if(alterar == '1')
				{
					listaPro.get(x).setDescricao(descricao);
					listaPro.get(x).setValorUnitario(valorUnitario);
					System.out.println("Produto Alterado!!!");
					
				}else if(alterar != '2')
				{
					System.out.println("Sua opção é invalida!!!");
				}
				break;	
			}
			else
			{
				confirma = false;
			}	
		}
		if(confirma == false)
		{
			System.out.println("Produto não cadastrado!!!");
		}
		System.out.print("Digite qualquer valor para voltar: ");
		opcao = leia.next().charAt(0);
	}
	
	public void mostrar()
	{
		if(listaPro.size() != 0)
		{
			for(Produto itens : listaPro)
			{
				System.out.println("Codigo: "+itens.getCodigo()+
								"\nDescrição: "+itens.getDescricao()+
								"\nValor Unit.: "+itens.getValorUnitario()+"\n");
			}
		}
		else
		{
			System.out.println("Não há produtos");
		}
		System.out.print("Digite qualquer valor para voltar: ");
		opcao = leia.next().charAt(0);
	}
}
