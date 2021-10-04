// Create a MyClass class
public class MyClass6 {
    int x; // Create a class attribute

    // Creat a class constructor for the MyClass class
    public MyClass6(){
        x = 5; // set the initial value for the class atribute x
    }

    public static void main(String[] args) {
        MyClass6 myObj = new MyClass6(); // create an object of class MyClass (this will call the constructor)
        System.out.println(myObj.x); // print the value of x
    }
}