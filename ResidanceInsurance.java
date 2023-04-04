package Sigorta;

public class ResidanceInsurance extends Insurance{
    public ResidanceInsurance(double price){
        super(price);
    }
    @Override
    public double calculate() {
        return (this.getPrice() * 0.30);
    }
}
