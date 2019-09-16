package necklace;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.setOwner_name("Sarah");
        //System.out.println(store.getOwner_name());
        store.setName("Sarah's Store");
        //System.out.println(store.getName());
        //System.out.println(store.getId(0));
        //System.out.println(store.getProductName(0));
        store.sell(new int[] {7});
        store.listItems();
    }
}
