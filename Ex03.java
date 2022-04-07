package entrada_processamento_saida;
import java.io.PrintStream;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double base,alt,area;
		
		System.out.printf("Digite o valor da base do triangulo: ");
		base = ler.nextDouble();
		
		System.out.printf("Digite o valor da altura do triangulo: ");
		alt = ler.nextDouble();
		
		area = base * alt / 2 ; 
		
		PrintStream printf = System.out.printf("A Area de seu triangulo e %.2f", area);

	}

}