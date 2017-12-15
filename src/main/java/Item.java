public abstract class Item implements ISell {

    String item;
    double buyPrice;
    double sellPrice;

    public String getItem() {
        return item;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup(){
        double markup = (sellPrice - buyPrice);
        double rate = (markup / buyPrice);
        double percentage = (rate * 100);
        return percentage;
    }

    public double moneyDifference(){
        double markup = (sellPrice - buyPrice);
        return markup;
    }

}
