import java.util.ArrayList;
import java.util.List;


public class Genetic {
	private Population population;
	
	public void run(Wood [] woods){
		initialPopulation(woods);
		crossover();
	}
	private void initialPopulation(Wood [] woods) {
		int initCount = 2;// the number of initial individuals.
		int max = 10; //TODO: change it! it is the maximum value of x or y
		int i = 0;
		Point p;
		Gene gene;
		List<Individual> individuals = new ArrayList<Individual>();
		List<Gene> genes;
		Individual individual;
		System.out.println("while");
		while (i<initCount){
			genes = new ArrayList<Gene>();
			//System.out.println("for i: " + i);
			for (int j=0 ; j<woods.length;j++){
				//System.out.println("for j: " + j);
				p = new Point(Utils.getRandomInt(0, max),Utils.getRandomInt(0, max));
				gene = new Gene(p, woods[j].getX(), woods[j].getY());
				genes.add(gene);
			}
			individual = new Individual(genes);
			if (!individual.isOverlap()){
				individuals.add(individual);
				i++;
			}
		}
		population = new Population(individuals);
		System.out.println(population.toString());
	}
	private void crossover(){
		
	}
}
