
public class Test40 {

    public static void main(String[] args) {
        int m = 49;

        int[][] p0 = {
            {23, 37, 3},
            {14, 23, 16},
            {2, 35, 14},
            {18, 40, 28},
            {34, 5, 6},
            {13, 38, 20},
            {4, 41, 14},
            {10, 45, 25},
            {13, 22, 28},
            {23, 17, 5},
            {25, 42, 11},
            {9, 25, 28},
            {33, 13, 8},
            {19, 29, 9},
            {20, 47, 14},
            {30, 44, 15},
            {2, 22, 11},
            {5, 20, 13},
            {3, 4, 18},
            {5, 32, 25},
            {5, 11, 29},
            {7, 16, 23},
            {7, 3, 3},
            {41, 32, 6},
            {23, 41, 11},
            {35, 3, 12},
            {18, 12, 6},
            {39, 43, 1},
            {31, 27, 11},
            {7, 44, 9},
            {17, 15, 20},
            {16, 31, 23},
            {4, 24, 5},
            {18, 18, 20},
            {14, 39, 6},
            {19, 8, 25},
            {4, 15, 7},
            {29, 4, 16},
            {0, 36, 23},
            {33, 2, 7},
            {11, 19, 21},
            {5, 33, 18},
            {10, 14, 21},
            {42, 6, 6},
            {37, 10, 2},
            {20, 26, 1},
            {22, 1, 4},
            {18, 6, 7},
            {17, 5, 17},
            {17, 7, 11},
            {22, 3, 7},
            {20, 9, 9},
            {9, 1, 10},
            {7, 48, 14},
            {17, 35, 4},
            {28, 34, 8},
            {38, 24, 11},
            {14, 34, 11},
            {10, 21, 16},
            {26, 12, 3},
            {29, 7, 5},
            {30, 36, 9},
            {47, 13, 2},
            {35, 46, 8},
            {46, 20, 3},
            {2, 20, 3},
            {13, 28, 29},
            {28, 44, 2},
            {18, 43, 15},
            {6, 30, 1},
            {24, 26, 25},
            {2, 43, 1},
            {34, 7, 6},
            {2, 10, 9},
            {2, 3, 5},
            {9, 13, 9},
            {45, 43, 2},
            {30, 6, 5},
            {14, 3, 2},
            {11, 38, 2},
            {37, 48, 2},
            {40, 25, 1},
            {21, 48, 13},
            {2, 2, 6},
            {6, 9, 13},
            {11, 30, 29},
            {33, 32, 3},
            {8, 2, 8},
            {27, 39, 15},
            {43, 21, 6},
            {9, 42, 10},
            {43, 16, 6},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {24, 6, 20},
            {25, 35, 15},
            {16, 33, 16},
            {15, 11, 19},
            {28, 29, 19},
            {19, 25, 18},
            {24, 16, 12},
            {21, 46, 14},
            {20, 7, 17},
            {2, 2, 13},
            {4, 18, 5},
            {30, 8, 5},
            {20, 14, 9},
            {29, 27, 1},
            {24, 19, 6},
            {13, 31, 20},
            {4, 13, 5},
            {4, 16, 7},
            {45, 47, 2},
            {25, 24, 4},
            {24, 38, 7},
            {19, 1, 8},
            {3, 21, 16},
            {10, 10, 5},
            {27, 2, 17},
            {12, 32, 16},
            {34, 17, 5},
            {27, 41, 13},
            {9, 44, 20},
            {33, 48, 13},
            {43, 17, 6},
            {41, 34, 4},
            {9, 18, 9},
            {28, 4, 12},
            {14, 15, 5},
            {3, 27, 17},
            {32, 36, 10},
            {20, 47, 7},
            {41, 40, 2},
            {31, 43, 17},
            {3, 6, 5},
            {23, 40, 13},
            {39, 26, 3},
            {19, 48, 14},
            {21, 21, 14},
            {1, 12, 11},
            {31, 20, 14},
            {13, 36, 9},
            {10, 43, 20},
            {11, 35, 5},
            {24, 34, 13},
            {2, 19, 22},
            {26, 8, 3},
            {22, 42, 9},
            {3, 38, 9},
            {13, 9, 5},
            {26, 17, 7},
            {2, 39, 21},
            {22, 37, 10},
            {8, 8, 10},
            {26, 15, 13},
            {5, 5, 11},
            {9, 13, 22},
            {1, 35, 7},
            {32, 33, 17},
            {6, 26, 11},
            {28, 26, 11},
            {35, 46, 1},
            {16, 14, 4},
            {16, 3, 12},
            {0, 1, 1},
            {44, 16, 4},
            {31, 18, 6},
            {22, 41, 5},
            {12, 47, 7},
            {2, 45, 17},
            {0, 31, 7},
            {18, 28, 8},
            {19, 22, 5},
            {9, 29, 5},
            {10, 23, 17},
            {36, 38, 9},
            {35, 28, 14},
            {4, 36, 4},
            {5, 1, 11},
            {31, 47, 9},
            {9, 4, 3},
            {4, 40, 2},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {12, 28, 34},
            {32, 22, 6},
            {24, 3, 9},
            {28, 37, 7},
            {4, 44, 20},
            {4, 24, 17},
            {22, 47, 21},
            {8, 29, 17},
            {2, 43, 5},
            {6, 16, 18},
            {41, 18, 4},
            {26, 42, 16},
            {0, 19, 34},
            {16, 11, 33},
            {3, 23, 40},
            {28, 48, 20},
            {28, 21, 18},
            {21, 7, 23},
            {47, 22, 2},
            {20, 38, 28},
            {7, 21, 15},
            {5, 32, 21},
            {6, 4, 1},
            {4, 18, 34},
            {47, 4, 2},
            {6, 26, 35},
            {37, 41, 8},
            {3, 38, 17},
            {20, 40, 17},
            {1, 33, 19},
            {29, 9, 8},
            {9, 17, 22},
            {35, 30, 1},
            {10, 1, 35},
            {33, 6, 12},
            {14, 35, 33},
            {14, 8, 34},
            {5, 13, 41},
            {6, 36, 41},
            {0, 48, 4},
            {15, 39, 3},
            {9, 45, 27},
            {34, 2, 14},
            {27, 39, 19},
            {34, 31, 8},
            {12, 9, 1},
            {21, 34, 8},
            {24, 42, 2},
            {23, 30, 2},
            {7, 10, 33},
            {7, 30, 7},
            {19, 12, 27},
            {5, 15, 40},
            {19, 47, 2},
            {11, 5, 19},
            {17, 27, 24},
            {24, 25, 17},
            {9, 48, 4},
            {33, 16, 5},
            {31, 41, 6},
            {3, 8, 7},
            {16, 43, 21},
            {3, 22, 29},
            {2, 14, 35},
            {19, 31, 10},
            {43, 40, 4},
            {13, 2, 14},
            {29, 32, 13},
            {7, 20, 37},
            {5, 3, 6},
            {4, 42, 20},
            {30, 24, 15},
            {11, 12, 8},
            {8, 41, 3},
            {17, 48, 9},
            {11, 46, 15},
            {26, 44, 22},
            {1, 25, 20},
            {30, 29, 11},
            {1, 39, 8},
            {8, 6, 12},
            {34, 33, 5},
            {19, 4, 10},
            {36, 3, 8},
            {7, 40, 7},
            {13, 7, 4},
            {0, 35, 13},
            {5, 48, 4},
            {34, 19, 1},
            {36, 5, 2},
            {16, 41, 6},
            {5, 34, 2},
            {44, 34, 5},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {23, 41, 2},
            {14, 8, 19},
            {13, 46, 31},
            {12, 33, 5},
            {1, 5, 13},
            {9, 21, 15},
            {13, 11, 35},
            {19, 38, 30},
            {6, 29, 20},
            {22, 22, 18},
            {22, 7, 10},
            {7, 25, 15},
            {22, 36, 17},
            {20, 33, 14},
            {7, 26, 27},
            {12, 32, 13},
            {36, 9, 1},
            {15, 1, 22},
            {34, 26, 13},
            {5, 28, 22},
            {2, 35, 8},
            {32, 21, 6},
            {14, 14, 30},
            {14, 27, 21},
            {22, 16, 19},
            {15, 9, 10},
            {4, 19, 31},
            {1, 6, 30},
            {6, 45, 34},
            {19, 10, 1},
            {3, 12, 26},
            {9, 30, 21},
            {10, 13, 34},
            {19, 3, 28},
            {26, 4, 2},
            {22, 23, 8},
            {0, 36, 5},
            {30, 20, 6},
            {2, 10, 5},
            {25, 17, 21},
            {26, 34, 20},
            {1, 42, 34},
            {40, 29, 9},
            {20, 47, 2},
            {6, 30, 1},
            {24, 5, 11},
            {35, 37, 12},
            {0, 4, 1},
            {0, 39, 30},
            {9, 40, 30},
            {26, 10, 15},
            {20, 35, 23},
            {4, 25, 2},
            {26, 15, 23},
            {14, 48, 28},
            {12, 2, 19},
            {28, 25, 9},
            {7, 37, 16},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {35, 10, 6},
            {35, 23, 4},
            {29, 29, 5},
            {24, 11, 7},
            {21, 11, 2},
            {3, 17, 7},
            {39, 40, 3},
            {31, 38, 4},
            {27, 47, 5},
            {7, 42, 6},
            {21, 37, 4},
            {23, 8, 4},
            {35, 18, 1},
            {42, 1, 7},
            {0, 40, 6},
            {21, 26, 3},
            {6, 36, 4},
            {26, 42, 5},
            {11, 7, 6},
            {29, 35, 6},
            {22, 44, 6},
            {10, 14, 1},
            {20, 41, 4},
            {31, 5, 1},
            {38, 31, 4},
            {7, 33, 1},
            {37, 8, 2},
            {35, 47, 6},
            {19, 35, 4},
            {11, 15, 2},
            {14, 43, 7},
            {44, 15, 5},
            {17, 36, 4},
            {3, 25, 1},
            {33, 30, 2},
            {33, 15, 1},
            {2, 30, 1},
            {0, 6, 6},
            {36, 25, 2},
            {40, 48, 1},
            {43, 14, 2},
            {1, 5, 1},
            {34, 26, 5},
            {24, 18, 5},
            {20, 14, 5},
            {24, 39, 4},
            {22, 3, 2},
            {13, 40, 7},
            {2, 8, 6},
            {33, 40, 1},
            {8, 31, 7},
            {21, 23, 1},
            {39, 43, 4},
            {3, 16, 5},
            {42, 19, 5},
            {44, 37, 3},
            {16, 27, 4},
            {3, 12, 3},
            {16, 38, 3},
            {20, 29, 7},
            {34, 21, 7},
            {32, 16, 6},
            {30, 45, 7},
            {13, 48, 7},
            {26, 46, 4},
            {16, 39, 3},
            {2, 23, 5},
            {42, 28, 3},
            {18, 29, 2},
            {9, 3, 5},
            {3, 19, 1},
            {3, 20, 1},
            {13, 14, 7},
            {40, 13, 6},
            {3, 33, 1},
            {13, 34, 3},
            {16, 13, 4},
            {5, 38, 6},
            {38, 12, 1},
            {5, 46, 2},
            {31, 23, 3},
            {11, 8, 4},
            {17, 44, 4},
            {42, 24, 5},
            {1, 34, 1},
            {1, 32, 5},
            {47, 24, 1},
            {24, 45, 6},
            {5, 27, 5},
            {25, 25, 5},
            {5, 20, 3},
            {19, 38, 4},
            {30, 16, 2},
            {0, 42, 7},
            {22, 31, 5},
            {39, 30, 6},
            {35, 38, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
