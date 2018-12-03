import java.util.ArrayList;
import java.util.List;


public class Individual {
	private List<Gene> genes = new ArrayList<Gene>();
	private int fitness = -1;
	public Individual(List<Gene> genes) {
		this.setGenes(genes);
	}
	public List<Gene> getGenes() {
		return genes;
	}
	public void setGenes(List<Gene> genes) {
		this.genes = genes;
	}
	public int getFitness(){
		if (fitness==-1) calculateFitness();
		return fitness;
	}
	private void calculateFitness(){
		fitness = getSpace()-0;
	}
	private int getSpace(){
		int maxX = 0;
		int maxY = 0;
		for (int i=0;i<genes.size();i++){
			int x = genes.get(i).getP3().getX();
			int y = genes.get(i).getP3().getY();
			if (x>maxX) maxX = x;
			if (y>maxY) maxY = y;
		}
		int minX = maxX;
		int minY = maxY;
		for (int i=0;i<genes.size();i++){
			int x = genes.get(i).getP0().getX();
			int y = genes.get(i).getP0().getY();
			if (x<minX) minX = x;
			if (y<minY) minY = y;
		}
		return (maxX-minX)*(maxY-minY);
	}
	public boolean isOverlap(){
		boolean res = false;
		for(int i=0;i<genes.size();i++){
			for(int j=i+1;j<genes.size();j++){
				res = isGenesOverlap(genes.get(i), genes.get(j));
				if (res) break;
			}
		}
		
		return res;
	}
	private boolean isGenesOverlap(Gene g0, Gene g1){
		boolean res = false;
		if(isPOverlap(g0.getP3(), g1.getP0())
				|| isPOverlap(g0.getP1(), g1.getP2())
				) res= true;
		return res;
	}
	private boolean isPOverlap(Point p0, Point p1){
		boolean res = false;
		if((p0.getX()>p1.getX() && p0.getY()>p1.getY())
				|| (p0.getX()<p1.getX() && p0.getY()<p1.getY())
				) res = true;
		return res;
	}
}
