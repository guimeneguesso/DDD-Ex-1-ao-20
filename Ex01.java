package entrada_processamento_saida;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double a,b,area;
		
		System.out.printf("Informe o valor da base do ret�ngulo:");
		a = ler.nextDouble();
		
		System.out.printf("Informe o valor da altura do ret�ngulo:");
		b = ler.nextDouble();
		
		area = a * b;
		
		System.out.printf("A �rea do ret�ngulo de base %.2f e altura de %.2f * %.2f", a,b,area);

	}

}