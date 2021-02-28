
package bola;


public class TestBola {
    public static void main(String[] args) {
        //Membuat variabel dan tipe data
        double jarijari=14;
        //Membuat objek dari class BOLA
        BOLA objek = new BOLA(7);
        //Memanggil berbagai method di class BOLA
        objek.showdiameter();
        objek.showluaspermukaan();
        objek.showvolume();
        System.out.println("=======================");
        objek.setjarijari(jarijari);
        objek.showdiameter();
        objek.showluaspermukaan();
        objek.showvolume();
    }
}
