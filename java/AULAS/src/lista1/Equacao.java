package lista1;

import java.util.Scanner;

public class Equacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, d, e1, f, x, y;
		Scanner leia = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        a = leia.nextDouble();
        System.out.println("Insira o valor de B: ");
        b = leia.nextDouble();
        System.out.println("Insira o valor de C: ");
        c = leia.nextDouble();
        System.out.println("Insira o valor de D: ");
        d = leia.nextDouble();
        System.out.println("Insira o valor de E: ");
        e1 = leia.nextDouble();
        System.out.println("Insira o valor de F: ");
        f = leia.nextDouble();

        x = ((c*e1) - (b*f)) / ((a*e1) - (b*d));
        y = ((a*f) - (c*d)) / ((a*e1) - (b*d));

        System.out.printf("O valor de X é: %.2f e o valor de Y é: %.2f",x,y);
	}

}
