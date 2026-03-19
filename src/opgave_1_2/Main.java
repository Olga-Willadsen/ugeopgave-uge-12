package opgave_1_2;



public class Main {

    static Ui ui = new Ui();
    static Drink cola = new Drink("cola", 45);

    static void main (String[] args) {

        //OPGAVE 1

        //System.out.println(ui.promptNumber3("indtast et tal"));

        //ville kræve et loop eller evig try/catch rundt om metodekald
//        try{
//            System.out.println(ui.promptNumber3("indtast et andet tal"));
//        } catch (NumberFormatException e) {
//            System.out.println("det er ikke et tal dummy");
//            System.out.println(ui.promptNumber3("kom nu med et tal"));
//        }


        //OPGAVE 2

        cola.setPrice(0.0);
        System.out.println("prisen på cola er: "+cola.getPrice());
        cola.setPrice(10.0);
        System.out.println("prisen på cola er: "+cola.getPrice());


        cola.setPrice2(33.0);
        System.out.println("prisen på cola er: "+cola.getPrice());

        try{
            cola.setPrice2(0.0);
        } catch (IllegalArgumentException i){
            System.out.println(i.getMessage());
        }






    }
}
