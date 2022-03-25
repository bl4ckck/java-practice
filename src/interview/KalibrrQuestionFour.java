/**
 * Alvin Naufal
 */
package interview;

import java.util.ArrayList;
import java.util.Scanner;

public class KalibrrQuestionFour {
//    private static final List<Grid> inputArr = new ArrayList<>();
//    private static final List<Grid> inputArr = new ArrayList<>();
    private static Grid[] grid;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        grid = new Grid[in.nextInt()];

        for (int i = 0; i < grid.length; i++) {
            String[] words;
            grid[i] = new Grid();
            grid[i].setRow(in.nextInt());
            grid[i].setCol(in.nextInt());
            words = new String[grid[i].getRow()];
            in.nextLine();
            for (int j = 0; j < words.length; j++) {
                words[j] = in.nextLine();
            }
            grid[i].setFindWord(in.nextLine());
            grid[i].setWords(words);
        }

        for (int i = 0; i < grid.length; i++) {
            System.out.println("\nSelected Words #" + i + "\n===========");
            for (String word : grid[i].getWords()) {
                System.out.println("print: " + word);
            }
            System.out.println("find word: " + grid[i].getFindWord());
        }
    }

    static class SolvePuzzle {

    }
}

class Grid {
    private int row, col;
    private String findWord;
    private String[] words;
    private final ArrayList<char[]> wordsChar = new ArrayList<>();

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getFindWord() {
        return findWord;
    }

    public void setFindWord(String findWord) {
        this.findWord = findWord;
    }

    public String[] getWords() {
        return this.words;
    }

    public void setWords(String[] words) {
        this.words = words;
        for (String word : words) {
            this.wordsChar.add(word.toCharArray());
        }
    }
}
