
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[122];
        predavalnice[0] = new Tretja.Racunalnica("R1", 20, 2);
        predavalnice[1] = new Tretja.Racunalnica("R2", 35, 19);
        predavalnice[2] = new Tretja.Garaza("G1", 193, 189);
        predavalnice[3] = new Tretja.Garaza("G2", 239, 412);
        predavalnice[4] = new Tretja.Garaza("G3", 272, 304);
        predavalnice[5] = new Tretja.Racunalnica("R3", 54, 40);
        predavalnice[6] = new Tretja.Avditorna("A1", 196);
        predavalnice[7] = new Tretja.Garaza("G4", 195, 370);
        predavalnice[8] = new Tretja.Racunalnica("R4", 42, 38);
        predavalnice[9] = new Tretja.Avditorna("A2", 32);
        predavalnice[10] = new Tretja.Racunalnica("R5", 55, 21);
        predavalnice[11] = new Tretja.Racunalnica("R6", 55, 24);
        predavalnice[12] = new Tretja.Avditorna("A3", 269);
        predavalnice[13] = new Tretja.Garaza("G5", 87, 450);
        predavalnice[14] = new Tretja.Racunalnica("R7", 53, 27);
        predavalnice[15] = new Tretja.Avditorna("A4", 187);
        predavalnice[16] = new Tretja.Avditorna("A5", 108);
        predavalnice[17] = new Tretja.Racunalnica("R8", 37, 1);
        predavalnice[18] = new Tretja.Racunalnica("R9", 76, 15);
        predavalnice[19] = new Tretja.Garaza("G6", 149, 356);
        predavalnice[20] = new Tretja.Avditorna("A6", 114);
        predavalnice[21] = new Tretja.Garaza("G7", 55, 391);
        predavalnice[22] = new Tretja.Racunalnica("R10", 18, 18);
        predavalnice[23] = new Tretja.Avditorna("A7", 192);
        predavalnice[24] = new Tretja.Racunalnica("R11", 58, 38);
        predavalnice[25] = new Tretja.Garaza("G8", 198, 136);
        predavalnice[26] = new Tretja.Racunalnica("R12", 60, 60);
        predavalnice[27] = new Tretja.Avditorna("A8", 27);
        predavalnice[28] = new Tretja.Garaza("G9", 183, 435);
        predavalnice[29] = new Tretja.Garaza("G10", 100, 486);
        predavalnice[30] = new Tretja.Racunalnica("R13", 31, 19);
        predavalnice[31] = new Tretja.Avditorna("A9", 238);
        predavalnice[32] = new Tretja.Garaza("G11", 287, 292);
        predavalnice[33] = new Tretja.Racunalnica("R14", 17, 2);
        predavalnice[34] = new Tretja.Avditorna("A10", 259);
        predavalnice[35] = new Tretja.Garaza("G12", 256, 295);
        predavalnice[36] = new Tretja.Garaza("G13", 215, 225);
        predavalnice[37] = new Tretja.Garaza("G14", 216, 277);
        predavalnice[38] = new Tretja.Avditorna("A11", 43);
        predavalnice[39] = new Tretja.Garaza("G15", 293, 283);
        predavalnice[40] = new Tretja.Racunalnica("R15", 16, 15);
        predavalnice[41] = new Tretja.Racunalnica("R16", 73, 29);
        predavalnice[42] = new Tretja.Racunalnica("R17", 69, 18);
        predavalnice[43] = new Tretja.Avditorna("A12", 222);
        predavalnice[44] = new Tretja.Avditorna("A13", 115);
        predavalnice[45] = new Tretja.Racunalnica("R18", 91, 30);
        predavalnice[46] = new Tretja.Avditorna("A14", 72);
        predavalnice[47] = new Tretja.Avditorna("A15", 61);
        predavalnice[48] = new Tretja.Avditorna("A16", 31);
        predavalnice[49] = new Tretja.Avditorna("A17", 16);
        predavalnice[50] = new Tretja.Racunalnica("R19", 68, 55);
        predavalnice[51] = new Tretja.Racunalnica("R20", 31, 17);
        predavalnice[52] = new Tretja.Garaza("G16", 217, 376);
        predavalnice[53] = new Tretja.Racunalnica("R21", 88, 42);
        predavalnice[54] = new Tretja.Avditorna("A18", 49);
        predavalnice[55] = new Tretja.Avditorna("A19", 49);
        predavalnice[56] = new Tretja.Garaza("G17", 286, 411);
        predavalnice[57] = new Tretja.Racunalnica("R22", 94, 81);
        predavalnice[58] = new Tretja.Avditorna("A20", 251);
        predavalnice[59] = new Tretja.Racunalnica("R23", 95, 13);
        predavalnice[60] = new Tretja.Garaza("G18", 205, 277);
        predavalnice[61] = new Tretja.Garaza("G19", 294, 306);
        predavalnice[62] = new Tretja.Avditorna("A21", 172);
        predavalnice[63] = new Tretja.Avditorna("A22", 16);
        predavalnice[64] = new Tretja.Avditorna("A23", 85);
        predavalnice[65] = new Tretja.Racunalnica("R24", 29, 20);
        predavalnice[66] = new Tretja.Avditorna("A24", 242);
        predavalnice[67] = new Tretja.Racunalnica("R25", 47, 39);
        predavalnice[68] = new Tretja.Racunalnica("R26", 53, 53);
        predavalnice[69] = new Tretja.Avditorna("A25", 186);
        predavalnice[70] = new Tretja.Racunalnica("R27", 64, 37);
        predavalnice[71] = new Tretja.Racunalnica("R28", 79, 7);
        predavalnice[72] = new Tretja.Garaza("G20", 166, 321);
        predavalnice[73] = new Tretja.Avditorna("A26", 213);
        predavalnice[74] = new Tretja.Avditorna("A27", 190);
        predavalnice[75] = new Tretja.Avditorna("A28", 128);
        predavalnice[76] = new Tretja.Avditorna("A29", 12);
        predavalnice[77] = new Tretja.Avditorna("A30", 95);
        predavalnice[78] = new Tretja.Avditorna("A31", 38);
        predavalnice[79] = new Tretja.Garaza("G21", 295, 279);
        predavalnice[80] = new Tretja.Garaza("G22", 126, 106);
        predavalnice[81] = new Tretja.Avditorna("A32", 97);
        predavalnice[82] = new Tretja.Racunalnica("R29", 34, 9);
        predavalnice[83] = new Tretja.Garaza("G23", 93, 195);
        predavalnice[84] = new Tretja.Racunalnica("R30", 39, 19);
        predavalnice[85] = new Tretja.Garaza("G24", 186, 453);
        predavalnice[86] = new Tretja.Garaza("G25", 204, 480);
        predavalnice[87] = new Tretja.Avditorna("A33", 86);
        predavalnice[88] = new Tretja.Avditorna("A34", 50);
        predavalnice[89] = new Tretja.Racunalnica("R31", 14, 10);
        predavalnice[90] = new Tretja.Racunalnica("R32", 58, 57);
        predavalnice[91] = new Tretja.Racunalnica("R33", 51, 12);
        predavalnice[92] = new Tretja.Avditorna("A35", 14);
        predavalnice[93] = new Tretja.Racunalnica("R34", 83, 25);
        predavalnice[94] = new Tretja.Racunalnica("R35", 21, 6);
        predavalnice[95] = new Tretja.Racunalnica("R36", 78, 54);
        predavalnice[96] = new Tretja.Racunalnica("R37", 96, 42);
        predavalnice[97] = new Tretja.Garaza("G26", 107, 392);
        predavalnice[98] = new Tretja.Racunalnica("R38", 76, 18);
        predavalnice[99] = new Tretja.Avditorna("A36", 94);
        predavalnice[100] = new Tretja.Avditorna("A37", 188);
        predavalnice[101] = new Tretja.Racunalnica("R39", 32, 2);
        predavalnice[102] = new Tretja.Garaza("G27", 150, 443);
        predavalnice[103] = new Tretja.Racunalnica("R40", 30, 15);
        predavalnice[104] = new Tretja.Avditorna("A38", 286);
        predavalnice[105] = new Tretja.Garaza("G28", 261, 192);
        predavalnice[106] = new Tretja.Avditorna("A39", 200);
        predavalnice[107] = new Tretja.Garaza("G29", 243, 344);
        predavalnice[108] = new Tretja.Garaza("G30", 137, 223);
        predavalnice[109] = new Tretja.Garaza("G31", 88, 200);
        predavalnice[110] = new Tretja.Avditorna("A40", 179);
        predavalnice[111] = new Tretja.Racunalnica("R41", 78, 1);
        predavalnice[112] = new Tretja.Garaza("G32", 297, 377);
        predavalnice[113] = new Tretja.Garaza("G33", 215, 301);
        predavalnice[114] = new Tretja.Racunalnica("R42", 90, 54);
        predavalnice[115] = new Tretja.Racunalnica("R43", 38, 20);
        predavalnice[116] = new Tretja.Racunalnica("R44", 92, 77);
        predavalnice[117] = new Tretja.Avditorna("A41", 121);
        predavalnice[118] = new Tretja.Avditorna("A42", 122);
        predavalnice[119] = new Tretja.Racunalnica("R45", 33, 13);
        predavalnice[120] = new Tretja.Avditorna("A43", 235);
        predavalnice[121] = new Tretja.Avditorna("A44", 163);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(587, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(5747, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(7729, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(27661, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}
