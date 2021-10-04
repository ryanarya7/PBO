public class Person {
    String fname = "Jono";
    String lname = "Joni";
    int age = 17;

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println("name : " + myObj.fname + " " + myObj.lname);
        System.out.println("age: " + myObj.age);
    }
}
