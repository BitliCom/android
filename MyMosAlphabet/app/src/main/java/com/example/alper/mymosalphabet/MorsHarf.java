package com.example.alper.mymosalphabet;

import java.util.ArrayList;

/**
 * Created by Alper on 06/14/2015.
 */
public class MorsHarf {

    int cizgiBirim = 1200;
    int noktaBirim = 600;

    int[] Mors_A = {noktaBirim, cizgiBirim};
    int[] Mors_B = {cizgiBirim, noktaBirim, noktaBirim, noktaBirim};
    int[] Mors_C = {cizgiBirim, noktaBirim, cizgiBirim, noktaBirim};
    int[] Mors_D = {cizgiBirim, noktaBirim, noktaBirim};
    int[] Mors_E = {noktaBirim};
    int[] Mors_F = {noktaBirim, noktaBirim, cizgiBirim, noktaBirim};
    int[] Mors_G = {cizgiBirim, cizgiBirim, noktaBirim};
    int[] Mors_H = {noktaBirim, noktaBirim, noktaBirim, noktaBirim};
    int[] Mors_I = {noktaBirim, noktaBirim};
    int[] Mors_J = {noktaBirim, cizgiBirim, cizgiBirim, cizgiBirim};
    int[] Mors_K = {cizgiBirim, noktaBirim, cizgiBirim};
    int[] Mors_L = {noktaBirim, cizgiBirim, noktaBirim, noktaBirim};
    int[] Mors_M = {cizgiBirim, cizgiBirim};
    int[] Mors_N = {cizgiBirim, noktaBirim};
    int[] Mors_O = {cizgiBirim, cizgiBirim, cizgiBirim};
    int[] Mors_P = {noktaBirim, cizgiBirim, cizgiBirim};
    int[] Mors_Q = {cizgiBirim, cizgiBirim, noktaBirim, cizgiBirim};
    int[] Mors_R = {noktaBirim, cizgiBirim};
    int[] Mors_S = {noktaBirim, noktaBirim, noktaBirim};
    int[] Mors_T = {cizgiBirim};
    int[] Mors_U = {noktaBirim, noktaBirim, cizgiBirim};
    int[] Mors_V = {noktaBirim, noktaBirim, noktaBirim, cizgiBirim};
    int[] Mors_W = {noktaBirim, cizgiBirim, cizgiBirim};
    int[] Mors_X = {cizgiBirim, noktaBirim, noktaBirim, cizgiBirim};
    int[] Mors_Y = {cizgiBirim, noktaBirim, cizgiBirim, cizgiBirim};
    int[] Mors_Z = {cizgiBirim, cizgiBirim, noktaBirim, noktaBirim};
    int[] Mors_1 = {noktaBirim, cizgiBirim, cizgiBirim, cizgiBirim, cizgiBirim};
    int[] Mors_2 = {noktaBirim, noktaBirim, cizgiBirim, cizgiBirim};
    int[] Mors_3 = {noktaBirim, noktaBirim, noktaBirim, cizgiBirim, cizgiBirim};
    int[] Mors_4 = {noktaBirim, noktaBirim, noktaBirim, noktaBirim, noktaBirim};
    int[] Mors_5 = {noktaBirim, noktaBirim, noktaBirim, noktaBirim, noktaBirim};
    int[] Mors_6 = {cizgiBirim, noktaBirim, noktaBirim, noktaBirim, noktaBirim};
    int[] Mors_7 = {cizgiBirim, cizgiBirim, noktaBirim, noktaBirim, noktaBirim};
    int[] Mors_8 = {cizgiBirim, cizgiBirim, cizgiBirim, noktaBirim, noktaBirim};
    int[] Mors_9 = {cizgiBirim, cizgiBirim, cizgiBirim, cizgiBirim, noktaBirim};
    int[] Mors_0 = {cizgiBirim, cizgiBirim, cizgiBirim, cizgiBirim, cizgiBirim};

    int[] Mors_BOS = {-1};
    int[] Mors_NOKTA= {-2};


    ArrayList response = new ArrayList();

    public MorsHarf() {
    }


    public ArrayList parseMors(String str) {
        int t = 0;
        str = str.toUpperCase();
        char[] bf = str.toCharArray();
        while (t < str.length()) {
            switch (bf[t]) {
                case 'A':
                    response.add(Mors_A);
                    break;
                case 'B':
                    response.add(Mors_B);
                    break;
                case 'C':
                    response.add(Mors_C);
                    break;
                case 'D':
                    response.add(Mors_D);
                    break;
                case 'E':
                    response.add(Mors_E);
                    break;
                case 'F':
                    response.add(Mors_F);
                    break;
                case 'G':
                    response.add(Mors_G);
                    break;
                case 'H':
                    response.add(Mors_H);
                    break;
                case 'I':
                    response.add(Mors_I);
                    break;
                case 'J':
                    response.add(Mors_J);
                    break;
                case 'K':
                    response.add(Mors_K);
                    break;
                case 'L':
                    response.add(Mors_M);
                    break;
                case 'M':
                    response.add(Mors_M);
                    break;
                case 'N':
                    response.add(Mors_N);
                    break;
                case 'O':
                    response.add(Mors_O);
                    break;
                case 'P':
                    response.add(Mors_P);
                    break;
                case 'Q':
                    response.add(Mors_Q);
                    break;
                case 'R':
                    response.add(Mors_R);
                    break;
                case 'S':
                    response.add(Mors_S);
                    break;
                case 'T':
                    response.add(Mors_T);
                    break;
                case 'U':
                    response.add(Mors_U);
                    break;
                case 'V':
                    response.add(Mors_V);
                    break;
                case 'W':
                    response.add(Mors_W);
                    break;
                case 'X':
                    response.add(Mors_X);
                    break;
                case 'Y':
                    response.add(Mors_Y);
                    break;

                case 'Z':
                    response.add(Mors_Z);
                    break;
                case '1':
                    response.add(Mors_1);
                    break;
                case '2':
                    response.add(Mors_2);
                    break;
                case '3':
                    response.add(Mors_3);
                    break;
                case '4':
                    response.add(Mors_4);
                    break;
                case '5':
                    response.add(Mors_5);
                    break;
                case '6':
                    response.add(Mors_6);
                    break;
                case '7':
                    response.add(Mors_7);
                    break;
                case '8':
                    response.add(Mors_8);
                    break;
                case '9':
                    response.add(Mors_9);
                    break;
                case '0':
                    response.add(Mors_0);
                    break;
                case ' ':
                    response.add(Mors_BOS);
                    break;
                case '.':
                    response.add(Mors_NOKTA);
                    break;            }
            ++t;
        }
        return response;
    }


}
