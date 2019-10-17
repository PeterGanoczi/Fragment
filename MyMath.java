package sk.itsovy.ganoczi.fragment;

public class MyMath {

    public Fragment add(Fragment a, Fragment b){

        int numerator;
        int denominator;
       /* a=new Fragment(2,5);
        b=new Fragment(5,4);*/

       numerator= (b.getDenominator()*a.getNumerator())+ (a.getDenominator()*b.getNumerator());
       denominator=(a.getDenominator()*b.getDenominator());

        Fragment result= new Fragment(numerator, denominator);

        return result;
    }

    public Fragment sub(Fragment a, Fragment b){
        Fragment result=null;
        result= new Fragment((b.getDenominator()*a.getNumerator())-(a.getDenominator()*b.getNumerator()),
                                        a.getDenominator()*b.getDenominator());

        return result;
    }

    public Fragment mul(Fragment a, Fragment b){
        Fragment result=null;

        result=new Fragment(a.getNumerator()*b.getNumerator(), a.getDenominator()*b.getDenominator());

        return result;

    }

    public static Fragment div(Fragment a, Fragment b){
        Fragment result=null;

        result=new Fragment(a.getNumerator()*b.getDenominator(), a.getDenominator()*b.getNumerator());
        result.changeToBasicShape();
        return result;

    }

    public Fragment add(int value, Fragment b){
        Fragment temp=new Fragment(value, 1);
        return add(temp, b);
    }
}
