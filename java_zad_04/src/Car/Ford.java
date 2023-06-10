package Car;

import Car.Car;

public class Ford extends Car implements Purchase {
    private int year;
    private int manufacturedDiscount;
    @Override
    public double getSalePrice(){
    return (super.getSalePrice()-manufacturedDiscount);
    }

    @Override
    public String getPurchaseInfo() {
        return "FORD: ";
    }

    public void setYear(int i) {
        this.year = i;
    }

    public void setManufacturedDiscount(int i) {
        this.manufacturedDiscount = i;
    }
}
