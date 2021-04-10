package entities;

public class Estudante {
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	
	public String getCpf() {
		return cpf;
	}


	public double getPontos() {
		return pontos;
	}


	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void adicionarNota(double pontos) {
		this.pontos = this.pontos + pontos;
	}
	
	public void tirarNota(double pontos) {
		this.pontos = this.pontos - pontos;
	}
}
