
public class Test50 {

    public static void main(String[] args) {
        int m = 59;

        int[][] p0 = {
            {45, 10, 1},
            {5, 39, 1},
            {39, 8, 1},
            {57, 57, 2},
            {40, 50, 1},
            {1, 14, 1},
            {53, 19, 1},
            {1, 53, 1},
            {44, 29, 1},
            {2, 9, 1},
            {3, 31, 2},
            {48, 15, 1},
            {50, 8, 2},
            {13, 13, 2},
            {17, 14, 1},
            {25, 18, 2},
            {55, 52, 2},
            {54, 17, 1},
            {37, 6, 1},
            {36, 38, 1},
            {49, 50, 1},
            {56, 20, 1},
            {33, 1, 2},
            {49, 31, 2},
            {21, 11, 1},
            {46, 28, 1},
            {45, 24, 2},
            {54, 44, 2},
            {12, 17, 1},
            {25, 40, 1},
            {26, 23, 2},
            {11, 8, 2},
            {6, 24, 2},
            {2, 23, 1},
            {6, 23, 2},
            {9, 43, 1},
            {41, 44, 2},
            {34, 8, 2},
            {0, 56, 2},
            {2, 25, 2},
            {53, 3, 1},
            {28, 44, 1},
            {14, 40, 1},
            {17, 46, 1},
            {56, 53, 1},
            {8, 21, 2},
            {51, 24, 1},
            {6, 17, 2},
            {25, 14, 1},
            {27, 39, 2},
            {38, 13, 2},
            {14, 41, 1},
            {44, 21, 2},
            {49, 32, 2},
            {1, 20, 2},
            {56, 21, 1},
            {32, 16, 2},
            {23, 25, 1},
            {47, 10, 1},
            {20, 42, 2},
            {57, 52, 2},
            {44, 53, 2},
            {5, 16, 2},
            {0, 12, 1},
            {40, 12, 1},
            {32, 11, 1},
            {53, 48, 2},
            {34, 23, 1},
            {57, 17, 1},
            {7, 34, 1},
            {48, 10, 2},
            {51, 32, 2},
            {36, 24, 2},
            {14, 16, 2},
            {48, 29, 2},
            {47, 58, 2},
            {23, 51, 2},
            {37, 29, 2},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {22, 56, 36},
            {23, 2, 35},
            {37, 14, 16},
            {13, 23, 8},
            {37, 22, 9},
            {34, 21, 20},
            {16, 11, 19},
            {6, 57, 8},
            {18, 17, 36},
            {0, 34, 39},
            {18, 28, 5},
            {12, 44, 31},
            {11, 42, 27},
            {9, 53, 13},
            {22, 36, 20},
            {53, 48, 4},
            {1, 3, 7},
            {4, 51, 41},
            {37, 52, 9},
            {10, 55, 36},
            {26, 30, 29},
            {13, 22, 24},
            {8, 25, 25},
            {23, 10, 13},
            {7, 29, 42},
            {50, 58, 9},
            {22, 19, 33},
            {14, 5, 31},
            {21, 9, 4},
            {23, 53, 21},
            {28, 12, 30},
            {37, 16, 6},
            {42, 46, 9},
            {7, 26, 12},
            {44, 40, 11},
            {28, 27, 9},
            {31, 13, 27},
            {44, 50, 7},
            {11, 54, 39},
            {38, 38, 20},
            {8, 46, 10},
            {12, 15, 37},
            {44, 36, 9},
            {24, 48, 4},
            {7, 32, 26},
            {0, 2, 6},
            {11, 6, 25},
            {32, 20, 7},
            {0, 47, 28},
            {19, 38, 18},
            {22, 57, 26},
            {25, 35, 8},
            {46, 10, 3},
            {41, 33, 15},
            {25, 26, 30},
            {38, 27, 12},
            {1, 27, 25},
            {13, 45, 28},
            {2, 28, 14},
            {14, 19, 3},
            {13, 1, 36},
            {24, 18, 19},
            {1, 18, 5},
            {25, 39, 26},
            {0, 58, 9},
            {15, 33, 13},
            {0, 10, 15},
            {38, 8, 9},
            {34, 48, 5},
            {0, 11, 9},
            {10, 40, 7},
            {46, 16, 1},
            {2, 8, 32},
            {4, 7, 13},
            {37, 27, 1},
            {17, 13, 3},
            {16, 43, 20},
            {1, 14, 34},
            {22, 23, 30},
            {51, 24, 1},
            {32, 4, 21},
            {33, 31, 23},
            {20, 49, 39},
            {22, 24, 12},
            {47, 6, 2},
            {22, 37, 24},
            {14, 58, 30},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {8, 28, 36},
            {10, 22, 43},
            {10, 47, 42},
            {25, 56, 21},
            {8, 21, 38},
            {27, 50, 16},
            {17, 29, 28},
            {21, 39, 36},
            {13, 38, 14},
            {12, 20, 45},
            {15, 58, 33},
            {7, 40, 3},
            {0, 48, 39},
            {2, 43, 29},
            {19, 26, 23},
            {0, 32, 2},
            {4, 33, 39},
            {29, 35, 30},
            {34, 42, 4},
            {6, 45, 44},
            {18, 46, 17},
            {1, 37, 21},
            {25, 7, 30},
            {10, 14, 36},
            {5, 36, 36},
            {18, 4, 38},
            {23, 31, 28},
            {8, 54, 47},
            {26, 32, 14},
            {2, 25, 39},
            {3, 18, 49},
            {41, 40, 6},
            {6, 41, 3},
            {28, 5, 30},
            {4, 30, 52},
            {27, 16, 17},
            {6, 3, 31},
            {9, 1, 41},
            {0, 29, 13},
            {31, 41, 24},
            {8, 12, 30},
            {16, 55, 20},
            {5, 17, 52},
            {3, 52, 39},
            {18, 53, 7},
            {18, 44, 12},
            {15, 8, 42},
            {27, 34, 17},
            {1, 10, 43},
            {4, 51, 40},
            {42, 36, 1},
            {42, 26, 17},
            {7, 13, 52},
            {4, 42, 24},
            {47, 16, 10},
            {5, 56, 19},
            {5, 27, 50},
            {30, 49, 18},
            {27, 15, 12},
            {0, 38, 3},
            {38, 9, 17},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {40, 12, 10},
            {54, 41, 3},
            {45, 33, 2},
            {9, 16, 5},
            {17, 8, 11},
            {26, 17, 8},
            {35, 40, 15},
            {3, 21, 5},
            {51, 37, 5},
            {37, 17, 12},
            {14, 39, 6},
            {38, 58, 5},
            {13, 29, 6},
            {17, 40, 7},
            {7, 2, 12},
            {23, 38, 14},
            {46, 4, 2},
            {51, 31, 4},
            {44, 49, 15},
            {51, 28, 2},
            {33, 34, 16},
            {37, 18, 4},
            {37, 46, 11},
            {42, 51, 15},
            {43, 1, 10},
            {21, 28, 15},
            {15, 3, 8},
            {33, 52, 4},
            {3, 48, 7},
            {13, 32, 12},
            {1, 19, 16},
            {0, 28, 2},
            {5, 9, 2},
            {9, 13, 14},
            {41, 13, 14},
            {28, 3, 10},
            {33, 14, 4},
            {52, 42, 4},
            {0, 42, 13},
            {44, 18, 11},
            {14, 53, 16},
            {36, 6, 3},
            {32, 12, 7},
            {8, 34, 15},
            {26, 50, 7},
            {38, 7, 15},
            {13, 30, 7},
            {32, 37, 6},
            {40, 36, 14},
            {4, 44, 16},
            {13, 15, 1},
            {38, 35, 16},
            {43, 16, 13},
            {14, 49, 15},
            {25, 9, 2},
            {0, 43, 16},
            {35, 57, 13},
            {31, 2, 15},
            {33, 47, 3},
            {0, 6, 6},
            {54, 1, 1},
            {30, 40, 5},
            {10, 54, 14},
            {1, 27, 7},
            {4, 47, 14},
            {31, 39, 3},
            {38, 47, 11},
            {39, 20, 16},
            {53, 2, 4},
            {40, 15, 6},
            {53, 32, 5},
            {15, 5, 9},
            {30, 26, 11},
            {7, 20, 9},
            {44, 29, 11},
            {0, 8, 6},
            {19, 16, 5},
            {7, 25, 12},
            {35, 24, 2},
            {25, 15, 10},
            {21, 36, 7},
            {23, 14, 3},
            {42, 39, 7},
            {38, 16, 5},
            {42, 26, 15},
            {4, 55, 8},
            {35, 9, 6},
            {24, 33, 6},
            {35, 53, 13},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {18, 36, 3},
            {23, 16, 13},
            {15, 2, 16},
            {12, 18, 26},
            {17, 52, 24},
            {22, 12, 33},
            {4, 13, 25},
            {23, 22, 35},
            {4, 56, 33},
            {3, 1, 11},
            {2, 26, 2},
            {8, 6, 15},
            {22, 48, 12},
            {6, 37, 23},
            {23, 24, 35},
            {37, 1, 9},
            {22, 8, 22},
            {2, 54, 36},
            {2, 47, 16},
            {26, 46, 21},
            {30, 26, 24},
            {5, 38, 21},
            {7, 40, 15},
            {13, 17, 5},
            {27, 14, 23},
            {32, 53, 24},
            {55, 12, 3},
            {0, 55, 7},
            {15, 20, 34},
            {36, 17, 2},
            {20, 55, 25},
            {1, 49, 34},
            {39, 15, 6},
            {17, 41, 20},
            {11, 27, 18},
            {47, 1, 10},
            {35, 42, 1},
            {10, 43, 34},
            {39, 48, 11},
            {36, 10, 21},
            {31, 30, 21},
            {8, 30, 2},
            {6, 4, 22},
            {26, 32, 26},
            {44, 13, 10},
            {34, 5, 16},
            {13, 29, 33},
            {20, 19, 18},
            {0, 4, 4},
            {10, 35, 24},
            {28, 31, 8},
            {13, 57, 34},
            {15, 23, 27},
            {41, 50, 5},
            {25, 33, 22},
            {18, 51, 35},
            {25, 25, 33},
            {36, 58, 22},
            {13, 50, 13},
            {44, 31, 1},
            {26, 34, 2},
            {11, 9, 22},
            {31, 28, 23},
            {2, 5, 13},
            {38, 6, 9},
            {0, 50, 3},
            {23, 45, 6},
            {14, 42, 20},
            {1, 25, 4},
            {38, 7, 20},
            {32, 11, 5},
            {9, 44, 33},
            {43, 17, 16},
            {6, 58, 29},
            {1, 15, 14},
            {43, 21, 16},
            {0, 3, 23},
            {15, 41, 2},
            {45, 9, 9},
            {6, 39, 29},
            {39, 37, 2},
            {0, 31, 12},
            {40, 34, 6},
            {15, 32, 7},
            {19, 14, 2},
            {29, 7, 3},
            {18, 10, 11},
            {17, 51, 1},
            {35, 49, 19},
            {40, 18, 10},
            {5, 42, 9},
            {31, 2, 27},
            {40, 11, 16},
            {50, 54, 1},
            {33, 34, 2},
            {28, 47, 16},
            {6, 44, 3},
            {26, 40, 27},
            {9, 21, 10},
            {1, 14, 16},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
