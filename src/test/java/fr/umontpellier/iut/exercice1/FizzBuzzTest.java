package fr.umontpellier.iut.exercice1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Ignore
    @Test
    public void test_one_should_print_one() {
        String result = fizzBuzz.getValue(1);
        Assert.assertEquals(result,"1");
    }

    @Ignore
    @Test
    public void test_two_should_print_two() {
        String result = fizzBuzz.getValue(2);
        Assert.assertEquals(result,"2");
    }

    @Ignore
    @Test
    public void test_three_should_print_fizz() {
        String result = fizzBuzz.getValue(3);
        Assert.assertEquals(result,"Fizz");
    }

    @Ignore
    @Test
    public void test_four_should_print_four() {
        String result = fizzBuzz.getValue(4);
        Assert.assertEquals(result,"4");
    }

    @Ignore
    @Test
    public void test_five_should_print_five() {
        String result = fizzBuzz.getValue(5);
        Assert.assertEquals(result,"Buzz");
    }

    @Ignore
    @Test
    public void test_six_should_print_buzz() {
        String result = fizzBuzz.getValue(6);
        Assert.assertEquals(result,"Fizz");
    }

    @Ignore
    @Test
    public void test_nine_should_print_buzz() {
        String result = fizzBuzz.getValue(9);
        Assert.assertEquals(result,"Fizz");
    }

    @Ignore
    @Test
    public void test_ten_should_print_fizz() {
        String result = fizzBuzz.getValue(10);
        Assert.assertEquals(result,"Buzz");
    }

    @Ignore
    @Test
    public void test_twelve_should_print_fizz() {
        String result = fizzBuzz.getValue(12);
        Assert.assertEquals(result,"Fizz");
    }

    @Ignore
    @Test
    public void test_fifteen_should_print_fizzbuzz() {
        String result = fizzBuzz.getValue(15);
        Assert.assertEquals(result,"FizzBuzz");
    }

    @Ignore
    @Test
    public void test_getList_Should_Return_a_sequence_of_5_FizzBuzz_elements_when_5() {
        String[] result = fizzBuzz.computeList(5);
        Assert.assertEquals(result[0],"Fizz");
        Assert.assertEquals(result[1],"2");
        Assert.assertEquals(result[2],"Fizz");
        Assert.assertEquals(result[3],"4");
        Assert.assertEquals(result[4],"Buzz");
    }
}