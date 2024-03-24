public class Line {
	private double A;
	private double B;
	private double C;

	Line(double A, double B, double C){
		this.A = A;
		this.B = B;
		this.C = C;
	}

	double getA(){
		return A;
	}
	double getB(){
		return B;
	}
	double getC(){
		return C;
	}

	double distanceToPoint(Point p){
		return Math.abs(A * p.getX() + B * p.getY() + C) / Math.sqrt(A * A + B * B);
	}
}
