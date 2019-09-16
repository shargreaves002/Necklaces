package necklace;

import java.util.Date;

class Necklace {
    private double price;
    private String name;
    private int item_id;
    private String date_created;

    Necklace(int price,
             String name,
             int item_id,
             String date_created) {
        this.price = price + .99;
        this.name = name;
        this.item_id = item_id;
        this.date_created = date_created;
    }

    double getPrice (){return price;}
    void setPrice(int x){price = x + .99;}

    String getName (){return name;}
    void setName(String x){name = x;}

    int getItem_id(){return item_id;}
    void setItem_id(int id){item_id = id;}

    String getDate_created(){return date_created;}
    void setDate_created (String date){date_created = date;}

    @Override
    public String toString() {
        return "Name= '" + name + '\'' +
                ", Price= $" + price +
                ", Item ID= " + item_id +
                ", Date created= " + date_created;
    }
}
