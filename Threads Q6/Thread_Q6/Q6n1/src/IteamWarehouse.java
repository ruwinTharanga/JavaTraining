public class IteamWarehouse {

    private int CurrentQty = 100;

    public int getCurrentQty() {
        return CurrentQty;
    }

    public void setCurrentQty(int NQty) {
        this.CurrentQty = CurrentQty - NQty;
    }



}


