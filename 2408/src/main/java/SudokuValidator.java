import java.util.LinkedList;
import java.util.List;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        List<Integer> listRow = new LinkedList<>();
        List<Integer> listColumn = new LinkedList<>();

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if (sudoku[i][j] != 0) {
                    if (listRow.contains(sudoku[i][j])) return false;
                    listRow.add(sudoku[i][j]);
                } else return false;
                if (sudoku[j][i] != 0) {
                    if (listColumn.contains(sudoku[j][i])) return false;
                    listColumn.add(sudoku[j][i]);
                } else return false;
            }
            listRow.clear();
            listColumn.clear();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!checkSquare(sudoku, i * 3, j * 3)) return false;
            }
        }

        return true;
    }

    /**
     *
     * @param sudoku
     * @param x
     * @param y
     * @return
     */
    private static boolean checkSquare(int[][] sudoku, int x, int y) {
        List<Integer> listSquare = new LinkedList<>();
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (sudoku[i][j] != 0) {
                    if (listSquare.contains(sudoku[i][j])) return false;
                    listSquare.add(sudoku[i][j]);
                } else return false;
            }
        }
        return true;
    }
}
