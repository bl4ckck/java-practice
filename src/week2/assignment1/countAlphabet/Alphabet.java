package week2.assignment1.countAlphabet;

public class Alphabet {
    private final int ALPHABET_LENGTH = 122;
    private final int NUMBER_LENGTH = 57;
    private String words;
    private char[] wordsChar;

    public Alphabet(String words) {
        this.words = words.toLowerCase();
        this.setWordsChar();
    }

    public void count(String type) {
        int start = type.equals("NUMBER") ? 48 : 97;
        int length = type.equals("NUMBER") ? NUMBER_LENGTH : ALPHABET_LENGTH;

        for (int i = start; i < length; i++) {
            int tmp = 0;
            for (char c : wordsChar) {
                if ((char) i == c) ++tmp;
            }
            if (tmp > 0) {
                System.out.println((type.equals("NUMBER") ? "Angka " : "Alfabet ") + (char) i + " muncul " + tmp + " kali");
            }
        }
    }

    public void setWordsChar() {
        this.wordsChar = this.words.toCharArray();
    }

    public String getWords() {
        return words;
    }

    public char[] getWordsChar() {
        return wordsChar;
    }
}
