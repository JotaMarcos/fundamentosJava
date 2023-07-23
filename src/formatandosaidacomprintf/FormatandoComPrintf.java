package formatandosaidacomprintf;

public class FormatandoComPrintf {

	public static void main(String[] args) {
		
		String primeiroNome = "João";
		String nomeDoMeio = "Marcos";
		String sobreNomeDoMeio = "Aires";
		String sobreNome = "Duarte";
		String nomeCompleto = primeiroNome + " " + nomeDoMeio + " " +  sobreNomeDoMeio + " " + sobreNome;
//		System.out.println("Olá " + nomeCompleto + ", \nSeja bem-vindo(a)! ao mundo do Desenvolvimento Java!");
		
		String mensagemDeBoasVindas = "Seja bem-vindo(a)! ao mundo do Desenvolvimento Java!";
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.printf("Olá, %s%n", nomeCompleto);
		System.out.printf("%s%n", mensagemDeBoasVindas);		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		int quantidade = 48;
		System.out.printf("Quantidade: %d%n", quantidade);
		
		double peso = 938.22;
		System.out.printf("Quantidade: %10.2f%n", peso);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
	}

}
