package by.triangle.exproject.triangle;

/*Описать класс, представляющий треугольник. 
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан (опционально).*/

public class OutPrint {
	public void printPerim(double x) {
		System.out.println("Perimeter of the triangle equals " + x);
		System.out.println();
	}
	
	public void printSqr(double x) {
		System.out.println("Square of the triangle equals " + x);
		System.out.println();
	}
	
	public void printMedianCrossPoint(double x, double y) {
		System.out.println("x = " + x + ", Y = " + y);
		System.out.println();
	}

}
