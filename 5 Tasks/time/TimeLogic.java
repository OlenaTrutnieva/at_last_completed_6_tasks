package by.training.exproject.time;

/*Составьте описание класса для представления времени. 
Предусмотрте возможности установки времени и 
изменения его отдельных полей (час, минута, секунда)с проверкой допустимости вводимых значений. 
В случае недопустимых значений полей поле устанавливается в значение 0. 

Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class TimeLogic {

	public Time addHMS(Time t, int hour, int min, int sec) {
		int h;
		int m;
		int s;

		s = t.getSec() + sec % 60;
		m = t.getMin() + (min % 60) + (sec / 60);
		h = t.getHour() + hour + (min / 60);

		Time time = new Time(h, m, s);

		return time;
	}
	
	public Time addMS(Time t, int min, int sec) {
		int h;
		int m;
		int s;

		s = t.getSec() + sec % 60;
		m = t.getMin() + (min % 60) + (sec / 60);
		h = t.getHour() + (min / 60);
		
		Time time = new Time(h, m, s);

		return time;
	}
	
	public Time addS(Time t, int sec) {
		int h;
		int m;
		int s;

		s = t.getSec() + sec % 60;
		m = t.getMin() + (sec / 60);
		h = t.getHour() + (m / 60);

		Time time = new Time(h, m, s);

		return time;
	}

}
