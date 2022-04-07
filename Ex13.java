package entrada_processamento_saida;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	double a, b, c;
	
	System.out.printf("Digite o primeiro numero: ");
	a = ler.nextDouble();
	
	System.out.printf("Digite o segundo numero ");
	b = ler.nextDouble();
	
	System.out.printf("Digite o terceiro numero ");
	c = ler.nextDouble();
	
	if ((a > b) && (a > c)) {
		System.out.printf("O numero %.1f e o maior!", a); } 
	
	else if ((c > a) && (c > b)) {
		System.out.printf("O numero %.1f e o maior!", c); }
	
	else {
				System.out.printf("O numero %.1f e o maior!", b); }
	
	}
	}