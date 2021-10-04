public class MyClass {
    int x = 5;

    public static void main(String[] args){
        MyClass myObj1 = new MyClass(); // obj 1
        MyClass myObj2 = new MyClass(); // obj 2
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}