package lista1;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p1, p2, p3, n1, n2, n3, media;
		Scanner leia = new Scanner(System.in);

	    p1 = 2.0;
	    p2 = 3.0;
	    p3 = 5.0;

	    System.out.println("Qual sua nota 1? ");
	    n1 = leia.nextDouble();

	    System.out.println("Qual sua nota 2? ");
	    n2 = leia.nextDouble();

	    System.out.println("Qual sua nota 3? ");
	    n3 = leia.nextDouble();

	    media = (((p1*n1)+(p2*n2)+(p3*n3))/(p1+p2+p3));
	    System.out.println("Sua média ponderada é: "+media);
	}

}
