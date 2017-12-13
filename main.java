import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String[] EnglishWords = {"book", "chair", "clock", "desk", "eraser", "pencil", "room", "school", "telephone"};
		String[] JapaneseWords = {"ほん", "いす", "とけい", "つくえ", "けしごむ", "えんぴつ", "へや", "がっこう", "でんわ"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to translate: ");
		String english = sc.next();
		for (int i = 0; i < EnglishWords.length; i++) {
			if(english.equals(EnglishWords[i])) {
				System.out.println(JapaneseWords[i]);
			}
		}
		
		
		
		
	}

}
