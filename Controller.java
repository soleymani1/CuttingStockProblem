import java.util.Scanner;


public class Controller {
	
	static Scanner scanner = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Please enter the number of woods: ");
		int count = scanner.nextInt();
		Wood [] woods = new Wood[count];
		for (int i=0; i<count ; i++){
			System.out.println("Please enter the dimentions of wood #"+ (i+1) +" (x,y):");
			woods[i] = new Wood(scanner.nextInt(), scanner.nextInt());
		}
		Genetic genetic = new Genetic();
		genetic.run(woods);
		
	}

}
