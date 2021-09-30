public class Latsoal6{
    public static void main(String[] args){

        // Operator Logika --> operas yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, negasi

        boolean a,b,c;

        // OR / atau (||)

        System.out.println("==== OR (||) =====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        
        
        // DAN / atau (&&)

        System.out.println("==== DAN (&&) =====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        
        // XOR / atau (^)

        System.out.println("==== XOR(^) =====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        // NOT / negasi --> flipping (!)
        System.out.println("==== Negasi (!) =====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " +c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " +c);
    }
}