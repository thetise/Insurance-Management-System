package Sigorta;

public class CarInsurance extends Insurance{
    public CarInsurance(double price){
        super(price);
    }

    @Override
    public double calculate(){
        return (this.getPrice() * 0.15);
    }
}
