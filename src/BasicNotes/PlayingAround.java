package BasicNotes;

public class PlayingAround {

    public Integer score = 0;

    public static void main(String[] args) {

        Double rnd1 = Math.random();
        float f1 = 4.5F; //without the F Java will think it is a type double

        System.out.println(rnd1 + 1);

        System.out.println("here!!!" + randomInteger(3));

        System.out.println("We have 2 games you can play about Martial art!\n[1] Binary quiz\n[2] Multichoice quiz.");

        PlayingAround pa = new PlayingAround();

        pa.incScore();
        pa.incScore();

        System.out.println(pa.score);

    }
    public static Integer randomInteger (Integer maximum) {
        return ((int) (Math.floor(Math.random())*maximum));
    }

    public Integer incScore () {
        return this.score += 1;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
