package by.triangle.exproject.triangle;

import java.util.Objects;

/*Описать класс, представляющий треугольник. 
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан (опционально).*/

public class Triangle {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	
	public Triangle() {
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		x3 = 0;
		y3 = 0;
	}
	
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double getX3() {
		return x3;
	}

	public void setX3(double x3) {
		this.x3 = x3;
	}

	public double getY3() {
		return y3;
	}

	public void setY3(double y3) {
		this.y3 = y3;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x1, x2, x3, y1, y2, y3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Double.doubleToLongBits(x1) == Double.doubleToLongBits(other.x1)
				&& Double.doubleToLongBits(x2) == Double.doubleToLongBits(other.x2)
				&& Double.doubleToLongBits(x3) == Double.doubleToLongBits(other.x3)
				&& Double.doubleToLongBits(y1) == Double.doubleToLongBits(other.y1)
				&& Double.doubleToLongBits(y2) == Double.doubleToLongBits(other.y2)
				&& Double.doubleToLongBits(y3) == Double.doubleToLongBits(other.y3);
	}
	
	
	

}
