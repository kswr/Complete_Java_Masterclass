import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDrive02 {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        reserveSeat01(theatre, "D12");
        reserveSeat01(theatre, "B13");

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void reserveSeat01(Theatre theatre, String seatNumber) {
        if (theatre.reserveSeat(seatNumber)) {
            System.out.println("Please pay for " + seatNumber);
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("================================================");
    }
}