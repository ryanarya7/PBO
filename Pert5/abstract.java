// Code from filename : Person.java
// abstract class
abstract class Person {
    public String fname = "Jono";
    public int age = 17;
    public abstract void study();
}

//subclass (inherit from Person)
class Student extends Person {
    public int graduationYear = 2018;
    public void study(){ //  the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename : Person.java

//Code from filename MyClass.java
class MyClass {
    public static void main(String[] args){
        // create an object of the Student class ( which inherits attributes from Persin)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}