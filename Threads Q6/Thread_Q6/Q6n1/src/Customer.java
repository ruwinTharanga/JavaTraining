public class Customer implements Runnable{
    private IteamWarehouse iteamWarehouse;

    public Customer(IteamWarehouse iteamWarehouse) {
        this.iteamWarehouse = iteamWarehouse;
    }

    private synchronized void ItemIssue(int NQty){

        if(iteamWarehouse.getCurrentQty()>=NQty){

            System.out.println("Customer Request Items Quantity :"+NQty);



            try{
                Thread.sleep(2000);
                iteamWarehouse.setCurrentQty(NQty);
                System.out.println("Item Quantity :" +NQty +"Current Quantity" + iteamWarehouse.getCurrentQty());

            }catch(InterruptedException e){
                System.out.println("Error");
            }


        }else{
            System.out.println("Not Available Items" );
        }
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            ItemIssue(10);
            if (iteamWarehouse.getCurrentQty()>=0){
                System.out.println("Can Buy..");
            }

        }
    }

}
