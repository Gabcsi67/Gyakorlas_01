package Gyakorlas_Store;

public class StoreMain {
    public static void main(String[] args) {
        Store probaStore = new Store("Körte");
        System.out.println(probaStore.getStock());
        System.out.println(probaStore.store(5));
        System.out.println(probaStore.getStock());
        System.out.println(probaStore.dispatch(3));
        System.out.println(probaStore.getProduct());
    }
}
