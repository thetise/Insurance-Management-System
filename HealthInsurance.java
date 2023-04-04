package Sigorta;

public class HealthInsurance extends Insurance{
    public HealthInsurance(double price){
        super(price);
    }

    @Override
    public double calculate() {
        return (this.getPrice() * 0.05);
    }

}
