package by.triangle.exproject.triangle;

/*Описать класс, представляющий треугольник. 
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан (опционально).*/

public class TriangleLogic {
	
	// метод вычисления периметра треугольника 
	public double trianglPerim(Triangle triangle) {
		double perim;
		
		double a;
		double b;
		double c;
		
		a = Math.sqrt(Math.pow((triangle.getX3() - triangle.getX1()), 2) + Math.pow((triangle.getY3() - triangle.getY1()), 2));
		b = Math.sqrt(Math.pow((triangle.getX2() - triangle.getX3()), 2) + Math.pow((triangle.getY2() - triangle.getY3()), 2));
		c = Math.sqrt(Math.pow((triangle.getX1() - triangle.getX2()), 2) + Math.pow((triangle.getY1() - triangle.getY2()), 2));
		
		perim = a + b + c;
		return perim;
		
	}
	
	public double trianglSqr(Triangle triangle) {
		double sqr;
		
		sqr = (Math.abs((triangle.getX2() - triangle.getX1()) * (triangle.getY3() - triangle.getY1()) - (triangle.getX3() - triangle.getX1()) * (triangle.getY2() - triangle.getY1()))) / 2;
		
		return sqr;
		
	}
	
	public double medianCrossPointX(Triangle triangle) {
		double x;
		double y;
		
		x = (triangle.getX1() + triangle.getX2() + triangle.getX3()) / 3;
		y = (triangle.getY1() + triangle.getY2() + triangle.getY3()) / 3;
		
		return x;
	}
	
	public double medianCrossPointY(Triangle triangle) {
		double y;
		
		y = (triangle.getY1() + triangle.getY2() + triangle.getY3()) / 3;
		
		return y;
	}

}
