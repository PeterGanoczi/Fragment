package sk.itsovy.ganoczi.fragment;


public class Main {

    public static void main(String[] args) {

        Fragment f1=new Fragment(32,48);
        System.out.println(f1.toString());
        f1.changeToBasicShape();
        System.out.println(f1.toString());
        f1.extendFragment(-5);
        System.out.println(f1.toString());
        System.out.println();

        Fragment zlomok=new Fragment(7,28);
        zlomok.changeToBasicShape();
        System.out.println(zlomok.toString());
        Fragment f2=zlomok.Copy();
        MixedNumber mixnum=new MixedNumber(4,2,7);
        System.out.println(mixnum.getRealValue());

        System.out.println("");
        MyMath newmath= new MyMath();

        Fragment a=new Fragment(9,3);
        Fragment b=new Fragment(3,5);
        System.out.println("Zlomok A:" + a + " Zlomok B:" +b);
        System.out.println("Scitanie zlomkov " + newmath.add(a, b));
        System.out.println("Odcitanie zlomkov " +newmath.sub(a, b));
        System.out.println("Nasobenie zlomkov " +newmath.mul(a, b));
        System.out.println("Delenie zlomkov " +newmath.div(a,b));

        Rectangle rect=new Rectangle(12,5);
        System.out.println("Diagonale: " + rect.calcDiagonale());
        rect.print();
        rect.setCharacter('$');
        rect.setFill(true);
        rect.showRectangle();
        rect.setFill(false);
        rect.showRectangle();

        Bank tatra=new Bank("tatra");

        tatra.convert(100,"HUF");

        System.out.println(tatra.loan(1000,4.5,10));





    }
}
