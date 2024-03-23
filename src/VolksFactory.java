import java.util.Scanner;

public class VolksFactory implements CarFactory{
	Voyage v = new Voyage();
	Gol g = new Gol();
	
	Scanner scanner = new Scanner(System.in);
	
	public SedanCar buildSedanCar(){
		v.showSedanInformation();
		System.out.println("\nParabens!! voce comprou seu carro Voyage");
	
		return null;
	}
	
	public HatchCar buildHatchCar(){
		g.showHatchInformation();
		System.out.println("\nParabens!! voce comprou seu carro Gol");
		
		return null;
	}

}
