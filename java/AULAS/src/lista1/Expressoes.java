package lista1;

import java.util.Scanner;

public class Expressoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d,r,s;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		System.out.println("valor de R: "+r);
		System.out.println("valor de S: "+s);
		System.out.println("valor de D: "+d);
		
	}

}
