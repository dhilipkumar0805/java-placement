public class IdentityMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean identity = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j && a[i][j] != 1)
                    identity = false;
                else if (i != j && a[i][j] != 0)
                    identity = false;
            }
        }

        if (identity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");
    }
}