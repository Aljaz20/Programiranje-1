
public class Test10 {

    public static void main(String[] args) {
        int m = 19;

        int[][] p0 = {
            {9, 10, 2},
            {5, 1, 3},
            {13, 11, 1},
            {15, 9, 2},
            {2, 12, 3},
            {14, 12, 1},
            {17, 5, 2},
            {8, 2, 1},
            {0, 16, 2},
            {11, 6, 1},
            {12, 5, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {1, 4, 12},
            {15, 10, 4},
            {0, 8, 1},
            {13, 16, 1},
            {14, 1, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {16, 6, 2},
            {5, 4, 1},
            {6, 18, 3},
            {14, 9, 1},
            {10, 3, 1},
            {0, 2, 1},
            {12, 8, 1},
            {1, 10, 2},
            {4, 4, 1},
            {15, 14, 1},
            {9, 10, 1},
            {13, 16, 1},
            {11, 3, 1},
            {18, 9, 1},
            {3, 10, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {9, 15, 1},
            {11, 3, 2},
            {16, 1, 1},
            {10, 4, 1},
            {4, 2, 2},
            {14, 11, 2},
            {2, 10, 2},
            {7, 5, 2},
            {17, 5, 1},
            {13, 5, 1},
            {18, 16, 1},
            {0, 11, 2},
            {6, 16, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {13, 17, 4},
            {3, 16, 1},
            {6, 8, 2},
            {10, 8, 2},
            {12, 8, 1},
            {4, 13, 1},
            {1, 7, 2},
            {17, 6, 2},
            {8, 5, 1},
            {9, 6, 1},
            {0, 14, 1},
            {5, 6, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
