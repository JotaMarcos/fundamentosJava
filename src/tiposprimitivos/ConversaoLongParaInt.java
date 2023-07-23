package tiposprimitivos;

public class ConversaoLongParaInt {

	public static void main(String[] args) {
		
		
		long teste1 = 10L;
		int teste2 = (int) teste1;
		
		System.out.println("O valor do Teste 1 (que é long) é: " + teste1);
		System.out.println();
		System.out.println("O valor do Teste 2 (que é int) é: " + teste2);
		System.out.println();
		
		long teste3 = 9300000035L;
		int teste4 = (int) teste3;
		System.out.println("O valor do Teste 3 (que é long) é: " + teste3);
		System.out.println();
		System.out.println("O valor do Teste 2 (que é int) é: " + teste4); // aqui perdeu o valor
	}

}
