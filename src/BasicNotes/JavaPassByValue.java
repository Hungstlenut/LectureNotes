package BasicNotes;
/*
Java is always passing by value.
When instantiating an object or variable, you are actually creating a copy that
refer to that particular object. Passing that object around and changing it, will just
change the value of that "copy".

While passing by reference means that we are modifying the underlying object or variable
permanently.
 */
public class JavaPassByValue {
    public static void main(String[] args) {
        //lets make a human
        Human human = new Human();
        //this human object is now referencing to copied value from the Human class
        //human is not the same as the variable "prvate String name = Al" below...
        human.setName("Alexandro");
        System.out.println(human);
        //thats why it "resets" the name when we create a new human object
        Human human2 = new Human();
        System.out.println(human2.getName());

    }
}

class Human {

    private String name = "Al";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(){
        System.out.println(("Default " + getName()));
    }

    public String toString(){
        return "toString: " + getName();
    }
}