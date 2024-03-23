import java.util.Scanner;

public class Client {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		
		VolksFactory volks = new VolksFactory();
		FiatFactory fiat = new FiatFactory();
		
		System.out.println("\nEscolha a marca: \n"
				+ "1 - Fiat \n"
				+ "2 - Volks");
		
		String m = scanner.nextLine();
		int modelo = Integer.parseInt(m);

		if(modelo == 1) {
			System.out.println("\nEscolha o tipo: \n"
					+ "1 - Sedan \n"
					+ "2 - Hactch");
			
			String tipo = scanner.nextLine();
			int t = Integer.parseInt(tipo);
			
			if(t == 1) {
				fiat.buildSedanCar();
			}else if(t == 2) {
				fiat.buildHatchCar();
			}else {
				System.out.println("\nResposta invalida");
			}
				
		}else if(modelo == 2){
			System.out.println("\nEscolha o tipo: \n"
					+ "1 - Sedan \n"
					+ "2 - Hactch");
			
			String tipo = scanner.nextLine();
			int t = Integer.parseInt(tipo);
			
			if(t == 1) {
				volks.buildSedanCar();
			}else if(t == 2) {
				volks.buildHatchCar();
			}else {
				System.out.println("\nResposta invalida");
			}
			
		}else {
			System.out.println("\nResposta invalida");
		}
		
	}
}
