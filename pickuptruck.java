package rentcars;

public class pickuptruck {
    private int num;
    private String name;
    private int cost;
    private int lode1;
    private double lode2;

    public pickuptruck(int num, String name, int cost, int lode1, double lode2) {
        this.num = num;
        this.name = name;
        this.cost = cost;
        this.lode1 = lode1;
        this.lode2 = lode2;
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

    public int getLode1() {
        return lode1;
    }

    public void setLode1(int lode1) {
        this.lode1 = lode1;
    }

    public double getLode2() {
        return lode2;
    }

    public void setLode2(int lode2) {
        this.lode2 = lode2;
    }
}
