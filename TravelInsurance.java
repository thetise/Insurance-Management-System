package Sigorta;

public class TravelInsurance extends Insurance{
    public TravelInsurance(double price){
        super(price);
    }

    @Override
    public double calculate() {
        return (this.getPrice() * 0.04);
    }
}