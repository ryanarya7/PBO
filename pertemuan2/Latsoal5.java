public class Latsoal5{
    public static void main(String[] args){

        // operator komparasi
        int a,b;
        boolean hasilKomparasi;
    
        a = 11;
        b = 10;

        hasilKomparasi = (a == b);
        System.out.printf("%d ==  %d --> %s \n",a,b, hasilKomparasi);
        
        a = 10;
        b = 10;

        hasilKomparasi = (a == b);
        System.out.printf("%d ==  %d --> %s \n",a,b, hasilKomparasi);

        // operator not equal atau pertidaksamaan
        
        a = 10;
        b = 10;

        hasilKomparasi = (a != b);
        System.out.printf("%d !=  %d --> %s \n",a,b, hasilKomparasi);
        
        a = 11;
        b = 10;

        hasilKomparasi = (a != b);
        System.out.printf("%d !=  %d --> %s \n",a,b, hasilKomparasi);

        
        // operator less than atau kurang dari
        
        a = 10;
        b = 10;

        hasilKomparasi = (a < b);
        System.out.printf("%d <  %d --> %s \n",a,b, hasilKomparasi);
        
        a = 11;
        b = 10;

        hasilKomparasi = (a < b);
        System.out.printf("%d <  %d --> %s \n",a,b, hasilKomparasi);

        // operator more than atau lebih dari
        
        a = 10;
        b = 10;

        hasilKomparasi = (a > b);
        System.out.printf("%d >  %d --> %s \n",a,b, hasilKomparasi);
        
        a = 11;
        b = 10;

        hasilKomparasi = (a > b);
        System.out.printf("%d >  %d --> %s \n",a,b, hasilKomparasi);

        // operator less than equal atau kurang dari sama dengan
        
        a = 10;
        b = 10;

        hasilKomparasi = (a <= b);
        System.out.printf("%d <=  %d --> %s \n",a,b, hasilKomparasi);
        
        a = 11;
        b = 10;

        hasilKomparasi = (a <= b);
        System.out.printf("%d <=  %d --> %s \n",a,b, hasilKomparasi);

        // operator greater than equal atau lebih dari sama dengan
        
        a = 10;
        b = 10;

        hasilKomparasi = (a >= b);
        System.out.printf("%d >=  %d --> %s \n",a,b, hasilKomparasi);
        
        a = 11;
        b = 10;

        hasilKomparasi = (a >= b);
        System.out.printf("%d >=  %d --> %s \n",a,b, hasilKomparasi);
    }
}