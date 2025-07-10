class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && isSpecial(mat, i, j, m, n)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isSpecial(int[][] mat, int row, int col, int m, int n) {
        
        for (int j = 0; j < n; j++) {
            if (j != col && mat[row][j] == 1) {
                return false;
            }
        }

        
        for (int i = 0; i < m; i++) {
            if (i != row && mat[i][col] == 1) {
                return false;
            }
        }

        return true;
    }
} 
    