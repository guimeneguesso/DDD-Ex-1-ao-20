package entrada_processamento_saida;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double p1,p2, media;
		media = 5.0;
		
		System.out.println("Digite sua primeira nota: ");
		p1 = ler.nextDouble();
		
		p2 = ((media * 3) - p1) / 2;
		System.out.printf("Para poder passar voc� dever� tirar pelo menos %.1f na segunda prova!", p2);



	}

}