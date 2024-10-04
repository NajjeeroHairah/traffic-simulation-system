package trafficsimulationsystem;

public class Trafficsimulationsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number of cars at the intersection
		int totalCars=10;
		//Simulating traffic lights for 5 cycles(green/red)
		for (int cycle = 1; cycle<=5; cycle++) {
			System.out.println("Cycle"+cycle + ":");
			
			//Assume even cycles are green and odd cycles are red
			if (cycle % 2==0) {
				System.out.println("Traffic lights is GREEN.");
				
			}
			else {
				System.out.println("Traffic lightis RED.");
				System.out.println("No cars can pass.");
				
			}
			System.out.println();//New line for better readability
			
		}

	}

}
