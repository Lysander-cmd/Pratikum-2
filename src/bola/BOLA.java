
package bola;


public class BOLA {

    //Membuat variabel dan tipe data
    private double jarijari;
    //Method void merubah deklarasi variabel jarjari awal dengan yang baru
    public BOLA(double jarijari){
        this.jarijari = jarijari;
    }
    //Method void merubah deklarasi variabel jarjari awal dengan yang baru
    public void setjarijari(double jarijari){
        this.jarijari = jarijari;
    }
    //Method void perhitungan diameter bola
    public void showdiameter(){
        System.out.println("Diameter bola :"+2*jarijari);
    }
    //Method void perhitungan luas permukaan
    public void showluaspermukaan(){
        System.out.println("Luas permukaan bola :"+(4/3*Math.PI*Math.pow(jarijari, 3)));
    }
    //Method void perhitungan volume
    public void showvolume(){
        System.out.println("Volume  bola : "+(4/3*Math.PI*Math.pow(jarijari, 2)));
    }
}
