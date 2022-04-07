package entrada_processamento_saida;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, area;
		
		System.out.printf("Digite a base do retangulo: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite a altura do retangulo: ");
		b = ler.nextDouble();
				
		area = a * b; 
	
	if (area < 100) {
		System.out.printf("Terreno pequeno"); }
	
	else {
		System.out.printf("Terreno grande"); }
	
	}
	}