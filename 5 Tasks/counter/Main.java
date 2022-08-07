package by.training.exproject.counter;

/*Опишите класс, реализующий десятичный счетчик, который может увеличиватьили уменьшать свое значение на единицу в заданном диапазоне. 
Предусмотритеинициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющееполучить его текущее состояние.

Написать код, демонстрирующий все возможности класса.*/

public class Main {

	public static void main(String[] args) {
		Counter count1 = new Counter();
		Counter count2 = new Counter(0, 10, 0);
		Counter count3 = new Counter(10, 6, 2);
		
		OutPrint print = new OutPrint();
		
		for (int i = 0; i < 20; i++) {
			count1.counterIncr();
			//System.out.println("min = " + count1.getMin() + "  max = " + count1.getMax() + "  counter = " + count1.getCounter());
			
			count2.counterIncr();
			//System.out.println("min = " + count2.getMin() + "  max = " + count2.getMax() + "  counter = " + count2.getCounter());
			
			count3.counterIncr();
			//System.out.println("min = " + count3.getMin() + "  max = " + count3.getMax() + "  counter = " + count3.getCounter());
		}
		print.incrHeader();
		print.printResult(count1.returnCurrent());
		print.printResult(count2.returnCurrent());
		print.printResult(count3.returnCurrent());
		
		for (int i = 0; i < 20; i++) {
			count1.counterDecr();
			//System.out.println("min = " + count1.getMin() + "  max = " + count1.getMax() + "  counter = " + count1.getCounter());
			
			count2.counterDecr();
			//System.out.println("min = " + count2.getMin() + "  max = " + count2.getMax() + "  counter = " + count2.getCounter());
			
			count3.counterDecr();
			//System.out.println("min = " + count3.getMin() + "  max = " + count3.getMax() + "  counter = " + count3.getCounter());
		}
		print.decrHeader();
		print.printResult(count1.returnCurrent());
		print.printResult(count2.returnCurrent());
		print.printResult(count3.returnCurrent());

	}

}
