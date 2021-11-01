import java.util.Scanner;

abstract class Manusia{
  public abstract String isiNama();
  public abstract int isiUmur();
}

class Pegawai extends Manusia{
  private String nama;
  private int umur, NIP;
  private Scanner inputan = new Scanner(System.in);

  @Override
  public String isiNama(){
    System.out.print("Masukkan Nama Lengkap: ");
    this.nama = inputan.nextLine();
    return this.nama;
  }
  @Override
  public int isiUmur(){
    System.out.print("Masukkan Umur: ");
    this.umur = inputan.nextInt();
    return this.umur;
  }
  public int isiNIP(){
    System.out.print("Masukkan NIP: ");
    this.NIP = inputan.nextInt();
    return this.NIP;
  }
  public void showData(){
    System.out.println("Nama : " + this.nama);
    System.out.println("Umur : " + this.umur);
    System.out.println("NIP : " + this.NIP);
  }
}

public class LatihanAbs{
  public static void main(String[] args) {
    Pegawai isi = new Pegawai();
    isi.isiNama();
    isi.isiUmur();
    isi.isiNIP();
    isi.showData();
  }
}