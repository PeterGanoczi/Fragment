package sk.itsovy.ganoczi.fragment;

import java.util.Random;

public class MyMath {

    public Fragment add(Fragment a, Fragment b) {

        int numerator;
        int denominator;
       /* a=new Fragment(2,5);
        b=new Fragment(5,4);*/

        numerator = (b.getDenominator() * a.getNumerator()) + (a.getDenominator() * b.getNumerator());
        denominator = (a.getDenominator() * b.getDenominator());

        Fragment result = new Fragment(numerator, denominator);

        return result;
    }

    public Fragment sub(Fragment a, Fragment b) {
        Fragment result = null;
        result = new Fragment((b.getDenominator() * a.getNumerator()) - (a.getDenominator() * b.getNumerator()),
                a.getDenominator() * b.getDenominator());

        return result;
    }

    public Fragment mul(Fragment a, Fragment b) {
        Fragment result = null;

        result = new Fragment(a.getNumerator() * b.getNumerator(), a.getDenominator() * b.getDenominator());

        return result;

    }

    public static Fragment div(Fragment a, Fragment b) {
        Fragment result = null;

        result = new Fragment(a.getNumerator() * b.getDenominator(), a.getDenominator() * b.getNumerator());
        result.changeToBasicShape();
        return result;

    }

    public Fragment add(int value, Fragment b) {
        Fragment temp = new Fragment(value, 1);
        return add(temp, b);
    }

    public int reverseNumber(int number) { //vrati obratene cislo napr 354 zmeni na 453 ale 350 na 53 vynecha nulu, neviem kolko ciferne je cislo

        int temp;
        int num = 0;
        while (number != 0) {

            temp = number % 10;
            number /= 10;
            num = num * 10 + temp;
        }
        return num;
    }

    public static int random4() {
        Random random = new Random();
        int rand = 0;
        int x = 0;
        do {
            rand = random.nextInt(9000) + 1000;

            int a = rand % 10;
            int b = (rand / 10) % 10;
            int c = (rand / 100) % 10;
            int d = (rand / 1000) % 10;

            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                x = 0;
            } else {
                x = 1;
            }
        } while (x == 0);
        return rand;
    }



}
