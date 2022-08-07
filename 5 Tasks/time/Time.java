package by.training.exproject.time;

/*Составьте описание класса для представления времени. 
Предусмотрте возможности установки времени и 
изменения его отдельных полей (час, минута, секунда)с проверкой допустимости вводимых значений. 
В случае недопустимых значений полей поле устанавливается в значение 0. 

Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class Time {
	private int hour;
	private int min;
	private int sec;
	
	public Time() {
		hour = 0;
		min = 0;
		sec = 0;
	}
	
	public Time(int hour, int min, int sec) {
			
		if (hour >= 60) {
			hour = 0;
		}
		if (min >= 60) {
			min = 0;
		}  
		if (sec >= 60) {
			sec = 0;
		}
		
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public int getHour() {
		return hour;
	}

	public int setHour(int hour) {
		if (hour >= 60) {
			hour = 0;
		}
		this.hour = hour;
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int setMin(int min) {
		if (min >= 60) {
			min = 0;
		}
		this.min = min;
		return min;
	}

	public int getSec() {
		return sec;
	}

	public int setSec(int sec) {
		if (sec >= 60) {
			sec = 0;
		}
		this.sec = sec;
		return sec;
	}

}
