public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    HotelBooking() {
        guestName = "Anshika";
        roomType = "Deluxe";
        nights = 3;
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking();// default
        HotelBooking hb2 = new HotelBooking(hb1);// parameterized
        HotelBooking hb3 = new HotelBooking(hb2);// copy constructor
        System.out.println("Original :");
        hb1.display();
        System.out.println("Parameterized :");
        hb2.display();
        System.out.println("Copy :");
        hb3.display();
    }
}