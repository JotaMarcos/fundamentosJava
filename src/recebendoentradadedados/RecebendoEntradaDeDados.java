package recebendoentradadedados;

import java.util.Scanner;

public class RecebendoEntradaDeDados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		
		System.out.print("Digite o seu primeiro nome: ");
		String primeiroNome = scanner.nextLine();
		System.out.println("===========================================================================");
		System.out.print("Digite o seu sobrenome nome: ");
		String sobreNome = scanner.nextLine();
		System.out.println("===========================================================================");
		System.out.print("Digite a sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("===========================================================================");
		System.out.print("Digite a seu peso: ");
		double peso = scanner.nextDouble();
		System.out.println("===========================================================================");
		System.out.print("Digite a sua altura: ");
		double altura = scanner.nextDouble();
		System.out.println("=======================================================================================================================================");
		
		double totalAltura = altura * altura;		
		String nomeCompleto = primeiroNome + " " + sobreNome;
		double imc = (peso / totalAltura) * 100;

		System.out.printf("O seu nome completo é: %s e possui %d anos. Com peso %.2f e altura %.2f e o seu IMC é %.4f\n", nomeCompleto,  idade, peso, altura, imc);		
		System.out.println("=======================================================================================================================================");
		
		
		scanner.close();

	}

}
