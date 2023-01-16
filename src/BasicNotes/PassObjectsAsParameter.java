package BasicNotes;

class Student{
    String name = "Levi";
    int age = 28;

    public Student(){
        //just an empty constructor
    }

    public void introduction(){
        System.out.println("My name is " + this.name + " and I am " + age + " years old");
    }
}

public class PassObjectsAsParameter {
    //passing in Student class as the parameter type, so that s can reference an object from that class
    public void printStudent(Student s){
        //since s is of class Student, it can get the attributes of that class
        System.out.println("His name is " + s.name + " and is " + s.age + " years old" );
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.introduction();

        //printStudent method is not static, therefore:
        PassObjectsAsParameter m = new PassObjectsAsParameter();
        /*
        passing in the object student as an argument, gives us the attributes inside the class.
        Then, when we use the method printStudent above, it will find those attributes!
         */
        m.printStudent(student);




    }
}


