package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        String s;
        if ((i % 3 == 0 ) && (i % 5 == 0)) {
            s = "FizzBuzz";
        } else if (i % 3 == 0 ) {
            s = "Fizz";
        } else if (i % 5 == 0) {
            s = "Buzz";
        } else {
            s = String.valueOf(i);
        }

        return s;

    }



    public String[] computeList(int n) {
        int i;
        String[] tab = new String[n];
        for (i = 1; i <= n; i++) {
            tab[i-1] = getValue(i);
        }
        return tab;
    }
}
