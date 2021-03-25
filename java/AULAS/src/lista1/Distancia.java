package lista1;
import java.util.*;
public class Distancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1;
        double y1;
        double x2;
        double y2;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o x1: ");
        x1 = leia.nextDouble();

        System.out.println("Insira o x2: ");
        x2 = leia.nextDouble();

        System.out.println("Insira o y1: ");
        y1 = leia.nextDouble();

        System.out.println("Insira o y2: ");
        y2 = leia.nextDouble();

        double potenciaX = (x2 - x1) * (x2 - x1);
        double potenciaY = (y2 - y1) * (y2 - y1);
        double totalSoma = potenciaX + potenciaY;

        double d = Math.sqrt(totalSoma);
        
        System.out.println("A distancia dos pontos é "+d);

	}

}
