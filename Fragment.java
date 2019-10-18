package sk.itsovy.ganoczi.fragment;

public class Fragment {

    private int numerator;
    private int denominator;

    public Fragment(int numerator, int denominator) {
        if (denominator==0){
            denominator=1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    public void changeToBasicShape(){
        int commonDivisor= getTheLargestCommonDivisor();
        numerator=numerator/commonDivisor;
        denominator=denominator/commonDivisor;

    }

    public void extendFragment(int value){
        if (value!=0){
            numerator*=value;
            denominator*=value;

        }

    }

    public double getRealValue(){
        return (double)numerator/denominator;


    }

    public void reverse(){
        int temp=numerator;
        numerator=denominator;
        denominator=temp;
    }

    public void oposite(){
        numerator*=-1;

    }

    public Fragment Copy(){
        Fragment newFragment= new Fragment(numerator,denominator);
        return newFragment;
    }

    private int getTheLargestCommonDivisor(){
        //ak numerator je mensi ako denominator tak min sa rovna numerator inak min sa rovna denominator
        //namiesto if pouzity ternarny operator
        int absNumerator= Math.abs(numerator);
        int absDenominator= Math.abs(denominator);

        int commonDivisor=absNumerator<absDenominator?absNumerator:absDenominator;
        while(absNumerator%commonDivisor!=0 || absDenominator%commonDivisor!=0){
            commonDivisor--;
        }
        return commonDivisor;
    }

    public boolean isFragmentInBasicShape(){
        if(getTheLargestCommonDivisor()==1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return numerator+" / "+denominator;
    }

    public MixedNumber getMixedNumber(){ // zlomok 23/10 zmenime na zmiesane cislo value 23/10 = 2 ,, modulo po deleni 23 a 10 ==3, zmiesane cislo bude (2 3/10)
        int value= numerator/denominator;
        Fragment f= new Fragment(numerator%denominator, denominator);
        return new MixedNumber(value, f);

    }
}
