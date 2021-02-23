public class Ring implements Kuju {

    private int raadius;
    private int pikkus;
    private String hex;

    public Ring(int raadius, int pikkus, String hex) {
        this.raadius = raadius;
        this.pikkus = pikkus;
        this.hex = hex;
    }

    public double pindala() {
        if (raadius < 0) throw new RuntimeException();
        return Math.PI * raadius * raadius;
    }

    public double ümbermõõt() {
        if (raadius < 0) throw new RuntimeException();
        return Math.PI * 2 * raadius;
    }
}
