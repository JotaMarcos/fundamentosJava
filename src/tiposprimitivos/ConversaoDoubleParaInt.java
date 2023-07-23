package tiposprimitivos;

public class ConversaoDoubleParaInt {

	public static void main(String[] args) {
		
		
		double teste1 = 20.50;
		float teste2 = (float) teste1;
		
		System.out.println("O valor do Teste 1 (que é double) é: " + teste1);
		System.out.println();
		System.out.println("O valor do Teste 2 (que é float) é: " + teste2);
		System.out.println();
		
		float teste3 = 930085.5f;
		double teste4 = teste3;
		System.out.println("O valor do Teste 3 (que é float) é: " + teste3);
		System.out.println();
		System.out.println("O valor do Teste 2 (que é double) é: " + teste4); // aqui perdeu o valor
	}

}
