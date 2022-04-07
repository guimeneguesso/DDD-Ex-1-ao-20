package entrada_processamento_saida;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double a, b;
	
	System.out.printf("Digite o primeiro numero: ");
	a = ler.nextDouble();
	
	System.out.printf("Digite o segundo numero ");
	b = ler.nextDouble();
	
	if (a < b) {
		System.out.printf("O numero %.1f e o maior!", a); 
	
	} else if (a == b) {
		System.out.printf("Os numeros sao iguais!", b); }
	
	else {
		System.out.printf("O numero %.1f e o maior!", b); 
	}
	}
	}