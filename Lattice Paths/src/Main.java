public class Main {
    public static void main(String[] args) {
        int input = 20;
        int n = input + 1;
        //grid
        long[][] grid = new long[n - 1][n - 1];

        int decreasing = n;
        for (int i = 0; i < n - 1; i++) {
            grid[i][n - 2] = decreasing;
            grid[n - 2][i] = decreasing--;
        }

        //right = i+1 j, bottom = i, j+1
        for (int i = n - 3; i >= 0; i--) {
            for (int j = n - 3; j >= 0; j--) {
                grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
            }
        }

        System.out.println(grid[0][0]);
    }
}