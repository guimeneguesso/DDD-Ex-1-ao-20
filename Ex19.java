package entrada_processamento_saida;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double p1, p2, media;
		System.out.println("Digite o resultado da primeira prova: ");
		p1 = ler.nextDouble();
		System.out.println("Digite o resultado da segunda prova: ");
		p2 = ler.nextDouble();
		
		media = ((p1 + 2 * p2) / 3);
		
		if (media >= 5) {
			System.out.println("Voc� est� APROVADO!");
		} else {
			System.out.println("Voc� est� REPROVADO!");
		}
	}

}