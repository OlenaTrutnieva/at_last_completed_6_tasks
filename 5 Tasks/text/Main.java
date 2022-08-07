package by.training.exproject.text;

import java.util.ArrayList;
import java.util.List;

/*Создать объект класса Текст, используя классы Предложение, Слово. 
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

public class Main {

	public static void main(String[] args) {
		Text text = new Text();
		
		List<Word> forTitle = new ArrayList<Word>();
		forTitle.add(new Word("  food"));
		forTitle.add(new Word("preferences "));

		
		text.setTitle("food preferences");
		
		List<Word> word1 = new ArrayList<Word>();
		word1.add(new Word("Peter"));
		word1.add(new Word("loves"));
		word1.add(new Word("eating"));
		word1.add(new Word("bananas."));
	
		
		List<Word> word2 = new ArrayList<Word>();
		word2.add(new Word("Bob"));
		word2.add(new Word("loves"));
		word2.add(new Word("eating"));
		word2.add(new Word("mango."));
		
		List<Word> word3 = new ArrayList<Word>();
		word3.add(new Word("Emma"));
		word3.add(new Word("loves"));
		word3.add(new Word("eating"));
		word3.add(new Word("bread."));
		
		Sentence sent1 = new Sentence(word1);
		Sentence sentence1 = new Sentence(sent1.wordReplace(sent1, "loves", "tolerates"));
		Sentence sent2 = new Sentence(word2);
		Sentence sentence2 = new Sentence(sent2.wordReplace(sent2, "loves", "tolerates"));
		Sentence sent3 = new Sentence(word3);
		Sentence sentence3 = new Sentence(sent3.wordReplace(sent3, "loves", "tolerates"));
		

		text.addSentence(sentence1);
		text.addSentence(sentence2);
		text.addSentence(sentence3);
		
	//	text.wordReplace(text, "loves", "tolerates");
		
		OutPrint printText = new OutPrint();
		printText.printText(text);		
		printText.printWithReplace(text, "loves", "tolerates");

	}

}
