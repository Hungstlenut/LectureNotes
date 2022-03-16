public class Step9 {
    //polymorphism
    //side note, seems like Java can only have one public class in its file?
}
class Bird {
    public void sing() {
        System.out.println("tweet tweet");
    }
}

class Robin extends Bird{ //now Robin also knows how to sing like Bird, but it has also its own method...
    public void sing() {
        System.out.println("twidledee!");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Robin r = new Robin();
        r.sing(); //so which will Java choose above?
        //it will choose the super classes method, and this is polymorphism
        /*
        if you pass in parameters in the sing method under Robin, then you would have to do the same when
        calling it. It has to be the same, otherwise Java will recall sing() from Bird.
         */
    }
}