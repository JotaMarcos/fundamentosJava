package operadoresdeincrementoedecremento;

public class OperadorDecremento {

	public static void main(String[] args) {
		
		int limiteTentativasLogin = 10;
		
		// limiteTentativasLogin += 1;
		
		// limiteTentativasLogin++;
		
		// int novolimiteTentativasLogin = limiteTentativasLogin--;
		int novolimiteTentativasLogin = --limiteTentativasLogin;
		
		System.out.println("#################################################");
		System.out.println("Total de Downloads: " + limiteTentativasLogin);
		System.out.println("#################################################");
		System.out.println("Total de Downloads: " + novolimiteTentativasLogin);
		System.out.println("#################################################");
		
	}

}
