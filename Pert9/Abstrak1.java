abstract class Hewan2 {
    //abstract method (Tidak memiliki body)
    public abstract void suara();
    
    //Regular method
    public void tidur() {
        System.out.println("Zzzzzz");
    }
}
class Ayam2 extends Hewan2 {
    public void suara(){
        System.out.println("Suara ayam: kuuukuruyuk");
    }
}

class Abstrak1 {
    public static void main(String[] args) {
        //membuat object Ayam2
        Ayam2 ayam = new Ayam2();
        ayam.suara();
        ayam.tidur();
    }
}