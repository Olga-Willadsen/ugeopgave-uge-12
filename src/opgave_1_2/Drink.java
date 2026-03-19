package opgave_1_2;

public class Drink {

    private String name;
    private double price;

    Drink(String name, double price){
        this.name=name;
        this.price=price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice (double newPrice){
        try {
            if (newPrice <= 0) {
                this.price=price;
                throw new IllegalArgumentException();
            } else {this.price=newPrice;
            }
        }catch(IllegalArgumentException i){
            System.out.println("prisene er for lav");
        }
    }

    public void setPrice2 (double newPrice){
            if (newPrice <= 0) {
                this.price=price;
                throw new IllegalArgumentException("pris skal være højere end nul");
            }
        this.price=newPrice;
    }



}
