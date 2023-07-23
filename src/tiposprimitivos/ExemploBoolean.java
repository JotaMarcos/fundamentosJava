package tiposprimitivos;

public class ExemploBoolean {

	public static void main(String[] args) {
		
		boolean compraAprovada = true;
		boolean clienteBloqueado = false;
		
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Compra foi aprovada: " + compraAprovada);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("O clinete está bloqueado: " + clienteBloqueado);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		int quantidadeEstoque = 10;
		int quantidadePedidoCompra = 9;
		
		boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Estoque suficiente para compra: " + estoqueSuficiente);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		
	}

}
