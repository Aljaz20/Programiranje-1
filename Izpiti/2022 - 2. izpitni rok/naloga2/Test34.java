
import java.util.*;

public class Test34 {

    private static final int[][][] SLIKA = {
        {{214, 254, 126}, {219, 135, 177}, { 96, 118, 132}, {131, 250,  89}, {119,   7,  83}, {162, 103,  96}, {200, 106,  80}, {180,  56, 192}, { 62,  57,  31}, { 92, 136, 137}, {121,  27,  19}, {204, 242,  26}, {107, 134,  52}, {180, 145,  66}, {159, 252,  34}, { 24,  32,   3}, {217, 232,  69}, { 26,  39, 231}, { 32,  84, 151}, { 79, 159,  47}, {183, 100,  93}, {153,  47,  81}, { 67,  40,  41}, { 93,  25,  52}, { 66, 208, 232}, {146, 133,  24}, { 73,  62,  20}, { 33,  10,  48}, {123,  61, 150}, {  6,  53, 163}, {154,  81, 143}, {126,  66, 237}, { 80,  21,  13}, {152, 132,  87}, {144, 182, 101}, {228, 237, 148}, {153,  89,  63}, {128,  74, 180}, {120, 109,  58}, {139,  23, 147}, {253,  89,  48}, { 47,  56,  62}, {199, 122,  92}, {128, 202,  12}, {227, 194,  24}, { 20, 137,  18}, { 84, 180, 198}, { 70, 114, 209}, { 81, 204,  91}, {224, 222,   8}, { 38,  69, 119}, { 10, 240,  75}, { 38, 201,  16}, {145,  50,  28}, {202, 165,  11}, { 22, 138, 240}, { 10,  26, 220}, { 22, 157,  43}, {  9, 195, 177}, { 95, 147,  44}, {233, 102,  44}, {135, 141, 101}, {122,  71, 134}, {189, 157, 137}, { 61,  45,   9}, { 25,   8,  27}, { 38,  42,  55}, { 39, 236, 248}, { 66,  26,  74}, {182,  67, 174}, { 25,   0,  85}, {201,   2, 175}, { 41,  23,  73}, {236,  18, 161}, { 35, 152, 250}, {174,  64, 253}, { 84, 213, 110}, {216, 253, 104}, { 28, 154, 165}, { 91,  45, 144}, {  7,  37, 176}, { 52,  46, 250}, {113, 109,  12}, { 24, 222, 117}, { 99,   8,  21}, {158, 194,   9}, { 62, 143, 134}, {208, 132,  80}, {133, 101,  31}, {  9,  41,  32}, { 35,  36,  40}, {203,  28, 198}, {  4,  26,  26}, { 31, 223, 102}, { 31,  94,  12}, {203,  52, 101}, {246,  50,  43}, {189, 150,  44}, {151, 155, 249}, { 86, 214,  51}, {  8, 209, 101}, {140, 207, 158}, { 38,  33,  75}, {126, 200, 193}, {165, 222, 243}, {154, 105, 214}, { 52,   4,  29}, { 52,  11,   8}, { 93,   3,  10}},
        {{ 37, 191, 188}, { 92,  69, 253}, {151, 185, 163}, {151,   8, 136}, {  1,  92, 172}, { 96, 155, 244}, { 79,  98,  67}, {105, 168,  45}, {  3, 183,   6}, { 96, 182, 247}, { 79,  52, 103}, { 59, 140, 189}, { 66,  82, 103}, {235,   8, 146}, { 73, 158, 207}, {212, 240, 218}, { 90, 112, 109}, {186,  28, 121}, {130, 148, 158}, { 86,  78,   2}, {174,  34, 173}, {170,  69, 134}, {114,  20, 175}, { 31, 162,  29}, { 28, 112,  91}, { 88, 249, 142}, {114, 197,   8}, {150,  23, 251}, {224,  35,  58}, {146,  40, 129}, {116, 225, 200}, {210, 159, 229}, {194, 212,  83}, { 32,  42,  33}, {197, 216, 118}, {118,  64, 112}, { 24,  19,  17}, { 16,  13,  10}, { 91, 206, 231}, {188,   8, 159}, {186,  76,  69}, { 95, 179, 111}, {128,   7, 193}, { 83, 184, 218}, {  8,  35,  50}, { 44, 194, 156}, {150, 120,   1}, { 43,  52, 112}, {223, 139,  75}, { 19,   5, 136}, {243,  29, 209}, { 47,  38,  38}, { 89,  63,  94}, { 15, 199, 245}, {192, 100, 140}, { 30,  96, 123}, { 61, 158,  42}, { 17, 240, 124}, {200,  71,  71}, { 84, 229, 254}, { 28,  23,   6}, {147,  70, 192}, {152, 245, 159}, { 90, 155, 164}, { 90,  74, 167}, { 67, 236, 218}, {234,  69, 200}, {163,  79,  66}, {167, 135, 123}, {241, 151, 120}, { 11, 244,  93}, { 57,  21, 121}, { 62,  72, 118}, {229, 246, 129}, { 28, 115, 235}, {143,  90,  52}, {145, 138, 130}, {106, 199, 178}, { 94,  75,   4}, { 53,  25,  53}, {241, 194, 114}, {195,  92, 186}, { 55, 247, 235}, {110, 129,  83}, {154, 119, 136}, {196,  87,  82}, {191, 103, 111}, { 35,  13, 129}, { 50, 195, 198}, { 16, 170, 183}, { 55, 149, 166}, {165,  76, 165}, { 73,  84, 147}, {241, 208,  74}, {121,   4, 233}, {196, 165, 129}, {211,  46, 140}, { 17,  92, 177}, {252, 105,  17}, {170, 242, 216}, {  5, 236, 173}, {138,  95,  28}, {113, 113, 191}, {167, 113,  32}, {150,  25, 186}, { 65, 105,  36}, {137,  65, 164}, { 84, 180, 128}, {113,  60, 238}},
        {{111, 204, 171}, {115, 140,  17}, {103, 177,  78}, {174, 219, 127}, {250, 209,  18}, { 18, 110, 247}, { 61, 117,  82}, {220,  74, 165}, {235, 224,  45}, { 28,  43,  47}, {173, 125, 126}, { 94,   1,  54}, {193,   6, 138}, { 85,   9,  34}, {132, 253, 241}, {104, 216,  83}, { 32, 162, 139}, { 40,  12,  29}, {163, 117,  85}, {241, 223, 222}, {123,  40, 140}, { 80,  19, 102}, { 12,  65,  78}, { 36, 234,  57}, {232,  28,  41}, { 41, 247, 111}, { 41,  21,  53}, {  0, 139,  82}, { 88,  39,  94}, {187, 145, 211}, {146,  16,  21}, { 11,  20,  69}, {  7,  63,  22}, {190,  53, 228}, {  3, 173, 182}, {165, 182,  90}, {132, 242,  61}, {187, 230,  19}, {  0,  26,  42}, {142,   4,  47}, {122,  21, 218}, { 25,  84, 198}, {223,  92, 100}, { 96, 239,  91}, { 59,  20,  17}, {131, 220, 237}, { 21,  52,   1}, {207, 109, 112}, {212, 214,  53}, { 54, 205,  60}, {111,  26, 139}, { 14,  12,  48}, { 52,   1, 123}, { 96, 167, 157}, {115,  36, 121}, { 16, 137, 153}, { 60, 201, 142}, { 58, 188,  52}, {  7, 117, 239}, { 22, 240,   1}, {169, 244, 154}, {242,  68, 124}, {196, 128, 249}, { 35, 116, 125}, {244, 115, 222}, { 54,  51,  60}, {128, 149, 228}, { 64, 229,  79}, { 39, 123, 146}, {178,  32, 197}, { 90,  50, 243}, { 77,  88, 225}, { 91, 211,  19}, { 71, 200, 245}, {145,  74,  70}, {149, 186, 237}, {124, 227, 244}, {250, 251,  89}, {101,  67,  87}, {175,  83,  72}, {243, 190,  68}, {183, 171, 183}, {  2, 137,  37}, { 73,  96,  82}, {219, 217,  57}, { 63,  54, 130}, { 90,   0, 242}, {244, 143,  38}, { 85, 232,  93}, { 89, 150, 219}, { 11,   0,  24}, {214, 162, 119}, { 39,  37,   3}, { 34,  32,  47}, {150, 187, 147}, { 28, 120, 106}, {198, 241, 102}, { 68, 120, 240}, {154,  32, 111}, { 74,  66, 163}, {108,  66, 181}, { 47, 165, 195}, { 75,  47,  88}, {172,   2, 188}, { 13,  60, 143}, { 58,  24,  19}, {174,  97, 156}, {  7, 189, 185}, { 26,  17,  66}},
        {{162, 219, 131}, {103, 126,  68}, { 92, 219, 179}, {180,  58, 215}, {217, 112, 254}, {133,  88, 181}, { 77,  29,  23}, { 66, 190, 134}, { 73,  49,   1}, {203, 169, 207}, { 53,  40,   2}, { 55,  24, 121}, {144,  79, 201}, { 61, 138,  35}, { 11, 171, 175}, {125, 202,   9}, { 17,  38,  61}, {184,  20, 116}, {186, 119,  16}, {  0,  50, 164}, {215,  45, 174}, { 77,  91, 217}, {231,  41,  23}, {107,  28, 128}, {133, 242, 200}, { 28,  21,  21}, {154, 200, 103}, {167, 231, 102}, {211,  36,  39}, {177,   7,  10}, {209, 156,  65}, {183, 142, 157}, {  5, 233,  38}, {136, 147,  71}, {111, 116, 171}, { 17, 124, 185}, { 86, 158, 145}, {144, 190,  92}, { 21,  32,  18}, {215,  12, 248}, { 88, 110, 204}, {162, 141, 132}, {  0,   3,  71}, {206, 207, 170}, {164,  55, 120}, {165, 217, 127}, { 41, 250, 196}, {109,  21,  55}, {217,  69,  14}, {220, 148, 164}, {135, 109, 103}, { 44,  10, 170}, {147, 233, 235}, {132, 155, 113}, {215, 138,  32}, { 78,  65, 216}, { 29,  87,  16}, {159,  77,  80}, { 44,  38,  43}, {152, 181, 104}, {136, 192, 122}, {220, 157, 195}, {154, 142, 255}, {103,  36, 253}, {187,  89, 162}, {192, 168, 144}, {154,  81, 201}, { 96, 123,  43}, {171,  55, 242}, {168, 107, 206}, {107, 148, 152}, { 62, 129, 237}, {238, 199,  15}, { 73,  16,  20}, { 83, 161, 180}, {175,  39, 216}, { 72, 251,  12}, {200, 255, 111}, { 84,  43, 173}, {197, 162, 152}, { 42, 108, 197}, {117,  52,  60}, {165, 122, 101}, {170,  51, 194}, {155,  44, 138}, { 23, 186, 199}, {246,  93,  73}, { 47,  44, 101}, { 41, 115, 225}, {103,  90,  81}, {156,  40,  31}, {252,  88,  51}, { 25, 198, 174}, { 47, 141, 150}, {117, 124, 192}, {101,  44,  53}, {137, 210, 142}, { 53, 128, 151}, {150, 137, 112}, { 35,  44,  59}, { 22,  53, 108}, {206, 221,  60}, {164,  80,  16}, {184,   4, 209}, { 41, 142, 220}, {252, 179,   3}, { 17,  32,  57}, { 92, 175,  44}, { 59, 239, 167}},
        {{202,  33,  51}, {254, 182, 165}, {238,  55, 101}, {  5, 209, 155}, { 21,  34,  80}, {255, 252, 134}, {151,   2, 238}, {119, 147, 250}, {139,  64, 159}, {216, 239, 133}, {155,  19, 188}, {173,   4, 137}, {121, 254, 244}, {236,  42, 167}, {200, 219, 109}, { 26,  26,  51}, { 20,  19, 109}, {108, 149, 210}, { 60, 138, 241}, { 12, 197, 164}, {110,  83,  79}, {189, 184, 138}, { 31,  27, 133}, { 59, 216, 135}, {225, 142, 241}, { 94,   5,  57}, {239,  71, 175}, { 50, 255,   8}, { 64,   1,  44}, {129,   4,  76}, {191,  92, 171}, {230,  51, 247}, { 36, 215,  94}, {211,  11, 106}, {193, 249, 223}, {214,  26,  68}, {  9,  77, 147}, { 43, 200,  63}, {252, 137, 110}, {234,  76, 169}, { 51,  69, 111}, {105,  89,  93}, {203,  63, 143}, {171, 196, 132}, {228,  20, 123}, {136, 137,  60}, { 94,  66,  48}, {205,  99,  39}, {232,   5,  10}, { 63,  18, 226}, {136,  85, 114}, { 12, 161, 154}, { 30,  61,  69}, {  9, 185, 100}, {129,  12, 228}, {  8,  52, 219}, {157, 221, 202}, {254,  43,  23}, {108,  86, 154}, {127, 165,   5}, {208, 160, 223}, { 83, 104,  40}, { 85,  79, 171}, {123,  78,  30}, { 73,  81, 111}, {176,  44, 159}, {211,  19,   1}, { 31, 232, 138}, {201,  24,  49}, {217, 121, 156}, {176, 241,   8}, { 50,  34,  56}, { 86, 105, 131}, { 99, 188, 182}, {187, 110,  61}, {235,  40, 146}, {255,  51, 200}, { 58,  39,  21}, {232,  85,  39}, { 94,   9,  33}, { 40, 244,  65}, {  6,  27,  45}, {190, 238, 144}, { 64, 195,  23}, {216, 164,   3}, {245,  88,  47}, { 33, 159,   3}, {214, 203, 106}, {171, 231,  31}, {238, 175, 172}, { 64,   1, 234}, { 25, 168,   1}, { 65, 160,   8}, { 36,  31, 230}, { 64,   1,  82}, { 47,  89, 164}, {189,  43, 199}, {189,  75,  22}, {169, 175, 227}, { 90,  28,  10}, { 52, 212, 133}, {108,  13,  20}, {209, 214,  56}, { 43,  40,  49}, {158,  63,  68}, {173,  21,  88}, { 39, 182, 201}, {176,  87, 198}, {103,   8, 134}},
        {{ 28,  29,  16}, { 47, 172, 198}, {208, 213, 243}, { 46,  29,  51}, {222, 150, 182}, { 24, 119, 121}, { 57, 123, 248}, { 94, 254,  89}, { 56, 109, 247}, {214, 230,  38}, { 64, 186, 212}, { 25,  84,  41}, {240, 234, 232}, { 89,  23,  59}, {198,  51,  56}, {232,  77, 141}, {129, 135, 169}, {125,  44,  90}, { 45, 114, 177}, {160, 118,  80}, { 52, 161, 176}, {129,  29,   1}, { 30, 134, 195}, { 66, 144, 196}, {123,  71,  62}, {180, 177,   9}, { 23,  24,  48}, { 62,  82, 243}, {218,  22, 247}, { 95,  56,   2}, {108,  26, 150}, {120,  45,  81}, {106,  90, 122}, {  9, 105,  69}, {245, 141,  35}, {199, 124, 158}, {154, 144, 187}, {243,  62,  96}, { 61, 211, 250}, { 76, 141, 143}, {140, 212, 246}, {220,  43, 223}, { 33,  39,  58}, { 36, 117, 199}, { 43, 202, 172}, { 59, 114,   8}, { 93, 113, 156}, {225,   2, 235}, {203, 213, 148}, { 18,  20, 218}, { 88, 106, 190}, { 84,  10, 130}, { 97,  67,  71}, {  2,  19,  48}, {203, 244,  83}, {188,  16, 217}, { 14,  56,  59}, { 24,  12, 164}, {160,  95,  64}, {  3, 105, 121}, {217, 192,  28}, { 39, 217, 111}, { 98, 143,  20}, { 25,   3,  38}, { 86,  76, 197}, { 75,  61, 171}, {101, 103, 149}, {195, 255,  43}, {  5,  36,  89}, {  0,  91, 193}, { 91, 143, 226}, {106, 155, 228}, { 57,  46, 105}, {226, 104,  90}, {127,  17,  62}, {162,  84,  52}, { 46, 122, 136}, {137, 245,   3}, { 26,  21, 153}, { 53,  28,  38}, { 10,  78, 185}, { 59, 100, 117}, {154, 225, 186}, {181, 217,  60}, {115, 158, 109}, { 87,   6, 155}, { 86, 136, 247}, {  4, 147, 148}, { 19, 244, 130}, {158, 187,  62}, {113, 118, 210}, { 52,  43, 145}, {123,   1, 183}, {152, 156,  18}, {164,  77,  71}, {149,  32, 168}, {177, 196,  80}, {162,  31, 108}, { 26,   4, 198}, {167,   6, 179}, {153, 226,  37}, {101, 112,  64}, {186, 154,  97}, {175,  94,  97}, {226, 193, 197}, { 26, 226,  83}, {118,  99,  80}, {190,  20, 148}, { 39, 236, 130}},
        {{211, 228, 183}, {169, 139,  78}, { 38,  21,   9}, {  0,  12, 200}, { 74,  31, 209}, {116, 116,  98}, {159,  68,  84}, {251,  77, 169}, {193, 119, 117}, {126,  75, 204}, { 42,  72, 134}, { 15,  57, 255}, {132,  96, 127}, {141,   1,  23}, {130, 230, 253}, { 40,  36,  19}, {107,  79, 185}, { 97,  28, 185}, {166, 232,  84}, {254,  39,   4}, { 68,  85, 137}, {101, 111, 155}, {111,  20,  53}, { 85, 150, 116}, {197, 201, 165}, { 29, 108,  94}, {166, 229, 249}, {210, 116, 142}, {187,  25,  61}, {138, 113, 113}, {186,  37,  28}, { 71, 205, 171}, {101, 160,   4}, {151, 119, 220}, {  4,  62,  45}, {109, 250, 162}, {222, 171, 222}, { 18,  19,  24}, {121, 130, 131}, {  7, 147,   5}, {253,  78,  82}, { 55,  55,  97}, {130,  36, 132}, { 15,  57, 109}, {178, 200, 134}, {102,  53,  45}, {136, 111, 240}, { 53,  87, 114}, {152, 127,  78}, { 28, 240, 162}, {178, 175,  14}, {145, 121, 213}, { 63, 132, 124}, {136, 229, 175}, { 23, 230,  50}, { 50,  97, 119}, { 11,  18,  35}, {114,   8,  41}, {200, 199, 114}, {120,  55,  42}, {106,  99,  29}, {191, 141,  22}, {119, 195, 251}, {201, 126,  80}, { 20, 100, 130}, {203, 169,  82}, { 35, 134, 148}, { 22, 227, 227}, { 47,  19,  21}, { 69,   4, 242}, {166, 163,  33}, {202, 100, 207}, { 62, 212,  92}, {158,   6, 152}, {204,  98, 114}, {248,  82, 200}, {237,  58,  67}, { 14,  60, 157}, {188, 127, 242}, {115, 245, 122}, {105, 108, 223}, { 59,  61,  70}, { 26,  63,  71}, { 52,  43, 186}, { 74,  52,   7}, {198, 190,  27}, { 93, 109, 179}, { 31, 141, 204}, {229, 112,  46}, {195, 101, 105}, {210, 228, 179}, {  7,  98, 126}, {  3,  87, 201}, {194,  75,  84}, { 53, 143, 207}, {206,  54, 231}, {155,  39,  92}, {213,   5,  70}, {182,  95, 212}, {158,  53, 208}, { 81,  18,  64}, {183, 244, 160}, { 76, 255,  75}, { 75,  51,  25}, { 82, 196, 204}, {110,  56,   5}, { 77, 108, 123}, { 27,  10, 116}, {120, 113,  41}},
        {{210,  96, 244}, { 65,  60,  15}, { 94, 163, 126}, { 80, 221,  59}, {171,  66,  48}, {210, 135, 236}, {224, 229,  69}, { 48,  50, 184}, {130,  98,  41}, {  3, 205,  22}, { 25,  60, 133}, {253,  85, 127}, { 42, 222, 173}, { 78, 130, 130}, {126, 134,  62}, { 19,  57,  46}, { 92, 242,  53}, {223,  54,  25}, { 81,  55,  72}, {146, 224, 228}, { 73, 163, 224}, { 37,  32,  87}, {253, 119, 176}, { 34,  13,   8}, {221, 230,  88}, {  4, 234, 100}, {143, 125, 155}, { 87,  43,  70}, {143, 193,  18}, {233,  62,  62}, {156,  26, 161}, {128,  56, 111}, {244,  28, 213}, {  8, 136, 134}, {220, 246, 236}, { 82,  45,   7}, { 34,  63, 127}, { 46, 134,  93}, {101,  68, 163}, {224, 197,  47}, {183, 125, 134}, {112, 103,  56}, {251,  74, 173}, { 75,   9, 132}, {115, 207, 215}, {141,  14, 180}, {248, 106, 172}, {134,  88,  73}, {148, 245, 222}, { 35,  10,  10}, {192,  71, 117}, { 74,  56,  96}, {122, 230,  96}, {204, 167, 195}, {249,  69, 149}, {243, 208,  16}, {201, 200, 239}, { 60, 152, 182}, {166, 163, 202}, {200,  73, 253}, {191,   4,  12}, {135, 131, 167}, {225, 178, 144}, {184, 150, 168}, { 91,  51,  97}, {101, 223, 163}, {124, 111, 164}, {171, 119,  71}, {247, 194,  14}, {127, 106, 195}, {255,  27, 112}, {217,  72, 106}, { 63,  18, 228}, { 55, 137, 188}, { 59,  71, 102}, {127, 101, 247}, {171,  28,  19}, { 75, 157,  57}, {211,  38,  92}, {119,  45,  45}, {233,  20, 201}, {153,  93,  58}, { 51,  38,  24}, { 23, 190, 182}, {109, 233,  83}, {123,  20, 119}, { 51,   9,  19}, {215, 201,  53}, {212, 165, 195}, {  1, 178, 222}, {231, 247, 173}, {208,  53, 196}, {116,  12, 171}, { 19,   7,  84}, {191,  85, 149}, { 56,  13, 249}, {123, 204, 126}, {187,  57, 161}, {127,  18,  74}, {143, 231,  77}, {171, 222, 209}, {209,  47, 159}, { 56,  37,  61}, { 20, 239, 209}, { 40, 147, 180}, { 80,  69,  64}, {138,   5, 154}, { 18, 231,  34}, {159, 155,  72}},
        {{127, 240, 192}, {184,  61, 201}, {102, 180, 179}, { 91, 251,  50}, {249, 216,  53}, {162, 160, 183}, { 81, 157,  49}, { 48, 151,  86}, {181,  59,  74}, {187, 121, 139}, { 30,   5,  21}, { 99, 127, 165}, {222, 122,  73}, { 97, 243, 119}, {182,   3, 243}, {126,  99,  78}, {117,  40, 173}, {241, 200,   9}, { 90, 220,  62}, {109,  26,  56}, { 97,  53,   0}, { 26,  37,  90}, {238, 207, 110}, { 53,   2, 159}, {143, 250, 158}, { 40,  77,  28}, {183, 186, 113}, { 46, 177, 142}, {202, 218,  37}, { 58,  61, 140}, { 13,  88, 148}, { 47,   9,  92}, {215, 151, 194}, {103, 163,  81}, { 81, 173, 234}, { 29, 208, 108}, { 85, 240, 156}, {120, 201,  41}, {152,   0,  28}, { 75, 129, 195}, {212, 101,  91}, {175, 124, 104}, { 39, 174, 207}, {218, 113, 143}, { 25, 167, 226}, {148, 156,  96}, { 16,   6,  47}, {100,  86,   5}, {247, 178, 144}, {101,  16, 211}, {134, 147, 215}, {225, 182, 105}, {156, 151,  85}, { 90, 226,  40}, { 84,  59, 251}, {125,   4, 245}, {130,  12,  24}, { 53, 137,  68}, {220,   3, 219}, {232, 238,  13}, {146, 231,  56}, { 23, 101,   1}, {  4,  51, 138}, {216, 209, 249}, { 77, 179, 144}, { 18, 220, 233}, { 73,  10, 115}, { 96,  41, 127}, {  4,  54, 102}, {198,  48, 180}, {117, 135,  96}, {108, 119,  72}, { 55,  31,  46}, {167,  36, 162}, {160, 128,  33}, { 85, 180,  86}, { 95, 228, 204}, {210, 120, 126}, { 65,  20, 163}, { 97,  72, 195}, { 51,  84, 218}, {  7,  88, 126}, {124, 100,  75}, { 13, 197,  36}, { 16,  44,  74}, {203,   0,   0}, {230, 150,  71}, {197,  11, 150}, {210, 165, 128}, { 86, 181,  64}, {125,  75, 164}, {  9, 140, 112}, {151, 223, 221}, {146,  18, 235}, { 65, 129,  86}, { 58,  69,  75}, {201, 139,  44}, {224, 119,  82}, {115,  83, 203}, { 78,  59,  21}, {120,  84,  13}, { 67,  60,   1}, {181, 149, 217}, { 54, 179,  32}, { 15,   0,  48}, { 95, 139, 240}, {151,  45,  96}, {100, 108, 117}, {184, 234, 148}},
        {{ 98,  24,   1}, { 24, 154, 167}, {235,  65, 233}, { 79,  14,  99}, { 48, 120, 241}, {195, 109, 210}, {155,  70,  70}, { 78,  68, 121}, {180, 167, 137}, {147,  80, 142}, {171, 246,  45}, { 73,  78, 150}, {132, 135, 182}, {210,  65,  80}, {219,  12,  46}, {152, 214, 112}, {121,  11, 162}, { 12,  24,  85}, { 91,  78,  75}, { 43,  41,  50}, {182,  74, 237}, {146,  45, 158}, {146,  25, 154}, {  5, 191,  80}, {222, 216, 105}, {173, 194, 140}, {150, 128,  25}, { 82,  56, 166}, {124,  55,  19}, {113, 119, 143}, { 64, 159,  95}, { 66,  49,  83}, { 49, 171, 192}, { 46,  34,  71}, {111, 167, 224}, { 30, 126, 222}, { 65,  12,  88}, {193, 239,  87}, {225,  56,  17}, {108,   3,  51}, { 69,  41,  69}, {251, 151,  23}, {173, 130, 244}, {145, 196, 167}, {228,   1, 178}, {248, 213,  32}, {139, 102,  44}, {194,  52,  12}, { 68,  34,  23}, {234,  45,  40}, {195,  15,  55}, {218,   7, 237}, { 79, 111,  17}, { 42,  31,  60}, {251, 123,   1}, {189,  47, 176}, {129, 178, 107}, {145, 158, 208}, {140,  99,  35}, { 73,  15, 210}, { 50, 236, 163}, { 89,  35,  57}, { 73, 216, 127}, {135, 191, 113}, { 16,  26, 163}, { 87,  74,  53}, { 53,  35,  28}, { 88, 126,  93}, {240, 112, 143}, {130,  56, 149}, { 74, 145,  16}, {146, 132,  72}, { 67,   4,  93}, { 45, 238,  82}, {152,  25,  22}, {150, 129,  80}, { 95,  76,  44}, { 61,  15,  14}, {  5,  28,  97}, {195, 129,  54}, { 92, 127, 150}, {161, 106, 105}, { 59,  30,  70}, {145,  81,  65}, {123, 165,  55}, { 93,  95, 113}, {206, 165,  12}, {146, 142, 250}, {137, 161, 150}, {109,  74, 118}, {114,   2, 104}, {162,  56, 103}, { 57,  37, 220}, { 70,  90, 239}, {119,  48, 149}, {207,  61, 104}, {127,  76, 108}, {233,  17,  90}, { 86,  42, 137}, {240,  74,  75}, { 97, 153, 225}, {159,  99, 189}, { 95,  25,  51}, {202,  18, 182}, { 83,  68, 112}, {  7, 155,  83}, {158, 150, 150}, { 16, 131, 249}, { 29, 119,  51}},
        {{202, 191, 161}, { 48,  49, 155}, {204,  85, 142}, {207, 134, 204}, {104,  93,  86}, {  8,  77, 150}, {156, 110, 153}, { 34,  96,  32}, {209,  58,  12}, {168, 167, 147}, {232, 125, 223}, {107,  73,  80}, { 72,  75, 220}, {230,  80, 143}, {223, 208, 224}, { 83,  50, 243}, { 70,  36,  66}, {238, 112,  23}, {234, 206,  50}, {132, 118, 102}, { 16,  65,  67}, {194,  98, 237}, {143, 168,  80}, {208, 238, 242}, {168, 157, 248}, { 40, 136, 100}, {163,  23,  47}, {118, 215,  82}, {181, 239, 121}, { 75,  72, 127}, {119,  25,  99}, {142,  12,  35}, {143,  53, 161}, { 98, 243, 182}, {194, 155, 187}, {148, 177,  50}, {229, 168,  23}, {147,  29,  31}, {103,  78, 113}, {164, 129, 195}, { 69, 115, 223}, {127, 244,  50}, {165, 161, 201}, {230, 118, 195}, { 96,  41,  60}, {139,  29, 219}, { 52, 129, 214}, { 40,   1,  16}, { 95, 159,  17}, {222, 178,   4}, { 34, 149, 183}, { 18,  41,  25}, { 79,  35, 117}, {220, 173,  11}, {101,  54,  67}, { 33,   7,   2}, { 47, 138,  77}, {198,  71, 102}, { 80,  64,  65}, { 12,  31,  56}, { 79,  58, 105}, { 99, 209, 172}, {183, 103,  66}, { 86,  72, 139}, { 73,  11, 110}, {177, 198, 236}, {118,  83,  72}, { 10, 184,  77}, {144,  59,  59}, {215, 220, 101}, { 54, 188,  85}, {216, 171,  66}, { 28,  15, 144}, { 57,  29, 139}, {140, 181,  73}, { 37,   7,   0}, {151,  61, 241}, {213,  70, 173}, { 95,  72, 225}, {122, 145, 221}, {195, 176, 197}, {199,  38,  89}, {133,  87,  32}, {196, 186,  95}, {  2, 182,  65}, {  7,   5, 171}, {120,  85,  29}, {202, 125, 133}, { 40,  92,  71}, {195, 149, 143}, {225,  97, 105}, { 19,  21,  21}, { 17, 181,  53}, { 41, 137,  75}, { 15,  60, 135}, {151, 178,   6}, { 27, 205, 219}, {129, 114, 152}, {  8,  55, 169}, {229, 127, 189}, {123, 153, 117}, {172, 120, 135}, { 50,   3, 129}, { 98, 116,  34}, {114,   2,  26}, { 94, 117,  39}, {101,   5,  84}, {130, 253,  98}, {246,  38,  44}},
        {{139, 134,  87}, { 27,  65, 153}, {156, 252, 240}, {211, 114, 202}, {223, 124,  40}, { 17, 165, 213}, {  4, 245, 137}, { 84,  94,  24}, { 43,  50,  63}, {182, 160, 117}, {238,  82, 103}, { 44, 162,  58}, { 87, 145, 239}, { 16,  11, 149}, { 47,  13,   8}, { 18,  35,  55}, {166, 157, 183}, { 31,  57, 193}, { 11, 204, 221}, {  0, 169,  64}, {197,  31, 223}, { 21,   9, 104}, { 27, 197,   6}, {128, 135,  26}, {194,  74,  41}, { 21,  66, 124}, {114,  35, 125}, {111,  56,  99}, {248,   3, 207}, { 90,  86,  85}, {  9,  54, 192}, {111,   5, 186}, {150, 169, 145}, { 68, 104, 142}, {189, 206,  18}, {220,  11, 189}, { 34, 184,   9}, {204,  26,  18}, { 77,  25, 205}, {115,   5, 215}, {141,  35, 114}, {176, 245, 240}, { 35,  31,  27}, {166, 167, 116}, {190,   8, 101}, { 76, 109,  23}, { 17, 222, 139}, {228, 248,  31}, {202,  45,  22}, {114,   8, 174}, {180, 114,  74}, {197,  17,  38}, {  9, 161, 226}, { 52,  21, 182}, {103,  66, 103}, { 59,  16,  50}, { 11,  90, 133}, { 19,  29,  83}, {164, 255, 120}, {186,   6, 171}, { 20,  58, 131}, {138, 173, 208}, {121,  88,  18}, { 51,  17, 108}, {128,  18,  53}, {234, 137, 212}, {132,  88, 184}, {180,  49,  71}, {163,  84,  16}, {154, 107, 165}, {  1,  38, 119}, { 52, 170, 186}, { 93,  67,  82}, { 60, 235,  12}, {254, 165,  35}, { 91, 122, 136}, {172,  86,  41}, { 24,   6,  50}, {141,  71, 178}, { 73,  90, 139}, {192, 189,  87}, {246,  81,  29}, {240,   0,  67}, { 81,  80, 121}, {109, 208,   4}, { 65, 142,  23}, { 67, 172, 187}, {226,  31, 141}, {134, 225,  91}, {183,  27,  83}, {165, 117, 194}, { 22,  15,  57}, { 17,  28, 124}, {109, 167,  63}, {187, 190, 108}, {250, 118,  59}, {153,  48,  90}, {233, 182, 242}, { 78, 103, 162}, {181, 142, 192}, { 65,  26,  33}, {247,  18, 134}, { 20,  30, 195}, { 91, 102,  94}, { 23,  12,  28}, {172, 196, 150}, {146,  78, 152}, {171,  21, 168}, { 40,   3,  28}},
        {{ 19, 156,  66}, {247, 240,   2}, { 32, 168,  52}, {173, 219,  55}, { 89,  47,  59}, {152, 127, 236}, { 97, 134, 100}, {138, 204,   8}, { 48, 166, 171}, {177, 157, 101}, {110,  38,  27}, { 83,  25,  71}, { 39,  34, 115}, {185, 122, 135}, {191, 250,  25}, {156,  81,  14}, {200, 151, 225}, { 47, 222,  59}, {222, 106, 218}, {202,  60, 103}, {182,   5,  83}, { 28,  18, 171}, {122, 115, 138}, { 60, 160,  95}, {174, 100, 117}, { 20, 116, 160}, {104,   1,  43}, { 22, 155,  18}, {107, 133, 120}, { 59,  63, 185}, { 70, 213,  38}, {136, 193, 206}, {  6,  30,  96}, {116,  75, 206}, {  7,  31, 189}, {101,  79,  93}, {  2,  79,  73}, {126,  89, 253}, {138,  20,   0}, { 44,  19,  91}, {169, 172, 191}, {187, 119, 212}, {218, 152,  37}, {193,  71, 150}, { 22,  55, 232}, { 60,  20,  62}, {225,  78, 122}, {195, 208,  96}, {197, 237, 169}, {246, 229, 187}, {232, 117,  26}, {148, 109,  90}, {165, 188, 147}, {210, 102,  69}, { 79,  52,  52}, {206,  12, 106}, {  5,  27, 101}, { 20,  16, 166}, { 25,  21,  53}, {248,  19,  88}, {194, 189,  57}, {121, 175,  91}, {176,  96, 123}, { 28, 158, 224}, { 23, 130, 174}, {174,  49, 166}, {194,  53, 164}, {149,  14,  95}, {164,  13, 112}, {168, 111, 136}, {222, 254,  95}, {143, 107, 131}, {216, 177,   9}, {146, 197,  75}, {242,  15,  90}, {209, 246, 125}, {139,  68,  28}, {222, 133,  79}, {210,  83, 102}, { 37,  36, 108}, {108,  33, 230}, {177, 219, 129}, {179,   8, 229}, {112,  87, 185}, { 44, 244,  18}, { 58,  86, 136}, {137,  80,  49}, { 47,  39,  29}, { 35, 221,  82}, { 66,  15,  47}, { 82, 169,  86}, { 13, 143, 144}, {230,  21,  92}, { 10,  20,  43}, {218, 214, 130}, {209,  91,  69}, {247, 251, 241}, { 29,   3, 117}, { 77,  60, 198}, { 79, 253,  60}, { 27,  73,  72}, { 75, 230, 174}, {154, 224,   8}, {204,  29,  53}, { 28,  34,  81}, { 64, 147,  96}, {186,  55,  69}, {213, 125,  54}, {134, 140, 128}},
        {{161, 154, 159}, {208,  82, 252}, {154,  23,  19}, {206,  66, 119}, { 22, 208, 209}, {202, 105, 107}, {250,  66,  84}, {172,   3,  44}, { 43,  67, 125}, {104,  17,  52}, { 96,  44,  10}, {208,  37,   8}, { 59,  75, 142}, { 65,  12, 154}, { 83,   7, 182}, {120,  58,  88}, {172, 126,  19}, {187,  14, 194}, {192, 218, 195}, {239, 213,  53}, {124,  94, 153}, {137,  87,  72}, { 19, 227,  35}, {236, 189, 238}, {107,   7, 215}, { 31,  28,   3}, { 66, 143,  27}, { 19, 213,  70}, { 63, 208, 105}, {157, 198,  82}, { 89,  25, 125}, {166, 161,  53}, {132, 234, 196}, {133,  57, 118}, {165, 238,  62}, { 94, 227, 180}, { 65,   1,  19}, {109,  56,  25}, {235, 137,  85}, {140,  68,  38}, {206, 120,  28}, {136,   5,  42}, {239, 120, 226}, {186,  76, 153}, {176,  31, 237}, {203, 201,  90}, { 88, 179, 102}, {147, 142,  27}, { 22,  82,  71}, {  9,  54, 114}, { 67, 191,  41}, {147, 230, 212}, {145, 184, 112}, { 78, 145,  21}, {161,  22, 166}, {  4,  37,  37}, {104, 164,  75}, {107, 253,  33}, { 15,   6, 246}, {123, 177, 121}, {191,   5,  27}, {227, 141, 217}, { 75, 225, 228}, { 60,  47,  11}, { 61,   4,  17}, {182, 221, 232}, { 32,  68,  79}, { 48, 154, 182}, {129,  51,  23}, {  6,  43,  81}, {163, 241,  82}, {137,  90, 103}, { 90,  30,   5}, {104, 138,  55}, {130,  59, 229}, {184,  35,  96}, { 85, 235, 120}, { 75, 242,  77}, {212,  73,  92}, { 16,  37,  66}, { 48, 111, 158}, {184, 101,   8}, {157, 222, 205}, {142,  93, 120}, {163, 230, 160}, { 15, 113, 129}, {  3,  82, 121}, {250,  66, 197}, {165,  32, 225}, { 28, 233, 201}, {103,  12, 202}, {142,   5, 245}, {180, 216, 213}, { 32, 156, 145}, { 49, 233,   7}, {100,  45,  45}, { 69,  89, 198}, { 92,  21, 206}, {194, 158, 122}, {102, 164,  38}, {142,  52,  38}, { 31, 196, 177}, {243, 150, 121}, {123, 217, 213}, { 41, 124, 175}, {135, 181, 189}, {233,  97, 218}, {123,  49, 166}, { 13, 100, 131}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}