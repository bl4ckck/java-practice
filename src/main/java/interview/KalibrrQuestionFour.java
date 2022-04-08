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
}

class SolvePuzzle {
    private final Grid[] grid;
//    private final ArrayList<> resultDirection;

    SolvePuzzle(Grid[] grid) {
        this.grid = grid;
    }

    public void travelWord() {
        for (int i = 0; i < grid.length; i++) {
            // Loop words
            for (int j = 0; j < grid[i].getCharWords().size(); j++) {
                // 8 directions like compass
                if(i != 0) {
                    for (int k = 0; k < grid[i].getCharWords().get(j).length; k++) {
                        // Do travel
                        if(grid[i].getCharFindWord()[0] == grid[i].getCharWords().get(j)[k]) {

                        }
                    }
                } else {

                }
            }
        }
    }

}

class Grid {
    private int row, col;
    private String findWord;
    private char[] findWordChar;
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
    public String getReveresedFindWord() {
        return findWord;
    }

    public void setFindWord(String findWord) {
        this.findWordChar = findWord.toCharArray();
        this.findWord = findWord;
    }

    public String[] getWords() {
        return this.words;
    }

    public char[] getCharFindWord() {
        return findWordChar;
    }

    public ArrayList<char[]> getCharWords() {
        return this.wordsChar;
    }

    public void setWords(String[] words) {
        this.words = words;
        for (String word : words) {
            this.wordsChar.add(word.toCharArray());
        }
    }
}
