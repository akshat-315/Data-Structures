package Recursion.Hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N_Queens {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        findComb(0, board, ans);
        return ans;
    }

    private void findComb(int col, char[][] board, List<List<String>> ans) {
        if (col == board.length) {
            ans.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                findComb(col + 1, board, ans);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board) {
        int dupRow = row, dupCol = col;
        while (col >= 0 && row >= 0) {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }

        row = dupRow;
        col = dupCol;

        while (col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            col--;
        }

        row = dupRow;
        col = dupCol;

        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q')
                return false;
            col--;
            row++;
        }
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
