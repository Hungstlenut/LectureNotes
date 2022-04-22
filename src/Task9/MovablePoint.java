package Task9;
//Dette er en klasse som er offentlig
public class MovablePoint implements Movable{

    private double x;
    private double y;
    //en metode i klassen som er offentlig
    public MovablePoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    //denne metoden returnerer ikke en verdi tilbake til setX, fordi den er void
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void moveUp(double distance) {
        y += distance;
    }

    @Override
    public void moveDown(double distance) {
        y -= distance;
    }

    @Override
    public void moveRight(double distance) {
        x += distance;
    }

    @Override
    public void moveLeft(double distance) {
        x -= distance;
    }

    public String toString(){
        return "Point; (x=" + this.x + "; y=" + this.y +").";
    }
}
