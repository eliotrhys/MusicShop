public class Guitar extends Instrument implements IPlay{

    String material;

    public Guitar(String brand, String model, double buyPrice, double sellPrice, String material){
        this.brand = brand;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String play(){
        return "Strrummm";
    }

}
