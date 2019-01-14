package fr.umontpellier.iut.exercice2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RomanToNumeralTest {
    private RomanToNumeral romanToNumeral = new RomanToNumeral();

    @Disabled
    @Test
    public void One() {
        assertEquals(romanToNumeral.getNumeral("I"), 1);
    }

    @Disabled
    @Test
    public void Two() {
        assertEquals(romanToNumeral.getNumeral("II"), 2);
    }

    @Disabled
    @Test
    public void Three() {
        assertEquals(romanToNumeral.getNumeral("III"), 3);
    }

    @Disabled
    @Test
    public void Four() {
        assertEquals(romanToNumeral.getNumeral("IV"), 4);
    }

    @Disabled
    @Test
    public void Five() {
        assertEquals(romanToNumeral.getNumeral("V"), 5);
    }

    @Disabled
    @Test
    public void Six() {
        assertEquals(romanToNumeral.getNumeral("VI"), 6);
    }

    @Disabled
    @Test
    public void Seven() {
        assertEquals(romanToNumeral.getNumeral("VII"), 7);
    }

    @Disabled
    @Test
    public void Eight() {
        assertEquals(romanToNumeral.getNumeral("VIII"), 8);
    }

    @Disabled
    @Test
    public void Nine() {
        assertEquals(romanToNumeral.getNumeral("IX"), 9);
    }

    @Disabled
    @Test
    public void Ten() {
        assertEquals(romanToNumeral.getNumeral("X"), 10);
    }

    @Disabled
    @Test
    public void Eleven() {
        assertEquals(romanToNumeral.getNumeral("XI"), 11);
    }

    @Disabled
    @Test
    public void Forty() {
        assertEquals(romanToNumeral.getNumeral("XL"), 40);
    }

    @Disabled
    @Test
    public void Fifty() {
        assertEquals(romanToNumeral.getNumeral("L"), 50);
    }

    @Disabled
    @Test
    public void Ninety() {
        assertEquals(romanToNumeral.getNumeral("XC"), 90);
    }

    @Disabled
    @Test
    public void Hundred() {
        assertEquals(romanToNumeral.getNumeral("C"), 100);
    }

    @Disabled
    @Test
    public void FourHundred() {
        assertEquals(romanToNumeral.getNumeral("CD"), 400);
    }

    @Disabled
    @Test
    public void FiveHundred() {
        assertEquals(romanToNumeral.getNumeral("D"), 500);
    }

    @Disabled
    @Test
    public void NineHundred() {
        assertEquals(romanToNumeral.getNumeral("CM"), 900);
    }

    @Disabled
    @Test
    public void Thousand() {
        assertEquals(romanToNumeral.getNumeral("M"), 1000);
    }

    @Disabled
    @Test
    public void AllNumbersToOneThousand() {
        String[] values = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
                "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII",
                "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI",
                "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV",
                "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII",
                "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII",
                "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX",
                "C", "CI", "CII", "CIII", "CIV", "CV", "CVI", "CVII", "CVIII", "CIX", "CX", "CXI", "CXII", "CXIII",
                "CXIV", "CXV", "CXVI", "CXVII", "CXVIII", "CXIX", "CXX", "CXXI", "CXXII", "CXXIII", "CXXIV", "CXXV",
                "CXXVI", "CXXVII", "CXXVIII", "CXXIX", "CXXX", "CXXXI", "CXXXII", "CXXXIII", "CXXXIV", "CXXXV",
                "CXXXVI", "CXXXVII", "CXXXVIII", "CXXXIX", "CXL", "CXLI", "CXLII", "CXLIII", "CXLIV", "CXLV", "CXLVI",
                "CXLVII", "CXLVIII", "CXLIX", "CL", "CLI", "CLII", "CLIII", "CLIV", "CLV", "CLVI", "CLVII", "CLVIII",
                "CLIX", "CLX", "CLXI", "CLXII", "CLXIII", "CLXIV", "CLXV", "CLXVI", "CLXVII", "CLXVIII", "CLXIX",
                "CLXX", "CLXXI", "CLXXII", "CLXXIII", "CLXXIV", "CLXXV", "CLXXVI", "CLXXVII", "CLXXVIII", "CLXXIX",
                "CLXXX", "CLXXXI", "CLXXXII", "CLXXXIII", "CLXXXIV", "CLXXXV", "CLXXXVI", "CLXXXVII", "CLXXXVIII",
                "CLXXXIX", "CXC", "CXCI", "CXCII", "CXCIII", "CXCIV", "CXCV", "CXCVI", "CXCVII", "CXCVIII", "CXCIX",
                "CC", "CCI", "CCII", "CCIII", "CCIV", "CCV", "CCVI", "CCVII", "CCVIII", "CCIX", "CCX", "CCXI", "CCXII",
                "CCXIII", "CCXIV", "CCXV", "CCXVI", "CCXVII", "CCXVIII", "CCXIX", "CCXX", "CCXXI", "CCXXII", "CCXXIII",
                "CCXXIV", "CCXXV", "CCXXVI", "CCXXVII", "CCXXVIII", "CCXXIX", "CCXXX", "CCXXXI", "CCXXXII", "CCXXXIII",
                "CCXXXIV", "CCXXXV", "CCXXXVI", "CCXXXVII", "CCXXXVIII", "CCXXXIX", "CCXL", "CCXLI", "CCXLII",
                "CCXLIII", "CCXLIV", "CCXLV", "CCXLVI", "CCXLVII", "CCXLVIII", "CCXLIX", "CCL", "CCLI", "CCLII",
                "CCLIII", "CCLIV", "CCLV", "CCLVI", "CCLVII", "CCLVIII", "CCLIX", "CCLX", "CCLXI", "CCLXII", "CCLXIII",
                "CCLXIV", "CCLXV", "CCLXVI", "CCLXVII", "CCLXVIII", "CCLXIX", "CCLXX", "CCLXXI", "CCLXXII", "CCLXXIII",
                "CCLXXIV", "CCLXXV", "CCLXXVI", "CCLXXVII", "CCLXXVIII", "CCLXXIX", "CCLXXX", "CCLXXXI", "CCLXXXII",
                "CCLXXXIII", "CCLXXXIV", "CCLXXXV", "CCLXXXVI", "CCLXXXVII", "CCLXXXVIII", "CCLXXXIX", "CCXC", "CCXCI",
                "CCXCII", "CCXCIII", "CCXCIV", "CCXCV", "CCXCVI", "CCXCVII", "CCXCVIII", "CCXCIX", "CCC", "CCCI",
                "CCCII", "CCCIII", "CCCIV", "CCCV", "CCCVI", "CCCVII", "CCCVIII", "CCCIX", "CCCX", "CCCXI", "CCCXII",
                "CCCXIII", "CCCXIV", "CCCXV", "CCCXVI", "CCCXVII", "CCCXVIII", "CCCXIX", "CCCXX", "CCCXXI", "CCCXXII",
                "CCCXXIII", "CCCXXIV", "CCCXXV", "CCCXXVI", "CCCXXVII", "CCCXXVIII", "CCCXXIX", "CCCXXX", "CCCXXXI",
                "CCCXXXII", "CCCXXXIII", "CCCXXXIV", "CCCXXXV", "CCCXXXVI", "CCCXXXVII", "CCCXXXVIII", "CCCXXXIX",
                "CCCXL", "CCCXLI", "CCCXLII", "CCCXLIII", "CCCXLIV", "CCCXLV", "CCCXLVI", "CCCXLVII", "CCCXLVIII",
                "CCCXLIX", "CCCL", "CCCLI", "CCCLII", "CCCLIII", "CCCLIV", "CCCLV", "CCCLVI", "CCCLVII", "CCCLVIII",
                "CCCLIX", "CCCLX", "CCCLXI", "CCCLXII", "CCCLXIII", "CCCLXIV", "CCCLXV", "CCCLXVI", "CCCLXVII",
                "CCCLXVIII", "CCCLXIX", "CCCLXX", "CCCLXXI", "CCCLXXII", "CCCLXXIII", "CCCLXXIV", "CCCLXXV", "CCCLXXVI",
                "CCCLXXVII", "CCCLXXVIII", "CCCLXXIX", "CCCLXXX", "CCCLXXXI", "CCCLXXXII", "CCCLXXXIII", "CCCLXXXIV",
                "CCCLXXXV", "CCCLXXXVI", "CCCLXXXVII", "CCCLXXXVIII", "CCCLXXXIX", "CCCXC", "CCCXCI", "CCCXCII",
                "CCCXCIII", "CCCXCIV", "CCCXCV", "CCCXCVI", "CCCXCVII", "CCCXCVIII", "CCCXCIX", "CD", "CDI", "CDII",
                "CDIII", "CDIV", "CDV", "CDVI", "CDVII", "CDVIII", "CDIX", "CDX", "CDXI", "CDXII", "CDXIII", "CDXIV",
                "CDXV", "CDXVI", "CDXVII", "CDXVIII", "CDXIX", "CDXX", "CDXXI", "CDXXII", "CDXXIII", "CDXXIV", "CDXXV",
                "CDXXVI", "CDXXVII", "CDXXVIII", "CDXXIX", "CDXXX", "CDXXXI", "CDXXXII", "CDXXXIII", "CDXXXIV",
                "CDXXXV", "CDXXXVI", "CDXXXVII", "CDXXXVIII", "CDXXXIX", "CDXL", "CDXLI", "CDXLII", "CDXLIII", "CDXLIV",
                "CDXLV", "CDXLVI", "CDXLVII", "CDXLVIII", "CDXLIX", "CDL", "CDLI", "CDLII", "CDLIII", "CDLIV", "CDLV",
                "CDLVI", "CDLVII", "CDLVIII", "CDLIX", "CDLX", "CDLXI", "CDLXII", "CDLXIII", "CDLXIV", "CDLXV",
                "CDLXVI", "CDLXVII", "CDLXVIII", "CDLXIX", "CDLXX", "CDLXXI", "CDLXXII", "CDLXXIII", "CDLXXIV",
                "CDLXXV", "CDLXXVI", "CDLXXVII", "CDLXXVIII", "CDLXXIX", "CDLXXX", "CDLXXXI", "CDLXXXII", "CDLXXXIII",
                "CDLXXXIV", "CDLXXXV", "CDLXXXVI", "CDLXXXVII", "CDLXXXVIII", "CDLXXXIX", "CDXC", "CDXCI", "CDXCII",
                "CDXCIII", "CDXCIV", "CDXCV", "CDXCVI", "CDXCVII", "CDXCVIII", "CDXCIX", "D", "DI", "DII", "DIII",
                "DIV", "DV", "DVI", "DVII", "DVIII", "DIX", "DX", "DXI", "DXII", "DXIII", "DXIV", "DXV", "DXVI",
                "DXVII", "DXVIII", "DXIX", "DXX", "DXXI", "DXXII", "DXXIII", "DXXIV", "DXXV", "DXXVI", "DXXVII",
                "DXXVIII", "DXXIX", "DXXX", "DXXXI", "DXXXII", "DXXXIII", "DXXXIV", "DXXXV", "DXXXVI", "DXXXVII",
                "DXXXVIII", "DXXXIX", "DXL", "DXLI", "DXLII", "DXLIII", "DXLIV", "DXLV", "DXLVI", "DXLVII", "DXLVIII",
                "DXLIX", "DL", "DLI", "DLII", "DLIII", "DLIV", "DLV", "DLVI", "DLVII", "DLVIII", "DLIX", "DLX", "DLXI",
                "DLXII", "DLXIII", "DLXIV", "DLXV", "DLXVI", "DLXVII", "DLXVIII", "DLXIX", "DLXX", "DLXXI", "DLXXII",
                "DLXXIII", "DLXXIV", "DLXXV", "DLXXVI", "DLXXVII", "DLXXVIII", "DLXXIX", "DLXXX", "DLXXXI", "DLXXXII",
                "DLXXXIII", "DLXXXIV", "DLXXXV", "DLXXXVI", "DLXXXVII", "DLXXXVIII", "DLXXXIX", "DXC", "DXCI", "DXCII",
                "DXCIII", "DXCIV", "DXCV", "DXCVI", "DXCVII", "DXCVIII", "DXCIX", "DC", "DCI", "DCII", "DCIII", "DCIV",
                "DCV", "DCVI", "DCVII", "DCVIII", "DCIX", "DCX", "DCXI", "DCXII", "DCXIII", "DCXIV", "DCXV", "DCXVI",
                "DCXVII", "DCXVIII", "DCXIX", "DCXX", "DCXXI", "DCXXII", "DCXXIII", "DCXXIV", "DCXXV", "DCXXVI",
                "DCXXVII", "DCXXVIII", "DCXXIX", "DCXXX", "DCXXXI", "DCXXXII", "DCXXXIII", "DCXXXIV", "DCXXXV",
                "DCXXXVI", "DCXXXVII", "DCXXXVIII", "DCXXXIX", "DCXL", "DCXLI", "DCXLII", "DCXLIII", "DCXLIV", "DCXLV",
                "DCXLVI", "DCXLVII", "DCXLVIII", "DCXLIX", "DCL", "DCLI", "DCLII", "DCLIII", "DCLIV", "DCLV", "DCLVI",
                "DCLVII", "DCLVIII", "DCLIX", "DCLX", "DCLXI", "DCLXII", "DCLXIII", "DCLXIV", "DCLXV", "DCLXVI",
                "DCLXVII", "DCLXVIII", "DCLXIX", "DCLXX", "DCLXXI", "DCLXXII", "DCLXXIII", "DCLXXIV", "DCLXXV",
                "DCLXXVI", "DCLXXVII", "DCLXXVIII", "DCLXXIX", "DCLXXX", "DCLXXXI", "DCLXXXII", "DCLXXXIII", "DCLXXXIV",
                "DCLXXXV", "DCLXXXVI", "DCLXXXVII", "DCLXXXVIII", "DCLXXXIX", "DCXC", "DCXCI", "DCXCII", "DCXCIII",
                "DCXCIV", "DCXCV", "DCXCVI", "DCXCVII", "DCXCVIII", "DCXCIX", "DCC", "DCCI", "DCCII", "DCCIII", "DCCIV",
                "DCCV", "DCCVI", "DCCVII", "DCCVIII", "DCCIX", "DCCX", "DCCXI", "DCCXII", "DCCXIII", "DCCXIV", "DCCXV",
                "DCCXVI", "DCCXVII", "DCCXVIII", "DCCXIX", "DCCXX", "DCCXXI", "DCCXXII", "DCCXXIII", "DCCXXIV",
                "DCCXXV", "DCCXXVI", "DCCXXVII", "DCCXXVIII", "DCCXXIX", "DCCXXX", "DCCXXXI", "DCCXXXII", "DCCXXXIII",
                "DCCXXXIV", "DCCXXXV", "DCCXXXVI", "DCCXXXVII", "DCCXXXVIII", "DCCXXXIX", "DCCXL", "DCCXLI", "DCCXLII",
                "DCCXLIII", "DCCXLIV", "DCCXLV", "DCCXLVI", "DCCXLVII", "DCCXLVIII", "DCCXLIX", "DCCL", "DCCLI",
                "DCCLII", "DCCLIII", "DCCLIV", "DCCLV", "DCCLVI", "DCCLVII", "DCCLVIII", "DCCLIX", "DCCLX", "DCCLXI",
                "DCCLXII", "DCCLXIII", "DCCLXIV", "DCCLXV", "DCCLXVI", "DCCLXVII", "DCCLXVIII", "DCCLXIX", "DCCLXX",
                "DCCLXXI", "DCCLXXII", "DCCLXXIII", "DCCLXXIV", "DCCLXXV", "DCCLXXVI", "DCCLXXVII", "DCCLXXVIII",
                "DCCLXXIX", "DCCLXXX", "DCCLXXXI", "DCCLXXXII", "DCCLXXXIII", "DCCLXXXIV", "DCCLXXXV", "DCCLXXXVI",
                "DCCLXXXVII", "DCCLXXXVIII", "DCCLXXXIX", "DCCXC", "DCCXCI", "DCCXCII", "DCCXCIII", "DCCXCIV", "DCCXCV",
                "DCCXCVI", "DCCXCVII", "DCCXCVIII", "DCCXCIX", "DCCC", "DCCCI", "DCCCII", "DCCCIII", "DCCCIV", "DCCCV",
                "DCCCVI", "DCCCVII", "DCCCVIII", "DCCCIX", "DCCCX", "DCCCXI", "DCCCXII", "DCCCXIII", "DCCCXIV",
                "DCCCXV", "DCCCXVI", "DCCCXVII", "DCCCXVIII", "DCCCXIX", "DCCCXX", "DCCCXXI", "DCCCXXII", "DCCCXXIII",
                "DCCCXXIV", "DCCCXXV", "DCCCXXVI", "DCCCXXVII", "DCCCXXVIII", "DCCCXXIX", "DCCCXXX", "DCCCXXXI",
                "DCCCXXXII", "DCCCXXXIII", "DCCCXXXIV", "DCCCXXXV", "DCCCXXXVI", "DCCCXXXVII", "DCCCXXXVIII",
                "DCCCXXXIX", "DCCCXL", "DCCCXLI", "DCCCXLII", "DCCCXLIII", "DCCCXLIV", "DCCCXLV", "DCCCXLVI",
                "DCCCXLVII", "DCCCXLVIII", "DCCCXLIX", "DCCCL", "DCCCLI", "DCCCLII", "DCCCLIII", "DCCCLIV", "DCCCLV",
                "DCCCLVI", "DCCCLVII", "DCCCLVIII", "DCCCLIX", "DCCCLX", "DCCCLXI", "DCCCLXII", "DCCCLXIII", "DCCCLXIV",
                "DCCCLXV", "DCCCLXVI", "DCCCLXVII", "DCCCLXVIII", "DCCCLXIX", "DCCCLXX", "DCCCLXXI", "DCCCLXXII",
                "DCCCLXXIII", "DCCCLXXIV", "DCCCLXXV", "DCCCLXXVI", "DCCCLXXVII", "DCCCLXXVIII", "DCCCLXXIX",
                "DCCCLXXX", "DCCCLXXXI", "DCCCLXXXII", "DCCCLXXXIII", "DCCCLXXXIV", "DCCCLXXXV", "DCCCLXXXVI",
                "DCCCLXXXVII", "DCCCLXXXVIII", "DCCCLXXXIX", "DCCCXC", "DCCCXCI", "DCCCXCII", "DCCCXCIII", "DCCCXCIV",
                "DCCCXCV", "DCCCXCVI", "DCCCXCVII", "DCCCXCVIII", "DCCCXCIX", "CM", "CMI", "CMII", "CMIII", "CMIV",
                "CMV", "CMVI", "CMVII", "CMVIII", "CMIX", "CMX", "CMXI", "CMXII", "CMXIII", "CMXIV", "CMXV", "CMXVI",
                "CMXVII", "CMXVIII", "CMXIX", "CMXX", "CMXXI", "CMXXII", "CMXXIII", "CMXXIV", "CMXXV", "CMXXVI",
                "CMXXVII", "CMXXVIII", "CMXXIX", "CMXXX", "CMXXXI", "CMXXXII", "CMXXXIII", "CMXXXIV", "CMXXXV",
                "CMXXXVI", "CMXXXVII", "CMXXXVIII", "CMXXXIX", "CMXL", "CMXLI", "CMXLII", "CMXLIII", "CMXLIV", "CMXLV",
                "CMXLVI", "CMXLVII", "CMXLVIII", "CMXLIX", "CML", "CMLI", "CMLII", "CMLIII", "CMLIV", "CMLV", "CMLVI",
                "CMLVII", "CMLVIII", "CMLIX", "CMLX", "CMLXI", "CMLXII", "CMLXIII", "CMLXIV", "CMLXV", "CMLXVI",
                "CMLXVII", "CMLXVIII", "CMLXIX", "CMLXX", "CMLXXI", "CMLXXII", "CMLXXIII", "CMLXXIV", "CMLXXV",
                "CMLXXVI", "CMLXXVII", "CMLXXVIII", "CMLXXIX", "CMLXXX", "CMLXXXI", "CMLXXXII", "CMLXXXIII", "CMLXXXIV",
                "CMLXXXV", "CMLXXXVI", "CMLXXXVII", "CMLXXXVIII", "CMLXXXIX", "CMXC", "CMXCI", "CMXCII", "CMXCIII",
                "CMXCIV", "CMXCV", "CMXCVI", "CMXCVII", "CMXCVIII", "CMXCIX", "M"};
        for (int i = 0; i < 1000; i++) {
            assertEquals(romanToNumeral.getNumeral(values[i]), i + 1);
        }
    }
}
