package lab3;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(54, 400);
        Bus luxBus = new Bus(45, 500);
        bus.takeSeats(30);
        luxBus.takeSeats(25);
        System.out.printf("Автобус с большим количеством мест");
        if (bus.isEffective()) System.out.println(" рентабельный.");
        else System.out.println(" нерентабельный.");
        System.out.printf("Автобус с меньшим колчеством мест");
        if (luxBus.isEffective()) System.out.println(" рентабельный.");
        else System.out.println(" нерентабельный.");
    }
}
