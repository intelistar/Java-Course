import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ввод текста
		System.out.println("Введите текст:");
		String text = scanner.nextLine();

		// Разделение текста на слова
		String[] words = text.split(" ");

		// Находим минимальную и максимальную длину слова
		int minLength = Integer.MAX_VALUE;
		int maxLength = Integer.MIN_VALUE;
		for (String word : words) {
			int length = word.length();
			if (length < minLength) {
				minLength = length;
			}
			if (length > maxLength) {
				maxLength = length;
			}
		}

		// Выводим слова минимальной длины
		System.out.println("Слова минимальной длины (" + minLength + "):");
		for (String word : words) {
			if (word.length() == minLength) {
				System.out.println(word);
			}
		}

		// Выводим слова максимальной длины
		System.out.println("Слова максимальной длины (" + maxLength + "):");
		for (String word : words) {
			if (word.length() == maxLength) {
				System.out.println(word);
			}
		}
	}
}
