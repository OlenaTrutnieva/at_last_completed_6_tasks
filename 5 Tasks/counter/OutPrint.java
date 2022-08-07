package by.training.exproject.counter;

/*Опишите класс, реализующий десятичный счетчик, который может увеличиватьили уменьшать свое значение на единицу в заданном диапазоне. 
Предусмотритеинициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющееполучить его текущее состояние.

Написать код, демонстрирующий все возможности класса.*/

public class OutPrint {

	public static void incrHeader() {

		System.out.println("Results of Counter increase:");
	}
	
	public static void decrHeader() {

		System.out.println("Results of Counter decrease:");
	}

	public static void printResult(int print) {

		System.out.println(+print);
	}

}
