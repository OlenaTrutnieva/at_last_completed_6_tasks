package by.training.exproject.text;

import java.util.Objects;

/*Создать объект класса Текст, используя классы Предложение, Слово. 
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

public class Word {
	private String word;
	
	public Word() {
		word = "";
	}
	
	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}
	
	
	

}
