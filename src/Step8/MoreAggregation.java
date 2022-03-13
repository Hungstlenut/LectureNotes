package Step8;
//use of toString method and more aggregation
//one can not print out an object, you will only print out a memory location.
class Address
{
    int streetNum;
    String city;
    String state;
    String country;
    Address(int street, String c, String st, String coun)
    {
        this.streetNum=street;
        this.city =c;
        this.state = st;
        this.country = coun;
    }

    static Address NXH = new Address(4, "Rasta", "Lørenskog", "Norway");

    public String toString() {
        return streetNum + "," + city + "," + state + "," + country;
    }
}

class StudentClass {
    int rollNum;
    String studentName;
    //Creating HAS-A relationship with Address class
    Address studentAddr;

    StudentClass(int roll, String name, Address addr) {
        this.rollNum = roll;
        this.studentName = name;
        this.studentAddr = addr;
    }

    public String toString() {
        return rollNum + " " + studentName + " " + studentAddr;
    }

}



public class MoreAggregation {
    public static void main(String[] args) {
        StudentClass x = new StudentClass(1, "Xuan", Address.NXH);

        System.out.println(x);
    }
}

