public class CheckIfMatrixIsXMatrix {
    

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 0, 1},
            {0, 3, 1, 0},
            {0, 5, 2, 0},
            {4, 0, 0, 2}
        };
        checkXMatrix(grid);

    }

    public static boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
    
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                if(i == j || i == n - 1 - j) {
                    System.out.println("i :" + i);
                    System.out.println(" N :" + n);
                    System.out.println(" J :" + j);
                    int eq = n - 1 - j;
                    System.out.println("EQ: " + eq);
                    if(grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if(grid[i][j] != 0) {
                        return false;
                    }
                }
                
            }
        }

        return true;
    }
}
