
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[146];
        predavalnice[0] = new Tretja.Avditorna("A1", 145);
        predavalnice[1] = new Tretja.Racunalnica("R1", 19, 10);
        predavalnice[2] = new Tretja.Garaza("G1", 288, 399);
        predavalnice[3] = new Tretja.Avditorna("A2", 53);
        predavalnice[4] = new Tretja.Garaza("G2", 52, 195);
        predavalnice[5] = new Tretja.Racunalnica("R2", 70, 9);
        predavalnice[6] = new Tretja.Avditorna("A3", 240);
        predavalnice[7] = new Tretja.Racunalnica("R3", 88, 52);
        predavalnice[8] = new Tretja.Garaza("G3", 166, 305);
        predavalnice[9] = new Tretja.Garaza("G4", 115, 376);
        predavalnice[10] = new Tretja.Garaza("G5", 113, 162);
        predavalnice[11] = new Tretja.Garaza("G6", 69, 334);
        predavalnice[12] = new Tretja.Avditorna("A4", 249);
        predavalnice[13] = new Tretja.Racunalnica("R4", 49, 4);
        predavalnice[14] = new Tretja.Racunalnica("R5", 66, 59);
        predavalnice[15] = new Tretja.Garaza("G7", 165, 169);
        predavalnice[16] = new Tretja.Avditorna("A5", 248);
        predavalnice[17] = new Tretja.Avditorna("A6", 196);
        predavalnice[18] = new Tretja.Avditorna("A7", 187);
        predavalnice[19] = new Tretja.Garaza("G8", 179, 154);
        predavalnice[20] = new Tretja.Avditorna("A8", 26);
        predavalnice[21] = new Tretja.Avditorna("A9", 181);
        predavalnice[22] = new Tretja.Racunalnica("R6", 40, 9);
        predavalnice[23] = new Tretja.Racunalnica("R7", 54, 48);
        predavalnice[24] = new Tretja.Avditorna("A10", 37);
        predavalnice[25] = new Tretja.Racunalnica("R8", 13, 4);
        predavalnice[26] = new Tretja.Garaza("G9", 55, 138);
        predavalnice[27] = new Tretja.Avditorna("A11", 12);
        predavalnice[28] = new Tretja.Avditorna("A12", 39);
        predavalnice[29] = new Tretja.Avditorna("A13", 193);
        predavalnice[30] = new Tretja.Garaza("G10", 229, 336);
        predavalnice[31] = new Tretja.Garaza("G11", 215, 376);
        predavalnice[32] = new Tretja.Garaza("G12", 91, 323);
        predavalnice[33] = new Tretja.Racunalnica("R9", 93, 76);
        predavalnice[34] = new Tretja.Garaza("G13", 209, 320);
        predavalnice[35] = new Tretja.Garaza("G14", 195, 270);
        predavalnice[36] = new Tretja.Garaza("G15", 163, 225);
        predavalnice[37] = new Tretja.Garaza("G16", 282, 404);
        predavalnice[38] = new Tretja.Avditorna("A14", 83);
        predavalnice[39] = new Tretja.Garaza("G17", 52, 460);
        predavalnice[40] = new Tretja.Avditorna("A15", 83);
        predavalnice[41] = new Tretja.Avditorna("A16", 264);
        predavalnice[42] = new Tretja.Garaza("G18", 194, 115);
        predavalnice[43] = new Tretja.Racunalnica("R10", 92, 74);
        predavalnice[44] = new Tretja.Racunalnica("R11", 16, 8);
        predavalnice[45] = new Tretja.Avditorna("A17", 84);
        predavalnice[46] = new Tretja.Avditorna("A18", 126);
        predavalnice[47] = new Tretja.Avditorna("A19", 159);
        predavalnice[48] = new Tretja.Avditorna("A20", 100);
        predavalnice[49] = new Tretja.Racunalnica("R12", 31, 26);
        predavalnice[50] = new Tretja.Garaza("G19", 75, 494);
        predavalnice[51] = new Tretja.Racunalnica("R13", 33, 21);
        predavalnice[52] = new Tretja.Racunalnica("R14", 63, 39);
        predavalnice[53] = new Tretja.Avditorna("A21", 167);
        predavalnice[54] = new Tretja.Garaza("G20", 131, 424);
        predavalnice[55] = new Tretja.Racunalnica("R15", 56, 20);
        predavalnice[56] = new Tretja.Racunalnica("R16", 83, 7);
        predavalnice[57] = new Tretja.Garaza("G21", 115, 134);
        predavalnice[58] = new Tretja.Racunalnica("R17", 80, 53);
        predavalnice[59] = new Tretja.Racunalnica("R18", 57, 6);
        predavalnice[60] = new Tretja.Racunalnica("R19", 70, 25);
        predavalnice[61] = new Tretja.Avditorna("A22", 163);
        predavalnice[62] = new Tretja.Garaza("G22", 197, 266);
        predavalnice[63] = new Tretja.Avditorna("A23", 172);
        predavalnice[64] = new Tretja.Racunalnica("R20", 12, 12);
        predavalnice[65] = new Tretja.Racunalnica("R21", 48, 42);
        predavalnice[66] = new Tretja.Garaza("G23", 185, 373);
        predavalnice[67] = new Tretja.Racunalnica("R22", 98, 20);
        predavalnice[68] = new Tretja.Racunalnica("R23", 21, 5);
        predavalnice[69] = new Tretja.Racunalnica("R24", 11, 5);
        predavalnice[70] = new Tretja.Avditorna("A24", 112);
        predavalnice[71] = new Tretja.Avditorna("A25", 240);
        predavalnice[72] = new Tretja.Garaza("G24", 181, 310);
        predavalnice[73] = new Tretja.Avditorna("A26", 155);
        predavalnice[74] = new Tretja.Garaza("G25", 279, 426);
        predavalnice[75] = new Tretja.Garaza("G26", 254, 395);
        predavalnice[76] = new Tretja.Racunalnica("R25", 94, 6);
        predavalnice[77] = new Tretja.Racunalnica("R26", 67, 36);
        predavalnice[78] = new Tretja.Avditorna("A27", 96);
        predavalnice[79] = new Tretja.Racunalnica("R27", 33, 21);
        predavalnice[80] = new Tretja.Racunalnica("R28", 49, 15);
        predavalnice[81] = new Tretja.Avditorna("A28", 256);
        predavalnice[82] = new Tretja.Racunalnica("R29", 16, 5);
        predavalnice[83] = new Tretja.Avditorna("A29", 45);
        predavalnice[84] = new Tretja.Racunalnica("R30", 73, 56);
        predavalnice[85] = new Tretja.Garaza("G27", 119, 407);
        predavalnice[86] = new Tretja.Racunalnica("R31", 17, 6);
        predavalnice[87] = new Tretja.Racunalnica("R32", 60, 1);
        predavalnice[88] = new Tretja.Garaza("G28", 214, 389);
        predavalnice[89] = new Tretja.Garaza("G29", 143, 134);
        predavalnice[90] = new Tretja.Racunalnica("R33", 87, 68);
        predavalnice[91] = new Tretja.Garaza("G30", 222, 183);
        predavalnice[92] = new Tretja.Garaza("G31", 294, 216);
        predavalnice[93] = new Tretja.Garaza("G32", 148, 150);
        predavalnice[94] = new Tretja.Avditorna("A30", 63);
        predavalnice[95] = new Tretja.Garaza("G33", 135, 469);
        predavalnice[96] = new Tretja.Avditorna("A31", 245);
        predavalnice[97] = new Tretja.Garaza("G34", 51, 216);
        predavalnice[98] = new Tretja.Garaza("G35", 297, 196);
        predavalnice[99] = new Tretja.Racunalnica("R34", 81, 17);
        predavalnice[100] = new Tretja.Racunalnica("R35", 83, 4);
        predavalnice[101] = new Tretja.Garaza("G36", 272, 451);
        predavalnice[102] = new Tretja.Avditorna("A32", 214);
        predavalnice[103] = new Tretja.Racunalnica("R36", 61, 48);
        predavalnice[104] = new Tretja.Racunalnica("R37", 30, 10);
        predavalnice[105] = new Tretja.Racunalnica("R38", 81, 55);
        predavalnice[106] = new Tretja.Garaza("G37", 209, 135);
        predavalnice[107] = new Tretja.Garaza("G38", 295, 172);
        predavalnice[108] = new Tretja.Racunalnica("R39", 45, 39);
        predavalnice[109] = new Tretja.Avditorna("A33", 96);
        predavalnice[110] = new Tretja.Garaza("G39", 251, 380);
        predavalnice[111] = new Tretja.Racunalnica("R40", 69, 52);
        predavalnice[112] = new Tretja.Racunalnica("R41", 64, 27);
        predavalnice[113] = new Tretja.Racunalnica("R42", 63, 44);
        predavalnice[114] = new Tretja.Racunalnica("R43", 30, 19);
        predavalnice[115] = new Tretja.Garaza("G40", 164, 113);
        predavalnice[116] = new Tretja.Garaza("G41", 154, 336);
        predavalnice[117] = new Tretja.Garaza("G42", 152, 386);
        predavalnice[118] = new Tretja.Avditorna("A34", 81);
        predavalnice[119] = new Tretja.Garaza("G43", 116, 409);
        predavalnice[120] = new Tretja.Avditorna("A35", 264);
        predavalnice[121] = new Tretja.Garaza("G44", 152, 328);
        predavalnice[122] = new Tretja.Avditorna("A36", 46);
        predavalnice[123] = new Tretja.Racunalnica("R44", 39, 37);
        predavalnice[124] = new Tretja.Racunalnica("R45", 77, 38);
        predavalnice[125] = new Tretja.Avditorna("A37", 66);
        predavalnice[126] = new Tretja.Garaza("G45", 91, 421);
        predavalnice[127] = new Tretja.Racunalnica("R46", 35, 29);
        predavalnice[128] = new Tretja.Garaza("G46", 237, 297);
        predavalnice[129] = new Tretja.Racunalnica("R47", 71, 46);
        predavalnice[130] = new Tretja.Avditorna("A38", 235);
        predavalnice[131] = new Tretja.Racunalnica("R48", 82, 60);
        predavalnice[132] = new Tretja.Racunalnica("R49", 77, 52);
        predavalnice[133] = new Tretja.Avditorna("A39", 270);
        predavalnice[134] = new Tretja.Racunalnica("R50", 93, 60);
        predavalnice[135] = new Tretja.Racunalnica("R51", 79, 25);
        predavalnice[136] = new Tretja.Garaza("G47", 122, 122);
        predavalnice[137] = new Tretja.Avditorna("A40", 288);
        predavalnice[138] = new Tretja.Garaza("G48", 151, 248);
        predavalnice[139] = new Tretja.Racunalnica("R52", 76, 22);
        predavalnice[140] = new Tretja.Racunalnica("R53", 22, 8);
        predavalnice[141] = new Tretja.Racunalnica("R54", 78, 54);
        predavalnice[142] = new Tretja.Avditorna("A41", 165);
        predavalnice[143] = new Tretja.Racunalnica("R55", 81, 44);
        predavalnice[144] = new Tretja.Racunalnica("R56", 46, 38);
        predavalnice[145] = new Tretja.Racunalnica("R57", 57, 53);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(577, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(6233, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(12616, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(32978, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}