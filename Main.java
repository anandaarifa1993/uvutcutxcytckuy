
package Inheritance_BangunDatar;


public class Main {
    public static void main(String[] args) {
        System.out.println("Menghitung luas dan keliling bangun datar");
         System.out.println("==================================================");
        
        
        BangunDatar bangunDatar = new BangunDatar();
        
        
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        
       
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 29;
        
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 5;
        persegiPanjang.lebar = 2;
        
        
        Segitiga Segitiga = new Segitiga();
        Segitiga.alas = 19;
        Segitiga.tinggi = 7;
        
        
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        System.out.println();
        
        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();
        
        Segitiga.luas();
        System.out.println();
        
    }
}