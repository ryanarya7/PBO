public class Latsoal3{
    public static void main(String[] args){
        // unary = operasi yang dilakukan pada satu variable
        // unary + dan -
        int angka = 1;
        System.out.printf("unary '+' %d menjadi %d\n",angka, +angka);
        System.out.printf("unary '-' %d menjadi %d\n",angka, -angka);

        // unanry decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);
        
        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi %d\n", ++a);
        int b = 5;
        System.out.printf("nilai denga '--' prefix menjadi = %d\n", --b);

        //unary boolean dengan ! untuk negasi
        boolean dodi = true;
        System.out.println("nilai boolean = " + dodi);
        System.out.println("nilai boolean = " + !dodi);
    }
}