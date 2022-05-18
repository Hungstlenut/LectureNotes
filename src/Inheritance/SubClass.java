package Inheritance;

public class SubClass extends SuperClass {
    public void greet() {
        System.out.println("Hello this is the method of the subclass");
    }
//note that this method is NOT static, so that we can call it in the super class!!
    public void callingSuperClassMethod () {
        new SuperClass().display();
    }

}
