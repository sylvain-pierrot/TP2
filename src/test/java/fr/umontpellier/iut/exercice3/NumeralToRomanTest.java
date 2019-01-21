package fr.umontpellier.iut.exercice3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeralToRomanTest {

    private NumeralToRoman numeralToRoman = new NumeralToRoman();


    @Disabled
    @Test
    void one_should_give_I() {
        assertEquals(numeralToRoman.getRoman(1), "I");
    }


    @Disabled
    @Test
    void five_should_give_V() {
        assertEquals(numeralToRoman.getRoman(5), "V");
    }


    @Disabled
    @Test
    void ten_should_give_X() {
        assertEquals(numeralToRoman.getRoman(10), "X");
    }


    @Disabled
    @Test
    void fifty_should_give_L() {
        assertEquals(numeralToRoman.getRoman(50), "L");
    }


    @Disabled
    @Test
    void hundred_should_give_C() {
        assertEquals(numeralToRoman.getRoman(100), "C");
    }


    @Disabled
    @Test
    void fivehundred_should_give_D() {
        assertEquals(numeralToRoman.getRoman(500), "D");
    }


    @Disabled
    @Test
    void thousand_should_give_M() {
        assertEquals(numeralToRoman.getRoman(1000), "M");
    }


    @Disabled
    @Test
    void two_should_give_II() {
        assertEquals(numeralToRoman.getRoman(2), "II");
    }


    @Disabled
    @Test
    void three_should_give_III() {
        assertEquals(numeralToRoman.getRoman(3), "III");
    }


    @Disabled
    @Test
    void four_should_give_IV() {
        assertEquals(numeralToRoman.getRoman(4), "IV");
    }


    @Disabled
    @Test
    void six_should_give_VI() {
        assertEquals(numeralToRoman.getRoman(6), "VI");
    }


    @Disabled
    @Test
    void seven_should_give_VII() {
        assertEquals(numeralToRoman.getRoman(7), "VII");
    }


    @Disabled
    @Test
    void eight_should_give_VIII() {
        assertEquals(numeralToRoman.getRoman(8), "VIII");
    }


    @Disabled
    @Test
    void nine_should_give_IX() {
        assertEquals(numeralToRoman.getRoman(9), "IX");
    }

    @Disabled
    @Test
    void XI_should_give_11() {
        assertEquals(numeralToRoman.getRoman(11), "XI");
    }


    @Disabled
    @Test
    void thousandsixtysix_should_give_1066() {
        assertEquals(numeralToRoman.getRoman(1066), "MLXVI");
    }

}