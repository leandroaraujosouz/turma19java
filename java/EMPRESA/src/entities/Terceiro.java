package entities;

public class Terceiro extends Funcionario {
	
	private double adicional;

	public Terceiro(String matricula, String nome) {
		super(matricula, nome);
	}

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double salario() {
		return valorHora*horasTrabalhadas;
	}
	

}
