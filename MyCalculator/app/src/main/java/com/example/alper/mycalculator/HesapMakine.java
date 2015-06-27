package com.example.alper.mycalculator;

/**
 * Created by Alper on 03/28/2015.
 */
public class HesapMakine {

    public float sonuc;

    public float getSonuc() {
        return sonuc;
    }

    public HesapMakine() {
    }

    public void Topla (float number1, float number2)
    {
        sonuc = number1 + number2;
    }
    public void Cikart (float number1, float number2)
    {
        sonuc = number1 - number2;
    }
    public void Carp (float number1, float number2)
    {
        sonuc = number1 * number2;
    }
    public void Bol (float number1, float number2)
    {
        sonuc = number1 / number2;
    }
}
