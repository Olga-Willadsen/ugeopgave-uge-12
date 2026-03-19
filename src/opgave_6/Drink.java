package opgave_6;

public class Drink {

    private String name;
    private int price;
    private int soldNumber;

    Drink (String name, int price, int soldNumber){
        this.name=name;
        this.price=price;
        this.soldNumber=soldNumber;
    }

    Drink(){

    }


    public void oneSold(){
        soldNumber++;
    }

    public void setSoldNumber(int soldNumber){
        if (soldNumber>=0){
            this.soldNumber=soldNumber;
        }else {
            System.out.println("du kan ikke have solgt færre end 0");
        }
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return this.price;
    }


    public int getSoldNumber(){
        return this.soldNumber;
    }

    @Override
    public String toString(){
        return name+", "+price+", "+soldNumber;

    }






}
