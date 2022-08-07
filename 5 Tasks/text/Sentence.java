package by.training.exproject.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*Создать объект класса Текст, используя классы Предложение, Слово. 
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

public class Sentence {
	private List<Word> sentence;

	public Sentence() {
		sentence = new ArrayList<Word>();
	}

	// добавить все слова из списка
	public Sentence(List<Word> sentence) {
		this.sentence = new ArrayList<Word>();
		this.sentence.addAll(sentence);
	}

	// добавить слово в предложение
	public boolean addWord(Word word) {
		sentence.add(word);
		return true;
	}

	// добавить слова в определенную позицию предложения
	public boolean addWord(int index, Word word) {
		if (index < 0 || index > sentence.size()) {
			return false;
		}
		sentence.add(index, word);
		return true;
	}

	// отсекаем лишние пробелы
	public void trimSentence(Sentence sentence) {
		String str = new String();
		str = sentence.toString();
		str.trim();
	}
	
	public List<Word> wordReplace(Sentence s, String s1, String s2) {
		String sent = "";

		for (Word w1 : s.getSentence()) {
			sent = sent + w1.getWord() + " ";
			sent = sent.replace(s1, s2);
			Word w2 = new Word(sent);
			Sentence sentence = new Sentence();
			sentence.addWord(w2);
		}
		return sentence;
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sentence);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		return Objects.equals(sentence, other.sentence);
	}
	
	

}
