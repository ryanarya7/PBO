import java.util.*;
public class Latsoal10{
    public static Void main(String[] args){

        //membuat sebuah objek untuk menangkap input dr user
        Scanner inputUser = new Scanner(System.in);

        //sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan

        System.out.print("masukkan nilai tebakan anda: ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda: " + statusTebakan);

        // operasi aljabar boolean (and / or)
        System.out.println("masukkan nilai diantara 4 dan 9");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        System.out.println("tebakan anda: " + statusTebakan);


    }

}