
public class Gene {
	private Point p0,p1,p2,p3;
	private int x,y;
	public Gene(Point p0, int x, int y) {
		this.setP0(p0);
		this.x = x;
		this.y = y;
		if (Utils.getRandomInt(0, 1)==0){
			this.setP1(new Point(p0.getX()+x, p0.getY()));
			this.setP2(new Point(p0.getX(), p0.getY()+y));
			this.setP3(new Point(p0.getX()+x, p0.getY()+y));
		}
		else {
			this.setP1(new Point(p0.getX()+y, p0.getY()));
			this.setP2(new Point(p0.getX(), p0.getY()+x));
			this.setP3(new Point(p0.getX()+y, p0.getY()+x));
		}
	}
	//public boolean isRectangle(){
	///	return p1-p0 == p3-p2 && p2-p0 == p3-p1;
	//}
	public Point getP0() {
		return p0;
	}
	public void setP0(Point p0) {
		this.p0 = p0;
	}
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	public String toString(){
		return "("+p0.getX()+","+p0.getY()+")"
				+ "("+p1.getX()+","+p1.getY()+")"
				+ "("+p2.getX()+","+p2.getY()+")"
				+ "("+p3.getX()+","+p3.getY()+")"
				;
	}
}
