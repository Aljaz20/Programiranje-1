
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[137];
        predavalnice[0] = new Tretja.Garaza("G1", 193, 249);
        predavalnice[1] = new Tretja.Racunalnica("R1", 98, 46);
        predavalnice[2] = new Tretja.Garaza("G2", 121, 176);
        predavalnice[3] = new Tretja.Garaza("G3", 168, 232);
        predavalnice[4] = new Tretja.Racunalnica("R2", 15, 9);
        predavalnice[5] = new Tretja.Racunalnica("R3", 61, 47);
        predavalnice[6] = new Tretja.Avditorna("A1", 265);
        predavalnice[7] = new Tretja.Racunalnica("R4", 76, 74);
        predavalnice[8] = new Tretja.Garaza("G4", 109, 119);
        predavalnice[9] = new Tretja.Racunalnica("R5", 55, 9);
        predavalnice[10] = new Tretja.Avditorna("A2", 200);
        predavalnice[11] = new Tretja.Racunalnica("R6", 87, 6);
        predavalnice[12] = new Tretja.Avditorna("A3", 37);
        predavalnice[13] = new Tretja.Avditorna("A4", 39);
        predavalnice[14] = new Tretja.Racunalnica("R7", 15, 9);
        predavalnice[15] = new Tretja.Garaza("G5", 266, 470);
        predavalnice[16] = new Tretja.Avditorna("A5", 45);
        predavalnice[17] = new Tretja.Garaza("G6", 78, 154);
        predavalnice[18] = new Tretja.Avditorna("A6", 149);
        predavalnice[19] = new Tretja.Avditorna("A7", 188);
        predavalnice[20] = new Tretja.Garaza("G7", 97, 286);
        predavalnice[21] = new Tretja.Garaza("G8", 123, 237);
        predavalnice[22] = new Tretja.Racunalnica("R8", 49, 43);
        predavalnice[23] = new Tretja.Racunalnica("R9", 26, 14);
        predavalnice[24] = new Tretja.Avditorna("A8", 134);
        predavalnice[25] = new Tretja.Avditorna("A9", 209);
        predavalnice[26] = new Tretja.Avditorna("A10", 23);
        predavalnice[27] = new Tretja.Avditorna("A11", 241);
        predavalnice[28] = new Tretja.Garaza("G9", 101, 290);
        predavalnice[29] = new Tretja.Garaza("G10", 213, 239);
        predavalnice[30] = new Tretja.Garaza("G11", 272, 132);
        predavalnice[31] = new Tretja.Racunalnica("R10", 73, 55);
        predavalnice[32] = new Tretja.Avditorna("A12", 171);
        predavalnice[33] = new Tretja.Racunalnica("R11", 90, 65);
        predavalnice[34] = new Tretja.Avditorna("A13", 43);
        predavalnice[35] = new Tretja.Garaza("G12", 51, 163);
        predavalnice[36] = new Tretja.Avditorna("A14", 35);
        predavalnice[37] = new Tretja.Racunalnica("R12", 97, 8);
        predavalnice[38] = new Tretja.Garaza("G13", 110, 354);
        predavalnice[39] = new Tretja.Avditorna("A15", 170);
        predavalnice[40] = new Tretja.Racunalnica("R13", 86, 27);
        predavalnice[41] = new Tretja.Avditorna("A16", 181);
        predavalnice[42] = new Tretja.Avditorna("A17", 130);
        predavalnice[43] = new Tretja.Racunalnica("R14", 83, 7);
        predavalnice[44] = new Tretja.Avditorna("A18", 115);
        predavalnice[45] = new Tretja.Garaza("G14", 285, 275);
        predavalnice[46] = new Tretja.Garaza("G15", 271, 325);
        predavalnice[47] = new Tretja.Garaza("G16", 218, 173);
        predavalnice[48] = new Tretja.Racunalnica("R15", 21, 18);
        predavalnice[49] = new Tretja.Garaza("G17", 237, 192);
        predavalnice[50] = new Tretja.Garaza("G18", 285, 380);
        predavalnice[51] = new Tretja.Avditorna("A19", 42);
        predavalnice[52] = new Tretja.Garaza("G19", 260, 186);
        predavalnice[53] = new Tretja.Avditorna("A20", 191);
        predavalnice[54] = new Tretja.Racunalnica("R16", 98, 79);
        predavalnice[55] = new Tretja.Avditorna("A21", 80);
        predavalnice[56] = new Tretja.Garaza("G20", 97, 454);
        predavalnice[57] = new Tretja.Racunalnica("R17", 30, 5);
        predavalnice[58] = new Tretja.Garaza("G21", 294, 370);
        predavalnice[59] = new Tretja.Avditorna("A22", 266);
        predavalnice[60] = new Tretja.Garaza("G22", 117, 495);
        predavalnice[61] = new Tretja.Avditorna("A23", 130);
        predavalnice[62] = new Tretja.Racunalnica("R18", 57, 28);
        predavalnice[63] = new Tretja.Racunalnica("R19", 33, 25);
        predavalnice[64] = new Tretja.Racunalnica("R20", 88, 23);
        predavalnice[65] = new Tretja.Racunalnica("R21", 82, 35);
        predavalnice[66] = new Tretja.Garaza("G23", 251, 177);
        predavalnice[67] = new Tretja.Garaza("G24", 121, 201);
        predavalnice[68] = new Tretja.Garaza("G25", 92, 409);
        predavalnice[69] = new Tretja.Garaza("G26", 237, 337);
        predavalnice[70] = new Tretja.Garaza("G27", 295, 196);
        predavalnice[71] = new Tretja.Garaza("G28", 118, 291);
        predavalnice[72] = new Tretja.Avditorna("A24", 275);
        predavalnice[73] = new Tretja.Racunalnica("R22", 97, 88);
        predavalnice[74] = new Tretja.Garaza("G29", 69, 226);
        predavalnice[75] = new Tretja.Garaza("G30", 243, 166);
        predavalnice[76] = new Tretja.Racunalnica("R23", 11, 11);
        predavalnice[77] = new Tretja.Garaza("G31", 215, 376);
        predavalnice[78] = new Tretja.Garaza("G32", 253, 104);
        predavalnice[79] = new Tretja.Garaza("G33", 72, 216);
        predavalnice[80] = new Tretja.Racunalnica("R24", 62, 12);
        predavalnice[81] = new Tretja.Avditorna("A25", 232);
        predavalnice[82] = new Tretja.Racunalnica("R25", 88, 79);
        predavalnice[83] = new Tretja.Racunalnica("R26", 60, 9);
        predavalnice[84] = new Tretja.Avditorna("A26", 260);
        predavalnice[85] = new Tretja.Garaza("G34", 51, 239);
        predavalnice[86] = new Tretja.Racunalnica("R27", 63, 43);
        predavalnice[87] = new Tretja.Avditorna("A27", 231);
        predavalnice[88] = new Tretja.Avditorna("A28", 124);
        predavalnice[89] = new Tretja.Avditorna("A29", 81);
        predavalnice[90] = new Tretja.Racunalnica("R28", 25, 6);
        predavalnice[91] = new Tretja.Garaza("G35", 174, 425);
        predavalnice[92] = new Tretja.Avditorna("A30", 33);
        predavalnice[93] = new Tretja.Garaza("G36", 129, 393);
        predavalnice[94] = new Tretja.Racunalnica("R29", 92, 74);
        predavalnice[95] = new Tretja.Racunalnica("R30", 33, 19);
        predavalnice[96] = new Tretja.Garaza("G37", 215, 114);
        predavalnice[97] = new Tretja.Racunalnica("R31", 65, 56);
        predavalnice[98] = new Tretja.Garaza("G38", 253, 140);
        predavalnice[99] = new Tretja.Garaza("G39", 235, 340);
        predavalnice[100] = new Tretja.Garaza("G40", 68, 323);
        predavalnice[101] = new Tretja.Avditorna("A31", 235);
        predavalnice[102] = new Tretja.Racunalnica("R32", 65, 2);
        predavalnice[103] = new Tretja.Garaza("G41", 261, 200);
        predavalnice[104] = new Tretja.Garaza("G42", 73, 259);
        predavalnice[105] = new Tretja.Avditorna("A32", 194);
        predavalnice[106] = new Tretja.Racunalnica("R33", 55, 36);
        predavalnice[107] = new Tretja.Garaza("G43", 142, 354);
        predavalnice[108] = new Tretja.Racunalnica("R34", 32, 31);
        predavalnice[109] = new Tretja.Garaza("G44", 55, 102);
        predavalnice[110] = new Tretja.Avditorna("A33", 36);
        predavalnice[111] = new Tretja.Racunalnica("R35", 77, 63);
        predavalnice[112] = new Tretja.Avditorna("A34", 143);
        predavalnice[113] = new Tretja.Racunalnica("R36", 79, 49);
        predavalnice[114] = new Tretja.Avditorna("A35", 122);
        predavalnice[115] = new Tretja.Garaza("G45", 297, 339);
        predavalnice[116] = new Tretja.Racunalnica("R37", 69, 59);
        predavalnice[117] = new Tretja.Avditorna("A36", 178);
        predavalnice[118] = new Tretja.Avditorna("A37", 119);
        predavalnice[119] = new Tretja.Avditorna("A38", 254);
        predavalnice[120] = new Tretja.Garaza("G46", 199, 445);
        predavalnice[121] = new Tretja.Avditorna("A39", 23);
        predavalnice[122] = new Tretja.Racunalnica("R38", 60, 39);
        predavalnice[123] = new Tretja.Racunalnica("R39", 79, 42);
        predavalnice[124] = new Tretja.Avditorna("A40", 245);
        predavalnice[125] = new Tretja.Racunalnica("R40", 12, 3);
        predavalnice[126] = new Tretja.Garaza("G47", 215, 478);
        predavalnice[127] = new Tretja.Garaza("G48", 110, 158);
        predavalnice[128] = new Tretja.Avditorna("A41", 76);
        predavalnice[129] = new Tretja.Garaza("G49", 58, 152);
        predavalnice[130] = new Tretja.Garaza("G50", 244, 265);
        predavalnice[131] = new Tretja.Garaza("G51", 166, 251);
        predavalnice[132] = new Tretja.Racunalnica("R41", 30, 28);
        predavalnice[133] = new Tretja.Avditorna("A42", 10);
        predavalnice[134] = new Tretja.Avditorna("A43", 244);
        predavalnice[135] = new Tretja.Racunalnica("R42", 55, 12);
        predavalnice[136] = new Tretja.Avditorna("A44", 190);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(385, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(7866, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(16203, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(23955, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}