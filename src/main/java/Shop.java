import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public int stockCount(){
        return stock.size();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }

    public double calculateTotalProfit() {
        double var = 0;
        for (ISell item : stock) {
            var += item.moneyDifference();
        }
        return var;
    }

}
