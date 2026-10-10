package question3;

public class PolymorphismDriver {

    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship(
                "Titanic",
                "1912"
        );

        ships[1] = new CruiseShip(
                "Royal Caribbean",
                "2022",
                6988
        );

        ships[2] = new CargoShip(
                "Ever Given",
                "2018",
                200000
        );

        System.out.println("SHIP INFORMATION");
        System.out.println("================");

        for (Ship ship : ships) {
            ship.print();
            System.out.println("----------------");
        }
    }
}