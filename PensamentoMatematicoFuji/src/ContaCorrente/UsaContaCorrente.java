package ContaCorrente;

import java.util.Scanner;

public class UsaContaCorrente {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(250f);
		
		//ContaCorrente cc = new ContaCorrente();
		//System.out.println(cc.depositar(100f));
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Selecione uma operação: (1 - sacar | 2 - Depositar): ");
		int opcao = leitor.nextInt();
		System.out.println("Insira o valor no campo abaixo: ");

		float valor = leitor.nextFloat();
		if(opcao == 1) {
			System.out.println(cc.sacar(valor));
		} else if (opcao == 2) {
			System.out.println(cc.depositar(valor));
		} else {
			System.out.println("Opção inválida");
		}
		
		
	}
}
