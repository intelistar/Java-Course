import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите параметры прямой (A, B, C):");
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();

		Line line = new Line(A, B, C);

		System.out.print("Введите количество точек: ");
		int n = scanner.nextInt();
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Введите координаты точки " + (i + 1) + ": ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			points[i] = new Point(x, y);
		}

		Point farthestPoint = null;
		double maxDistance = 0;
		for (Point point : points) {
			double distance = line.distanceToPoint(point);
			if (distance > maxDistance) {
				maxDistance = distance;
				farthestPoint = point;
			}
		}

		System.out.println("Точка, находящаяся дальше всех от прямой: " + farthestPoint);
		System.out.println("Расстояние до прямой: " + maxDistance);
	}
}