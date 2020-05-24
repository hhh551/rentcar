package rentcars;

public class truck {
    private int num;
    private String name;
    private int cost;
    private double lode2;

    public truck(int num, String name, int cost, double lode) {
        this.num = num;
        this.name = name;
        this.cost = cost;
        this.lode2 = lode;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getLode() {
        return lode2;
    }

    public void setLode(int lode) {
        this.lode2 = lode;
    }
}
