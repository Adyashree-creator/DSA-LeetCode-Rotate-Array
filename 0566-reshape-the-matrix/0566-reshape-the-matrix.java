class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) return mat;

        int[][] res = new int[r][c];

        for (int k = 0; k < m * n; k++) {

            int oldRow = k / n;
            int oldCol = k % n;

            int newRow = k / c;
            int newCol = k % c;

            res[newRow][newCol] = mat[oldRow][oldCol];
        }

        return res;
    }
}