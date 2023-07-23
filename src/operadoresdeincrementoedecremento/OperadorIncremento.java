package operadoresdeincrementoedecremento;

public class OperadorIncremento {

	public static void main(String[] args) {
		
		int totalDownloads = 10;
		
		// totalDownloads += 1;
		
		// totalDownloads++;
		
//		int novoTotalDownloads = totalDownloads++;
		int novoTotalDownloads = ++totalDownloads;
		
		System.out.println("#################################################");
		System.out.println("Total de Downloads: " + totalDownloads);
		System.out.println("#################################################");
		System.out.println("Total de Downloads: " + novoTotalDownloads);
		System.out.println("#################################################");
		
	}

}
