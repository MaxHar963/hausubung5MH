package net.htlgrieskirchen.pos3.sudoku;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/* Please enter here an answer to task four between the tags:
 * <answerTask4>
 *    Hier sollte die Antwort auf die Aufgabe 4 stehen.
 * </answerTask4>
 */
public class SudokuSolver implements ISodukoSolver {

    public SudokuSolver() {
        //initialize if necessary
    }

    @Override
    public final int[][] readSudoku(String filename) {

        int[][] arr = new int[9][9];
        ArrayList<String> column = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(filename))) {

            stream.forEach((String line) -> {
                column.add(line);

            });

            for (int i = 0; i < column.size(); i++) {

                String[] split = column.get(i).split(";");
                for (int x = 0; x < split.length; x++) {
                    arr[i][x] = Integer.parseInt(split[x]);

                }

            }
            return arr;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

    @Override
    public boolean checkSudoku(int[][] rawSudoks) {
        // implement this method
        return false; // delete this line!
    }

    @Override
    public int[][] solveSudoku(int[][] rawSudoku) {
        // implement this method
        return new int[0][0]; // delete this line!
    }

    @Override
    public int[][] solveSudokuParallel(int[][] rawSudok) {
        // implement this method
        return new int[0][0]; // delete this line!
    }
    
    public void print(int[][] arr)
    {
    
         for(int i = 0;i<arr.length;i++)
         {
                
             for(int x = 0;x<arr.length;x++)
         {
             
             System.out.print("|"+arr[i][x]);
         
         }
             
             System.out.println("");
             
         }
    
    
    }

    // add helper methods here if necessary
}
