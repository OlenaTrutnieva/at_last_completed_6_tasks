package by.training.exproject.counter;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющий получить его текущее состояние.

Написать код, демонстрирующий все возможности класса.*/

public class Counter {

	private int counter;
	private int min;
	private int max;

	// инициализация без параметров
	public Counter() {
		counter = 0;
		min = 0;
		max = 20;
	}

	// инициализация начального и конечного значений счетчика
	public Counter(int min, int max) {
		this.min = min;
		this.max = max;

		// если в конструктор передано максимальное значение меньше минимального, тогда их значения нужно поменять местами
		if (max < min) {
			int temp = max;
			max = min;
			min = temp;
		}

	}

	// инициализация со всеми параметрами счетчика;
	public Counter(int min, int max, int counter) {
		this.min = min;
		this.max = max;
		this.counter = counter;

		// если в конструктор передано максимальное значение меньше минимального, тогда
		// их значения нужно поменять местами
		if (max < min) {
			int temp = max;
			max = min;
			min = temp;
		}
		// если в конструктор передано текущее значение больше максимального, тогда текущее приравнять к минимальному
				
		if (counter > max) {
			counter = min;
		}
		
		// если в конструктор передано текущее значение меньше минимального, тогда текущее приравлять к максимальному
		if (counter < min) {
			counter = max;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getCounter() {
		return counter;
	}
	
	public void counterIncr() {
		counter++;
		
		// если текущее значение счктчика становится больше максимального, то счетчик сбрасывается до минимального
		if (counter > max) {
			counter = min;
		}
	}
	
	public void counterDecr() {
		counter--;
		
		// если текущее значение счктчика становится меньше минимального, то счетчик сбрасывается до максимального
		if (counter < min) {
			counter = max;
		}
	}
	
	public int returnCurrent() {
		return counter;
	}

}
