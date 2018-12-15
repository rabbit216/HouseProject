package demo;

public class House {
    String id;
    int prices;

    public House(String id, int prices) {
        this.id = id;
        this.prices = prices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + id + '\'' +
                ", prices=" + prices +
                '}';
    }
}
