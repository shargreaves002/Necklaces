package necklace;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.setOwner_name("Sarah");
        System.out.println(store.getOwner_name());
        store.setName("Sarah's Store");
        System.out.println(store.getName());
        System.out.println(store.getDate(3));
        System.out.println(store.getPrice(8));
        store.sell(new int[] {6, 7, 8});
        store.restock();
        System.out.println(store.getProductName(6));
    }
}
