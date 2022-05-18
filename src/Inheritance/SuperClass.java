package Inheritance;

class SuperClass {
    public void display(){
        System.out.println("Hello this is the method of the superclass");
        System.out.println("------------------------------------------");
    }
    public static void main(String args[]){
        SubClass obj = new SubClass();
        obj.display();
        obj.greet();
        System.out.println("---------New calling methods--------------");
        callingSubMethod();//I can call this without instantiating an object, because the method is static.
        obj.callingSuperClassMethod();
    }

    public static void callingSubMethod() {
        new SubClass().greet();
    }
}

