
public class Point {
	private double x;
	private double y;

	Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	double getX(){
		return x;
	}
	double getY(){
		return y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public double distanceToLine(Line line) {
		double numerator = Math.abs(line.getA() * x + line.getB() * y + line.getC());
		double denominator = Math.sqrt(line.getA() * line.getA() + line.getB() * line.getB());
		return numerator / denominator;
	}
}