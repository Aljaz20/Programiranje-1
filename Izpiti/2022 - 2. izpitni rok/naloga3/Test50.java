
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[168];
        predavalnice[0] = new Tretja.Garaza("G1", 138, 393);
        predavalnice[1] = new Tretja.Racunalnica("R1", 53, 40);
        predavalnice[2] = new Tretja.Racunalnica("R2", 53, 32);
        predavalnice[3] = new Tretja.Avditorna("A1", 278);
        predavalnice[4] = new Tretja.Garaza("G2", 209, 280);
        predavalnice[5] = new Tretja.Avditorna("A2", 278);
        predavalnice[6] = new Tretja.Garaza("G3", 212, 481);
        predavalnice[7] = new Tretja.Garaza("G4", 288, 375);
        predavalnice[8] = new Tretja.Racunalnica("R3", 79, 23);
        predavalnice[9] = new Tretja.Avditorna("A3", 147);
        predavalnice[10] = new Tretja.Racunalnica("R4", 89, 16);
        predavalnice[11] = new Tretja.Garaza("G5", 164, 425);
        predavalnice[12] = new Tretja.Racunalnica("R5", 54, 51);
        predavalnice[13] = new Tretja.Avditorna("A4", 198);
        predavalnice[14] = new Tretja.Garaza("G6", 65, 388);
        predavalnice[15] = new Tretja.Garaza("G7", 196, 214);
        predavalnice[16] = new Tretja.Avditorna("A5", 152);
        predavalnice[17] = new Tretja.Avditorna("A6", 236);
        predavalnice[18] = new Tretja.Avditorna("A7", 92);
        predavalnice[19] = new Tretja.Racunalnica("R6", 21, 2);
        predavalnice[20] = new Tretja.Racunalnica("R7", 34, 17);
        predavalnice[21] = new Tretja.Avditorna("A8", 95);
        predavalnice[22] = new Tretja.Racunalnica("R8", 31, 27);
        predavalnice[23] = new Tretja.Garaza("G8", 145, 452);
        predavalnice[24] = new Tretja.Racunalnica("R9", 48, 15);
        predavalnice[25] = new Tretja.Racunalnica("R10", 52, 10);
        predavalnice[26] = new Tretja.Garaza("G9", 241, 148);
        predavalnice[27] = new Tretja.Avditorna("A9", 292);
        predavalnice[28] = new Tretja.Garaza("G10", 254, 183);
        predavalnice[29] = new Tretja.Garaza("G11", 149, 221);
        predavalnice[30] = new Tretja.Garaza("G12", 198, 408);
        predavalnice[31] = new Tretja.Racunalnica("R11", 15, 10);
        predavalnice[32] = new Tretja.Avditorna("A10", 36);
        predavalnice[33] = new Tretja.Garaza("G13", 201, 182);
        predavalnice[34] = new Tretja.Racunalnica("R12", 80, 66);
        predavalnice[35] = new Tretja.Avditorna("A11", 174);
        predavalnice[36] = new Tretja.Avditorna("A12", 143);
        predavalnice[37] = new Tretja.Racunalnica("R13", 41, 1);
        predavalnice[38] = new Tretja.Garaza("G14", 295, 480);
        predavalnice[39] = new Tretja.Avditorna("A13", 92);
        predavalnice[40] = new Tretja.Garaza("G15", 80, 129);
        predavalnice[41] = new Tretja.Racunalnica("R14", 71, 14);
        predavalnice[42] = new Tretja.Avditorna("A14", 95);
        predavalnice[43] = new Tretja.Garaza("G16", 82, 427);
        predavalnice[44] = new Tretja.Avditorna("A15", 65);
        predavalnice[45] = new Tretja.Avditorna("A16", 183);
        predavalnice[46] = new Tretja.Garaza("G17", 287, 186);
        predavalnice[47] = new Tretja.Avditorna("A17", 15);
        predavalnice[48] = new Tretja.Racunalnica("R15", 72, 62);
        predavalnice[49] = new Tretja.Garaza("G18", 214, 296);
        predavalnice[50] = new Tretja.Avditorna("A18", 163);
        predavalnice[51] = new Tretja.Avditorna("A19", 173);
        predavalnice[52] = new Tretja.Garaza("G19", 143, 170);
        predavalnice[53] = new Tretja.Garaza("G20", 184, 215);
        predavalnice[54] = new Tretja.Garaza("G21", 112, 378);
        predavalnice[55] = new Tretja.Avditorna("A20", 48);
        predavalnice[56] = new Tretja.Avditorna("A21", 200);
        predavalnice[57] = new Tretja.Garaza("G22", 197, 432);
        predavalnice[58] = new Tretja.Garaza("G23", 285, 182);
        predavalnice[59] = new Tretja.Garaza("G24", 165, 239);
        predavalnice[60] = new Tretja.Garaza("G25", 232, 359);
        predavalnice[61] = new Tretja.Racunalnica("R16", 15, 8);
        predavalnice[62] = new Tretja.Garaza("G26", 263, 497);
        predavalnice[63] = new Tretja.Garaza("G27", 88, 254);
        predavalnice[64] = new Tretja.Avditorna("A22", 164);
        predavalnice[65] = new Tretja.Avditorna("A23", 173);
        predavalnice[66] = new Tretja.Avditorna("A24", 109);
        predavalnice[67] = new Tretja.Garaza("G28", 83, 367);
        predavalnice[68] = new Tretja.Garaza("G29", 194, 442);
        predavalnice[69] = new Tretja.Avditorna("A25", 194);
        predavalnice[70] = new Tretja.Racunalnica("R17", 28, 9);
        predavalnice[71] = new Tretja.Racunalnica("R18", 95, 82);
        predavalnice[72] = new Tretja.Avditorna("A26", 279);
        predavalnice[73] = new Tretja.Racunalnica("R19", 26, 20);
        predavalnice[74] = new Tretja.Garaza("G30", 168, 373);
        predavalnice[75] = new Tretja.Racunalnica("R20", 51, 24);
        predavalnice[76] = new Tretja.Garaza("G31", 185, 156);
        predavalnice[77] = new Tretja.Garaza("G32", 194, 345);
        predavalnice[78] = new Tretja.Racunalnica("R21", 41, 6);
        predavalnice[79] = new Tretja.Racunalnica("R22", 47, 11);
        predavalnice[80] = new Tretja.Garaza("G33", 277, 388);
        predavalnice[81] = new Tretja.Garaza("G34", 123, 253);
        predavalnice[82] = new Tretja.Garaza("G35", 88, 320);
        predavalnice[83] = new Tretja.Racunalnica("R23", 10, 10);
        predavalnice[84] = new Tretja.Garaza("G36", 73, 317);
        predavalnice[85] = new Tretja.Racunalnica("R24", 56, 51);
        predavalnice[86] = new Tretja.Avditorna("A27", 149);
        predavalnice[87] = new Tretja.Garaza("G37", 92, 448);
        predavalnice[88] = new Tretja.Garaza("G38", 215, 202);
        predavalnice[89] = new Tretja.Racunalnica("R25", 39, 33);
        predavalnice[90] = new Tretja.Racunalnica("R26", 41, 7);
        predavalnice[91] = new Tretja.Avditorna("A28", 270);
        predavalnice[92] = new Tretja.Racunalnica("R27", 87, 63);
        predavalnice[93] = new Tretja.Avditorna("A29", 182);
        predavalnice[94] = new Tretja.Racunalnica("R28", 68, 24);
        predavalnice[95] = new Tretja.Avditorna("A30", 70);
        predavalnice[96] = new Tretja.Avditorna("A31", 84);
        predavalnice[97] = new Tretja.Garaza("G39", 68, 115);
        predavalnice[98] = new Tretja.Racunalnica("R29", 57, 17);
        predavalnice[99] = new Tretja.Avditorna("A32", 114);
        predavalnice[100] = new Tretja.Racunalnica("R30", 23, 6);
        predavalnice[101] = new Tretja.Avditorna("A33", 32);
        predavalnice[102] = new Tretja.Avditorna("A34", 263);
        predavalnice[103] = new Tretja.Racunalnica("R31", 32, 26);
        predavalnice[104] = new Tretja.Garaza("G40", 215, 346);
        predavalnice[105] = new Tretja.Avditorna("A35", 59);
        predavalnice[106] = new Tretja.Garaza("G41", 92, 355);
        predavalnice[107] = new Tretja.Racunalnica("R32", 64, 56);
        predavalnice[108] = new Tretja.Avditorna("A36", 286);
        predavalnice[109] = new Tretja.Garaza("G42", 77, 183);
        predavalnice[110] = new Tretja.Racunalnica("R33", 41, 11);
        predavalnice[111] = new Tretja.Garaza("G43", 102, 454);
        predavalnice[112] = new Tretja.Avditorna("A37", 32);
        predavalnice[113] = new Tretja.Racunalnica("R34", 58, 56);
        predavalnice[114] = new Tretja.Avditorna("A38", 234);
        predavalnice[115] = new Tretja.Garaza("G44", 61, 210);
        predavalnice[116] = new Tretja.Garaza("G45", 268, 350);
        predavalnice[117] = new Tretja.Garaza("G46", 248, 310);
        predavalnice[118] = new Tretja.Avditorna("A39", 105);
        predavalnice[119] = new Tretja.Racunalnica("R35", 48, 36);
        predavalnice[120] = new Tretja.Racunalnica("R36", 24, 22);
        predavalnice[121] = new Tretja.Avditorna("A40", 96);
        predavalnice[122] = new Tretja.Racunalnica("R37", 80, 39);
        predavalnice[123] = new Tretja.Racunalnica("R38", 67, 40);
        predavalnice[124] = new Tretja.Avditorna("A41", 101);
        predavalnice[125] = new Tretja.Garaza("G47", 299, 123);
        predavalnice[126] = new Tretja.Avditorna("A42", 148);
        predavalnice[127] = new Tretja.Garaza("G48", 240, 117);
        predavalnice[128] = new Tretja.Garaza("G49", 57, 101);
        predavalnice[129] = new Tretja.Racunalnica("R39", 71, 44);
        predavalnice[130] = new Tretja.Racunalnica("R40", 66, 5);
        predavalnice[131] = new Tretja.Avditorna("A43", 37);
        predavalnice[132] = new Tretja.Garaza("G50", 250, 108);
        predavalnice[133] = new Tretja.Avditorna("A44", 115);
        predavalnice[134] = new Tretja.Avditorna("A45", 57);
        predavalnice[135] = new Tretja.Racunalnica("R41", 52, 27);
        predavalnice[136] = new Tretja.Racunalnica("R42", 19, 1);
        predavalnice[137] = new Tretja.Racunalnica("R43", 96, 16);
        predavalnice[138] = new Tretja.Avditorna("A46", 217);
        predavalnice[139] = new Tretja.Garaza("G51", 169, 500);
        predavalnice[140] = new Tretja.Garaza("G52", 113, 299);
        predavalnice[141] = new Tretja.Garaza("G53", 213, 217);
        predavalnice[142] = new Tretja.Garaza("G54", 136, 352);
        predavalnice[143] = new Tretja.Avditorna("A47", 140);
        predavalnice[144] = new Tretja.Avditorna("A48", 223);
        predavalnice[145] = new Tretja.Avditorna("A49", 296);
        predavalnice[146] = new Tretja.Avditorna("A50", 250);
        predavalnice[147] = new Tretja.Garaza("G55", 58, 355);
        predavalnice[148] = new Tretja.Racunalnica("R44", 78, 52);
        predavalnice[149] = new Tretja.Avditorna("A51", 60);
        predavalnice[150] = new Tretja.Garaza("G56", 128, 293);
        predavalnice[151] = new Tretja.Avditorna("A52", 21);
        predavalnice[152] = new Tretja.Racunalnica("R45", 34, 18);
        predavalnice[153] = new Tretja.Racunalnica("R46", 43, 36);
        predavalnice[154] = new Tretja.Avditorna("A53", 175);
        predavalnice[155] = new Tretja.Garaza("G57", 162, 236);
        predavalnice[156] = new Tretja.Avditorna("A54", 113);
        predavalnice[157] = new Tretja.Avditorna("A55", 116);
        predavalnice[158] = new Tretja.Garaza("G58", 74, 294);
        predavalnice[159] = new Tretja.Racunalnica("R47", 86, 60);
        predavalnice[160] = new Tretja.Garaza("G59", 121, 240);
        predavalnice[161] = new Tretja.Garaza("G60", 284, 274);
        predavalnice[162] = new Tretja.Avditorna("A56", 116);
        predavalnice[163] = new Tretja.Garaza("G61", 199, 465);
        predavalnice[164] = new Tretja.Racunalnica("R48", 35, 19);
        predavalnice[165] = new Tretja.Garaza("G62", 121, 265);
        predavalnice[166] = new Tretja.Garaza("G63", 217, 114);
        predavalnice[167] = new Tretja.Garaza("G64", 168, 460);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(2107, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(9967, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(14974, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(30570, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}
