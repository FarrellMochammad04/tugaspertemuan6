class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return alas + tinggi + sisi;
    }

    public void setAlas(double alasBaru) {
        this.alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }
}

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        Segitiga segitiga3 = new Segitiga(20, 30, 60);

        System.out.println("Segitiga 1:");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());

        System.out.println("\nSegitiga 2:");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());

        System.out.println("\nSegitiga 3:");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}
