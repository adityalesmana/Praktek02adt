package praktek02adt;
public class persegi {
    double alas;
    double tinggi;

    public persegi() {
        alas=3;
        tinggi=6;   
    }

    public persegi(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    
    
    void cetakInfo() {
        System.out.println("==================");
        System.out.println("alas   :"+alas);
        System.out.println("tinggi :"+tinggi);
        System.out.println("==================");
    }
    
    double hitungKeliling() {
        double keliling;
        keliling=alas*tinggi;
        return keliling;
    }
    
    
}
