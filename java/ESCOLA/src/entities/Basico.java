package entities;

public class Basico extends Estudante{
	
	private int diaAniversario;

	public Basico(int matricula, String cpf) {
		super(matricula, cpf);
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	public void bonusAniversario(int diaAtual) {
		if(this.diaAniversario == diaAtual)
		{
			super.adicionarNota(super.getPontos()*0.1);
		}
	}
}
