public class GumballMachine {
    private int num_gumballs;
    private int inserted_coin_value;
    private int price;
    private int[] accept_coins;

    public GumballMachine(int size, int price, int[] accept_coins) {
        // initialise instance variables
        this.num_gumballs = size;
        this.inserted_coin_value = 0;
        this.price = price;
        this.accept_coins = accept_coins;

    }

    private boolean validateCoin(int coin) {

        for (int i = 0; i < accept_coins.length; i++) {
            if (accept_coins[i] == coin) {
                return true;
            }

        }
        return false;

    }

    public void insertCoin(int coin) {
        if (this.validateCoin(coin)) {
            this.inserted_coin_value += coin;
        } else {
            System.out.println("Cannot accept this coin.");
        }
    }

    public void turnCrank() {
        if (this.checkInsertedCoinValue()) {
            this.giveGumball();
        } else {
            System.out.println("Please insert coins.");
        }

    }

    private boolean checkInsertedCoinValue() {
        return this.inserted_coin_value >= this.price;
    }

    private void giveGumball() {
        if (this.num_gumballs > 0) {
            this.num_gumballs--;
            this.inserted_coin_value = 0;
            System.out.println("Thanks for your coins.  Gumball Ejected!");
        } else {
            System.out.println("No More Gumballs!  Sorry, can't return your coins.");
        }
    }
}