import java.util.Scanner;
public class FiatFactory implements CarFactory{
	
	Siena s = new Siena();
	Palio p = new Palio();
	
	Scanner scanner = new Scanner(System.in);
	
	
	public SedanCar buildSedanCar(){
		s.showSedanInformation();
		System.out.println("\nParabens!! voce comprou seu carro Siena");
	
		return null;
	}
	
	public HatchCar buildHatchCar(){
		p.showHatchInformation();
		System.out.println("\nParabens!! voce comprou seu carro Palio");
		
		return null;
	}
}
