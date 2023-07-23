package tiposprimitivos;

public class ExemploByteShort {

	public static void main(String[] args) {
		
		byte idade = 127; // valor máximo
		//byte idade2 = 127; // não compila
		
		short quantidadeEstoque = 32767;// valor máximo
		
		
		System.out.println("Idade é: " + idade + " anos.");
		System.out.println("Quantidade em estoque é: " + quantidadeEstoque);
		
	}

}
