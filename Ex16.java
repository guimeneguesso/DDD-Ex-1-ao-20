package entrada_processamento_saida;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double c1, c2, h;
		
		System.out.printf("Digite o primeiro valor: ");
		c1 = ler.nextDouble();
		System.out.printf("Digite o segundo valor: ");
		c2 = ler.nextDouble();
		System.out.printf("Digite o terceiro valor: ");
		h = ler.nextDouble();
		
		if ( h * h == c1*c1 + c2*c2) {
			System.out.printf("Pode ser um triângulo retângulo!");
		}else {
			System.out.printf("Não pode ser um triângulo retângulo!");
		}
		
		
	}
}