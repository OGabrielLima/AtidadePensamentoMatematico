package Relógio;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class UsaRelogio {
	public static void main(String[] args) throws InterruptedException {
		Relogio rel = new Relogio();
		int opcao = 3;
		while (opcao != 4) {
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Informe que horas são de acordo com o formato a seguir: (hh:mm)");
			String hora = leitor.nextLine();
			String listaHora[] = null;
					
			if(hora.length() < 5) {
				System.out.println("Formato de hora invalido.");
			} else {
				listaHora = hora.split(":");
			}
			
			System.out.println("Opções:\n 1 - Executar Relogio: \n 2 - Adicionar Minuto \n 3 - Alterar Horario ");
			opcao = leitor.nextInt();
			
			int hour = Integer.parseInt(listaHora[0]); 
			int min = Integer.parseInt(listaHora[1]); 
			rel.setHora(hour);
			rel.setMinutos(min);
			
			if(opcao == 1) {
				//imprimir todas as horas de um dia inteiro
				while(hour < 24) {
					hour++;
					while(min < 60) {
						//espera 3 segundos ate realizar operacao
						Thread.sleep(3000);
						String retorno = rel.proximoMinuto();
						System.out.println(retorno);
					}
				}
			} else if (opcao == 2) {
				String retorno = rel.proximoMinuto();
				System.out.println(retorno);
			} else if (opcao == 3) {
				System.out.println("Para começar o programa, informe que horas são de acordo com o formato a seguir: (hh:mm)");
				hora = leitor.nextLine();
			}
		}
	}
}
