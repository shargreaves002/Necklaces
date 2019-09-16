package necklace;
import java.util.Date;

class Store {
    private String name;
    private String owner_name;
    Necklace[] products;

    Store(){
        this.products = new Necklace[20];
        restock();
    }

    void restock(){
        int price;
        int count = 0;
        for (int i=0; i < 20; i++){
            if (products[i] == null) {
                price = (int)(Math.random() * 1000);
                int j = i + 1;
                products[i] = new Necklace(price,
                        "Necklace " + j,
                        i, new Date((long) (Math.random() * 1568661557910L)));
                count++;
            }
        }
        System.out.println(count + " Necklaces stocked.");
    }

    String getName () {return name;}
    void setName(String x) {name = x;}

    String getOwner_name() { return owner_name;}
    void setOwner_name(String x) {owner_name = x;}

    void sell(int[] x) {
        for (int id : x) {
            products[id]=null;
        }
    }

    Date getDate(int x) {
        try{
            return products[x].getDate_created();
        } catch (Exception e) {
            printError(x);
        }
        return null;
    }

    double getPrice (int x) {
        try {
            return products[x].getPrice();
        } catch (Exception e) {
            printError(x);
        }
        return 0;
    }

    String getProductName(int x) {
        try {
            return products[x].getName();
        } catch (Exception e) {
            printError(x);
        }
        return null;
    }

    int getId (int x) {
        try {
            return products[x].getItem_id();
        } catch (Exception e) {
            printError(x);
        }
        return 0;
    }

    private void printError(int x) {
        System.out.println("Item " + x + " does not exist.");
    }
}
