package lab3;

public class Bus {
    private int numberSeats;
    private int occupiedSeats;
    private int ticketPrice;

    public Bus(int seats, int price) {
        numberSeats = seats;
        occupiedSeats = 0;
        ticketPrice = price;
    }

    public Bus(Bus firstbus) {
        this.numberSeats = firstbus.numberSeats;
        this.occupiedSeats = firstbus.occupiedSeats;
        this.ticketPrice = firstbus.ticketPrice;
    }

    public Bus() {
        numberSeats = 0;
        occupiedSeats = 0;
        ticketPrice = 0;
    }

    public void setPrice(int price) {
        if (price > 100000) System.out.println("А не дороговато ли?\n");
        ticketPrice = price;
    }

    public int getFree() {
        return numberSeats - occupiedSeats;
    }

    public int getSeats() {
        return numberSeats;
    }

    public int getOccupied() {
        return occupiedSeats;
    }

    public void setOccupiedSeats(int seats) {
        if (numberSeats <= seats) occupiedSeats = seats;
        else System.out.println("В автобусе только " + numberSeats + " мест. Вы не можете посадить в него " + seats + " мест.\n");
    }

    public void setNumbersSeats(int seats) {
        numberSeats = seats;
    }

    public boolean busFree() {
        return occupiedSeats==0?true:false;
    }

    public int seatsPrice() {
        return ticketPrice * occupiedSeats;
    }

    public void takeSeats(int count) {
        if (occupiedSeats == numberSeats) {
            System.out.println("В этот автобус больше не могут садиться люди - все места заняты.\n");
            return;
        }
        occupiedSeats += count;
        if (occupiedSeats > numberSeats) {
            System.out.printf("В автобусе не хватило мест. Не сели в автобус %d пассажиров\n", occupiedSeats - numberSeats);
            occupiedSeats = numberSeats;
        } else if (occupiedSeats == numberSeats) {
            System.out.println("Автобус полностью заполнен.\n");
        }
    }

    public boolean isEffective() {
        return (this.seatsPrice() - 11000) > 0;
    }
}
