package net.htlgrieskirchen.pos3.sudoku;


import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SudokuSolver ss = new SudokuSolver();
        int[][] input = ss.readSudoku("MustBeTrue.csv");
        ss.print(input);
        ss.checkSudoku(input);
        System.out.println(ss.checkSudoku(input));
        
    }
}
