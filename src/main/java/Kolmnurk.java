public class Kolmnurk implements Kuju {


    private double raadius;
    private double pikkus;
    private String hex;

    public Kolmnurk(double raadius, double pikkus, String hex) {
        this.raadius = raadius;
        this.pikkus = pikkus;
        this.hex = hex;
    }

    public double pindala() {
        // Heroni valem
        if (pikkus < 0) throw new RuntimeException();

        double s = (pikkus * 3) / 2;
        double vastus = Math.sqrt(s * Math.pow((s - pikkus), 3));
        return vastus;
    }

    public double ümbermõõt() {
        if (pikkus < 0) throw new RuntimeException();
        return pikkus * 3;
    }

}
