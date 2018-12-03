import java.util.ArrayList;
import java.util.List;


public class Population {
	private List<Individual> individuals = new ArrayList<Individual>();
	public Population(List<Individual> individuals) {
		this.individuals = individuals;
	}
	public List<Individual> getIndividuals() {
		return individuals;
	}
	
	@Override
	public String toString(){
		System.out.println("indiv count"+individuals.size());
		String s = "";
		List<Gene> gene = null;
		for(int i=0;i<individuals.size();i++){
			gene = individuals.get(i).getGenes();
			for(int j=0;j<gene.size();j++){
				s+= gene.get(j).toString() +" | ";
			}
			s += individuals.get(i).getFitness() + "\n";
		}
		System.out.println("gene count"+gene.size());
		return s;
	}
}
