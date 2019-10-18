package sk.itsovy.ganoczi.fragment;

public class Rectangle {

    private int a;
    private int b;
    private char character;
    private boolean fill;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        character='#';
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public int calcArea(){
        return a * b;
    }

    public int calcPerimeter(){
        return 2*a+2*b;
    }

    public double calcDiagonale(){
        return Math.sqrt(a*a+b*b);
    }

    public void showRectangle(){
        System.out.println();
        int x=0;
        int y=0;

        for (y=1; y<=b; y++) {
            for (x=1; x<=a; x++) {
                if(y==1 || b==y || x==1 || a==x){
                    System.out.print(character);
                } else if(fill){
                    System.out.print(character);
                }
                else {
                    System.out.print(' ');
                }


            }System.out.println();

        }

    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "Rectangle: a= " + a + ", b= " +b;
    }

}

