package by.training.exproject.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*Создать объект класса Текст, используя классы Предложение, Слово. 
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

public class Text {
	private String title;
	private List<Sentence> text;

	public Text() {
		text = new ArrayList<Sentence>();
	}

	public Text(List<Sentence> sentence) {
		text = new ArrayList<Sentence>();
		text.addAll(sentence);
	}

	// добавить предложение в текст
	public boolean addSentence(Sentence sentence) {
		text.add(sentence);
		return true;
	}

	//
	public String sentenceTrim(Sentence sentence) {
		String str = new String();
		str = sentence.toString();
		str.trim();
		return str;

	}

	// заменить слово в тексте
	public void wordReplace(Text t1, String str1, String str2) {
		
		List<Sentence> list = t1.getText();
		for (int i = 0; i < list.size(); i++) {
			Sentence sent1 = list.get(i);
			List<Word> wordList = sent1.getSentence();

			for (int j = 0; j < wordList.size(); j++) {
				Word word;
				word = wordList.get(j);
				String w;
				w = word.getWord();
				if (w.equalsIgnoreCase(str1)) {
					w.replaceAll(w, str2);
				}
				
			}
		}

	}

	// привести первую букву предложения к верхнему регистру
	public void wordReplace(List<Sentence> sentence, String from, String to) {
		for (Sentence s : sentence) {
			String str = new String();
			str = s.toString();
			char[] charArr = str.toCharArray();
			char x = charArr[0];
			String y = Character.toString(x);
			y.toUpperCase();

		}

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

}
