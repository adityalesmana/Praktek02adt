package praktek02adt;

public class persegiAksi {
    public static void main(String[] args) {
        persegi rl = new persegi();
        rl.alas   = 7;
        rl.tinggi = 9;
        
        rl.cetakInfo();
        System.out.println("Keliling persegi = "+rl.hitungKeliling());
        rl.cetakKeliling();
        
        persegi r2 = new persegi();
        r2.cetakInfo();
        
        persegi r3 = new persegi(40,70);
        r3.cetakInfo();
    }
}