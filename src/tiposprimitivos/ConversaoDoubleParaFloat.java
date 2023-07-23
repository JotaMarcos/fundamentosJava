package tiposprimitivos;

public class ConversaoDoubleParaFloat {

	public static void main(String[] args) {
		
		
		double teste1 = 10L;
		int teste2 = (int) teste1;
		
		System.out.println("O valor do Teste 1 (que é double) é: " + teste1);
		System.out.println();
		System.out.println("O valor do Teste 2 (que é int) é: " + teste2);
		System.out.println();
		
		int teste3 = 9300935;
		double teste4 = teste3;
		System.out.println("O valor do Teste 3 (que é int) é: " + teste3);
		System.out.println();
		System.out.println("O valor do Teste 2 (que é double) é: " + teste4); // aqui perdeu o valor
	}

}
