public class Main {
    public static void main(String[] args) {

        IteamWarehouse iteamWarehouse = new IteamWarehouse();
        Customer customer = new Customer(iteamWarehouse);

        Thread thread = new Thread(customer);
        thread.start();

        System.out.println("Main Before"+" "+ Thread.currentThread().getName());

    }
}

