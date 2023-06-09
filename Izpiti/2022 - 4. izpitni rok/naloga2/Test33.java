
public class Test33 {

    public static void main(String[] args) {
        int m = 42;

        int[][] p0 = {
            {0, 40, 25},
            {15, 25, 20},
            {29, 19, 10},
            {26, 18, 11},
            {6, 23, 23},
            {1, 13, 18},
            {29, 23, 3},
            {11, 8, 24},
            {3, 12, 23},
            {27, 28, 5},
            {8, 9, 3},
            {6, 17, 20},
            {4, 38, 16},
            {13, 24, 24},
            {1, 41, 25},
            {14, 22, 22},
            {8, 2, 22},
            {11, 19, 7},
            {0, 27, 25},
            {5, 14, 9},
            {0, 18, 15},
            {35, 30, 7},
            {5, 10, 11},
            {22, 7, 8},
            {7, 29, 15},
            {0, 39, 8},
            {5, 6, 15},
            {4, 26, 19},
            {39, 19, 2},
            {23, 3, 11},
            {16, 33, 18},
            {9, 37, 14},
            {24, 16, 17},
            {32, 27, 7},
            {19, 35, 19},
            {26, 15, 11},
            {31, 39, 4},
            {7, 34, 7},
            {27, 20, 15},
            {0, 16, 5},
            {23, 4, 13},
            {4, 11, 1},
            {37, 31, 2},
            {3, 21, 17},
            {30, 34, 2},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {40, 33, 1},
            {7, 2, 2},
            {28, 10, 4},
            {22, 33, 3},
            {26, 14, 2},
            {13, 22, 5},
            {0, 28, 5},
            {11, 29, 1},
            {3, 33, 1},
            {0, 8, 3},
            {6, 16, 2},
            {10, 17, 2},
            {38, 18, 1},
            {18, 3, 2},
            {3, 24, 4},
            {37, 32, 3},
            {31, 26, 4},
            {13, 33, 1},
            {19, 6, 3},
            {24, 19, 4},
            {25, 25, 4},
            {1, 21, 3},
            {33, 34, 4},
            {29, 35, 1},
            {4, 35, 1},
            {25, 34, 4},
            {10, 6, 5},
            {18, 25, 1},
            {9, 28, 3},
            {31, 22, 1},
            {10, 4, 1},
            {21, 18, 1},
            {9, 32, 5},
            {13, 39, 5},
            {29, 19, 5},
            {5, 3, 1},
            {21, 8, 4},
            {10, 27, 2},
            {11, 16, 3},
            {22, 36, 2},
            {14, 1, 1},
            {17, 34, 5},
            {31, 32, 5},
            {5, 36, 1},
            {17, 5, 4},
            {2, 20, 5},
            {6, 41, 3},
            {28, 17, 1},
            {10, 15, 2},
            {34, 39, 4},
            {28, 14, 4},
            {16, 27, 5},
            {3, 10, 1},
            {33, 17, 1},
            {18, 38, 3},
            {10, 20, 1},
            {1, 26, 3},
            {22, 35, 3},
            {35, 15, 3},
            {35, 36, 2},
            {27, 16, 5},
            {20, 22, 5},
            {14, 14, 5},
            {2, 19, 4},
            {6, 35, 1},
            {29, 37, 4},
            {11, 41, 5},
            {2, 7, 1},
            {13, 19, 5},
            {11, 12, 5},
            {37, 33, 2},
            {4, 7, 5},
            {26, 4, 5},
            {16, 2, 5},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {26, 8, 4},
            {8, 31, 1},
            {27, 41, 3},
            {30, 41, 1},
            {1, 10, 7},
            {2, 33, 6},
            {18, 14, 8},
            {22, 9, 6},
            {39, 29, 1},
            {32, 21, 5},
            {20, 1, 6},
            {0, 30, 4},
            {6, 9, 9},
            {15, 17, 3},
            {15, 26, 7},
            {29, 6, 10},
            {6, 3, 8},
            {27, 29, 6},
            {19, 9, 3},
            {18, 20, 7},
            {11, 40, 7},
            {21, 5, 9},
            {24, 27, 5},
            {6, 21, 9},
            {8, 5, 7},
            {11, 18, 9},
            {0, 17, 4},
            {9, 40, 1},
            {5, 36, 3},
            {1, 9, 1},
            {30, 23, 5},
            {3, 6, 7},
            {33, 3, 9},
            {17, 29, 5},
            {19, 39, 7},
            {13, 30, 5},
            {32, 18, 8},
            {13, 38, 6},
            {27, 32, 3},
            {30, 5, 2},
            {1, 7, 8},
            {37, 22, 4},
            {31, 15, 3},
            {24, 19, 9},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {19, 11, 13},
            {17, 1, 5},
            {12, 6, 5},
            {24, 4, 13},
            {20, 21, 9},
            {12, 40, 8},
            {37, 20, 1},
            {18, 17, 13},
            {20, 9, 13},
            {5, 1, 11},
            {24, 29, 11},
            {22, 15, 14},
            {13, 12, 10},
            {35, 19, 6},
            {2, 39, 11},
            {32, 13, 7},
            {15, 7, 8},
            {6, 28, 4},
            {34, 41, 6},
            {31, 25, 10},
            {21, 13, 3},
            {27, 20, 3},
            {12, 21, 4},
            {26, 16, 8},
            {32, 3, 5},
            {1, 17, 15},
            {3, 29, 15},
            {7, 8, 15},
            {3, 20, 13},
            {28, 8, 13},
            {23, 18, 11},
            {16, 24, 5},
            {20, 39, 1},
            {25, 14, 11},
            {35, 1, 4},
            {27, 30, 15},
            {26, 5, 10},
            {27, 37, 5},
            {5, 34, 11},
            {20, 41, 2},
            {24, 36, 13},
            {38, 15, 1},
            {6, 10, 9},
            {3, 31, 2},
            {11, 4, 8},
            {28, 28, 14},
            {2, 27, 13},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {15, 5, 7},
            {16, 1, 1},
            {39, 9, 1},
            {20, 35, 3},
            {23, 31, 2},
            {3, 1, 7},
            {18, 7, 6},
            {18, 6, 1},
            {37, 1, 5},
            {15, 31, 6},
            {20, 20, 2},
            {12, 28, 4},
            {39, 37, 2},
            {10, 29, 7},
            {29, 34, 2},
            {18, 34, 7},
            {7, 20, 5},
            {28, 14, 4},
            {9, 36, 1},
            {3, 27, 2},
            {12, 25, 1},
            {18, 40, 8},
            {21, 11, 5},
            {27, 38, 8},
            {20, 33, 1},
            {13, 20, 1},
            {3, 36, 4},
            {4, 31, 3},
            {28, 19, 7},
            {40, 30, 2},
            {7, 4, 7},
            {5, 13, 3},
            {34, 11, 8},
            {14, 21, 7},
            {26, 4, 1},
            {2, 21, 1},
            {18, 25, 7},
            {24, 32, 2},
            {5, 15, 4},
            {6, 14, 3},
            {14, 33, 1},
            {9, 30, 8},
            {31, 9, 3},
            {32, 10, 1},
            {35, 32, 1},
            {5, 33, 3},
            {24, 2, 5},
            {34, 36, 7},
            {8, 27, 5},
            {39, 24, 3},
            {22, 27, 2},
            {10, 9, 1},
            {31, 4, 5},
            {5, 8, 7},
            {18, 19, 7},
            {32, 25, 7},
            {21, 8, 8},
            {0, 3, 4},
            {32, 22, 4},
            {27, 36, 3},
            {33, 3, 6},
            {11, 39, 4},
            {15, 41, 8},
            {30, 17, 2},
            {27, 21, 1},
            {6, 16, 6},
            {11, 2, 2},
            {18, 37, 7},
            {3, 26, 3},
            {11, 13, 8},
            {32, 23, 5},
            {16, 15, 2},
            {24, 33, 6},
            {19, 1, 2},
            {39, 16, 2},
            {29, 2, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
