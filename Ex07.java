package entrada_processamento_saida;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double produto1, produto2, produto3, produto4, produto5, total, pagamento, troco;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		produto1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto: ");
		produto2 = ler.nextDouble();
			
		System.out.printf("Digite o valor do terceiro produto: ");
		produto3 = ler.nextDouble();
			
		System.out.printf("Digite o valor do quarto produto: ");
		produto4 = ler.nextDouble();
			
		System.out.printf("Digite o valor do quinto produto: ");
		produto5 = ler.nextDouble();
				
				total = produto1 + produto2 + produto3 + produto4 + produto5;
			
		System.out.printf("No total deu %.2f reais, com quantos reais ira pagar? ",total);
		pagamento = ler.nextDouble();
				
				troco = pagamento - total ;
			
				System.out.printf("Seu troco sera %.2f reais.", troco);
	}

}