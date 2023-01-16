package Task9;

import java.awt.*;

public class Test {

    public static void main(String[] args) {
        //Først må vi skape objektet fra "oppskriften" i MovablePoint...
        MovablePoint x = new MovablePoint(2.0, 1.0);
        //Deretter kan vi bruke metodene i objektet
        System.out.println(x.getX());

        x.setX(2.2);

        System.out.println(x.getX());
        //Her skriver vi ut hele metoden, der toString er essensielt...
        System.out.println(x);

        Rectangle r = new Rectangle(2.2, 4);

        System.out.println(r);


    }
}
