package lista4OOP;

public class Cliente {
	private String nome;
	private int anoNascimento;
	private String cpf;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//método
		public int calculaIdade(int anoAtual) {
			return anoAtual - anoNascimento;
		}
}
