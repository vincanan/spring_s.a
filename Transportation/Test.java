package Transportation;

public class Test {



    public static void main(String[] args) {
        Bus bus1 = new Bus(30, 1000, 100);
        Bus bus2 = new Bus(30, 1000, 100);
        bus1.carNumber();
        bus2.carNumber();
        bus1.boardPassenger(2);
        bus1.mFuel(50);
        bus1.plusFuel(10);
        bus1.boardPassenger(30);
        bus1.boardPassenger(5);
        bus1.mFuel(55);
        bus1.start();
    }


}

