package com.example.alper.mymosalphabet;

import java.util.ArrayList;

/**
 * Created by Alper on 06/14/2015.
 */
public class MorsHarf {

    int uzunBirim = 1000;
    int ortaBirim = 500;
    int kisaBirim = 100;

    int [] Mors_A = {ortaBirim,uzunBirim};
    int [] Mors_B = {uzunBirim,ortaBirim,ortaBirim,ortaBirim};
    ArrayList response = new ArrayList();

    public MorsHarf() {
    }


    public ArrayList parseMors(String str)
    {
        int t =0;
        char[] bf = str.toCharArray();
        while (t< str.length())
        {
            if(bf[t] == 'A' || bf[t] == 'a' )
            {
                response.add(Mors_A);
            }else if (bf[t] == 'B' || bf[t] == 'b' )
            {
                response.add(Mors_B);
            }
            ++t;
        }
        return response;
    }



}
