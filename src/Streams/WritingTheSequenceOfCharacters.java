package Streams;

public class WritingTheSequenceOfCharacters {

	public static void main(String[] args) {
		int startCharacter = 33;
		int numberOfCharactersPerLine = 72;
		int endCharacter = 126;

		for (int i = 0; i < 100; i++) {
			for (int j = startCharacter; j < startCharacter + numberOfCharactersPerLine; j++) {
				System.out.write((char) j);
			}
			System.out.println();
			if (startCharacter + 72 == endCharacter) {
				startCharacter = 72;
			} else {
				startCharacter++;
			}
		}

	}

}
