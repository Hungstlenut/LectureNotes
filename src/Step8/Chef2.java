package Step8;

public class Chef2 extends Person {
    //By using override, we can alter the method.
    @Override
    public String speak () {
        return super.speak() + " I love food";
    }

    public static void main(String[] args) {
        Chef2 chef2 = new Chef2();
        System.out.println(chef2.speak());
    }
}
