package EqualsAndHashCode;

import java.util.HashSet;

public class Hash {

    public String e;

    public Hash(){
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {
        String a = "200";
        String b = "200";


        if(a.equals(b)){
            System.out.println("Equal variables:");
            System.out.println(a.hashCode() + "\n" + b.hashCode());
        }

        String c = "10";
        String d = "50";

        if(!c.equals(d)){
            System.out.println("\nUn-equal variables:\n");
        }

        HashSet<String> h = new HashSet<>();
        h.add(a);
        h.add(b);
        h.add(c);
        h.add(d);

        System.out.println(h);

        Hash adding = new Hash();
        adding.newNumber("50");
        h.add(String.valueOf(adding));

        System.out.println(h);
    }

    public void newNumber(String num){
         this.e = num;
    }

    public String toString(){
        return e;
    }
}
