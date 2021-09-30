import java.util.Scanner;

public class Latsoal9{
    public static void main(String[] args){
        
        // operasi aritmatika akan diproses dari kiri
        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokan operasi bil.
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // perhitungan pers. kuadrat
        int a,x,c;
        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient a = ");
        a = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        int y = (a * x * x) + c;
        System.out.println("nilai y = " + y);

        
    }
}