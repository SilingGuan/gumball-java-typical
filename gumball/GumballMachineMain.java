public class GumballMachineMain {
    public static void main(String[] args) {
        int[] accept_coins1 = { 25 };
        int[] accept_coins2 = { 25 };
        int[] accept_coins3 = { 5, 10, 25 };
        GumballMachine G1 = new GumballMachine(30, 25, accept_coins1);
        GumballMachine G2 = new GumballMachine(30, 50, accept_coins2);
        GumballMachine G3 = new GumballMachine(0, 50, accept_coins3);
        G1.insertCoin(25);
        G1.turnCrank();

        G2.insertCoin(25);
        G2.insertCoin(25);
        G2.turnCrank();

        G3.insertCoin(25);
        G3.insertCoin(10);
        G3.insertCoin(10);
        G3.insertCoin(25);
        G3.turnCrank();
    }
}