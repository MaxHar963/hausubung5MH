package net.htlgrieskirchen.pos3.sudoku;


import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SudokuSolver ss = new SudokuSolver();
        int[][] input = ss.readSudoku("1_sudoku_level1.csv");
        ss.print(input);
        
    }
}
