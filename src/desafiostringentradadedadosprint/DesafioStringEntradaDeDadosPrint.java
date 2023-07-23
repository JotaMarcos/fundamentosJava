package desafiostringentradadedadosprint;

import java.util.Scanner;

public class DesafioStringEntradaDeDadosPrint {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		
		System.out.print("Digite o seu primeiro nome: ");
		String primeiroNome = scanner.nextLine();
		System.out.println("===========================================================================");
		System.out.print("Digite o seu sobrenome nome: ");
		String sobreNome = scanner.nextLine();
		System.out.println("===========================================================================");
		System.out.print("Digite o valor por hora trabalhada: ");
		double valorPorHoraTrabalhada = scanner.nextDouble();
		System.out.println("===========================================================================");
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		int quantidadeHorasTrabalhadas = scanner.nextInt();
		System.out.println("===========================================================================");
		System.out.print("Digite o valor dos descontos: ");
		double valorDosDescontos = scanner.nextDouble();
		System.out.println("===========================================================================");
		
		String nomeCompleto = primeiroNome + " " + sobreNome;
		double valorTotalDeHorasTrabalhadas = quantidadeHorasTrabalhadas * valorPorHoraTrabalhada; 
		double totalDevido = valorTotalDeHorasTrabalhadas - valorDosDescontos;		

		System.out.printf("Folha de pagamento: %s%n%d horas x %.2f =  %.2f%nDescontos: %.2f%nTotal devido: %.2f%n" , nomeCompleto, quantidadeHorasTrabalhadas, valorPorHoraTrabalhada, valorTotalDeHorasTrabalhadas, valorDosDescontos, totalDevido);		
		System.out.println("===========================================================================");
		
		
		scanner.close();
	}

}
