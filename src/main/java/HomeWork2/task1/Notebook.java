package HomeWork2.task1;

public class Notebook {

    private static final int maxRam = 6;
    private static final int minRam = 1;
    private static final int maxCost = 40;
    private static final int minCost = 10;
    private static final int maxBrand = 4;
    private static final int minBrand = 0;

    public int ram;
    public int cost;
    public String brand;

    public Notebook() {
        ram = randomRam();
        cost = randomCost();
        brand = randomBrand();
    }

    private int randomRam() {
        return (int) (Math.random() * ((maxRam - minRam) + 1) + minRam) * 4;
    }

    private int randomCost() {
        return (int) (Math.random() * ((maxCost - minCost) + 1) + minCost) * 50;
    }

    public String randomBrand() {
        int b = (int) (Math.random() * ((maxBrand - minBrand) + 1) + minBrand);
        switch (b) {
            case 0:
                return "Lenuvo";
            case 1:
                return "Asos";
            case 2:
                return "MacNote";
            case 3:
                return "Eser";
            default:
                return "Xamiou";
        }
    }
}
