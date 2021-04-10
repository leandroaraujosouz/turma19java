package application;

import entities.Basico;

public class CadEstudante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basico basico = new Basico(111,"231313");
		basico.adicionarNota(10);
		basico.setDiaAniversario(12);
		basico.bonusAniversario(12);
		System.out.println(basico.getPontos());
	}

}
