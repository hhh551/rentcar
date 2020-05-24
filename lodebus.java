package rentcars;

public class lodebus{
    private int num;
    private String name;
    private int cost;
    private int lode;

    public lodebus(int num, String name, int cost, int lode) {
        this.num = num;
        this.name = name;
        this.cost = cost;
        this.lode = lode;
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

    public int getLode() {
        return lode;
    }

    public void setLode(int lode) {
        this.lode = lode;
    }
}
