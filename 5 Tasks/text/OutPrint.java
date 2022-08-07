package by.training.exproject.text;

import java.util.ArrayList;
import java.util.List;

/*Создать объект класса Текст, используя классы Предложение, Слово. 
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

public class OutPrint {
	public void printText(Text t) {

		System.out.println(t.getTitle().toUpperCase());
		System.out.println();

		for (Sentence s : t.getText()) {
			System.out.println(createAsString(s));
		}
		System.out.println();
		System.out.println();

	}

	private String createAsString(Sentence s) {
		String sent = "";

		for (Word w : s.getSentence()) {
			sent = sent + w.getWord() + " ";
		}
		sent.trim();
		return sent;
	}

	public void printWithReplace(Text t, String s1, String s2) {

		System.out.println(t.getTitle().toUpperCase());
		System.out.println();

		for (Sentence s : t.getText()) {
			System.out.println(createAsStringWithReplace(s, s1, s2));
		}
		System.out.println();
		System.out.println();

	}

	private String createAsStringWithReplace(Sentence s, String s1, String s2) {
		String sent = "";

		for (Word w : s.getSentence()) {
			sent = sent + w.getWord() + " ";
			sent = sent.replace(s1, s2);
		}
		sent.trim();
		return sent;
	}

}
