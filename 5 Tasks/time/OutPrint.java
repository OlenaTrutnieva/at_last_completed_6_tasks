package by.training.exproject.time;

import java.util.List;

/*Составьте описание класса для представления времени. 
Предусмотрте возможности установки времени и 
изменения его отдельных полей (час, минута, секунда)с проверкой допустимости вводимых значений. 
В случае недопустимых значений полей поле устанавливается в значение 0. 

Создать методы изменения времени на заданное количество часов, минут и секунд.*/ 

public class OutPrint {
	public static void printInitialTime(Time time) {
		System.out.println("Initial time:");
		System.out.println("Start hour = " + time.getHour() + ";  Start min = " + time.getMin() + ";  Start sec = " + time.getSec());
		System.out.println();
	}
	
	public static void printResultTime(Time time) {
		System.out.println("Result time:");
		System.out.println("Start hour = " + time.getHour() + ";  Start min = " + time.getMin() + ";  Start sec = " + time.getSec());
		System.out.println();
	}

}
