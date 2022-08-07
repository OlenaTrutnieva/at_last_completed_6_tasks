package by.training.exproject.time;

/*Составьте описание класса для представления времени. 
Предусмотрте возможности установки времени и 
изменения его отдельных полей (час, минута, секунда)с проверкой допустимости вводимых значений. 
В случае недопустимых значений полей поле устанавливается в значение 0. 

Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class Main {

	public static void main(String[] args) {
		Time t1 = new Time();
		int h1 = t1.setHour(450);
		int m1 = t1.setMin(15);
		int s1 = t1.setSec(30);

		OutPrint viewTime = new OutPrint();

		// выводим входные данные времени
		viewTime.printInitialTime(t1);

		// прибавляем часы, минуты и секунды к времени, инициализированному через сеттер
		TimeLogic logic = new TimeLogic();
		Time t1Result = logic.addHMS(t1, 40, 300, 1506);
		;

		// выводим результат
		viewTime.printResultTime(t1Result);

		// создаем объект время с параметрами
		Time t2 = new Time(65, 45, 0);
		// выводим входные данные времени
		viewTime.printInitialTime(t2);

		// прибавляем минуты и секунды к времени
		Time t2Result = logic.addMS(t2, 3000, 50603);
		;

		viewTime.printResultTime(t2Result);

		
		
		// создаем объект время с параметрами
		Time t3 = new Time(6, 450, 8);
		// выводим входные данные времени
		viewTime.printInitialTime(t3);

		// прибавляем минуты и секунды к времени
		Time t3Result = logic.addS(t3, 50000);
		;

		viewTime.printResultTime(t3Result);

	}

}
