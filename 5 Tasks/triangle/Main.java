package by.triangle.exproject.triangle;

/*Описать класс, представляющий треугольник. 
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан (опционально).*/

public class Main {

	public static void main(String[] args) {
		Triangle trngl1 = new Triangle();
		trngl1.setX1(-12);
		trngl1.setY1(-2);
		trngl1.setX2(2.89);
		trngl1.setY2(9.7);
		trngl1.setX3(-1.12);
		trngl1.setY3(28);
		
		Triangle trngl2 = new Triangle(4.5, 56.3, 56, 74, -43.8, -32);
		
		
		TriangleLogic logic = new TriangleLogic();
		OutPrint print = new OutPrint();
		
		double perim1;
		perim1 = logic.trianglPerim(trngl1);
		double sqr1;
		sqr1 = logic.trianglSqr(trngl1);
		
		double medianCrossPointX1;
		medianCrossPointX1 = logic.medianCrossPointX(trngl1);
		double medianCrossPointY1;
		medianCrossPointY1 = logic.medianCrossPointX(trngl1);
				
		print.printPerim(perim1);
		print.printSqr(sqr1);
		print.printMedianCrossPoint(medianCrossPointX1, medianCrossPointY1);
		
		
		double perim2;
		perim2 = logic.trianglPerim(trngl2);
		double sqr2;
		sqr2 = logic.trianglSqr(trngl2);
		double medianCrossPointX2;
		medianCrossPointX2 = logic.medianCrossPointX(trngl2);
		double medianCrossPointY2;
		medianCrossPointY2 = logic.medianCrossPointX(trngl2);
		
		print.printPerim(perim2);
		print.printSqr(sqr2);
		print.printMedianCrossPoint(medianCrossPointX2, medianCrossPointY2);
		

	}

}
