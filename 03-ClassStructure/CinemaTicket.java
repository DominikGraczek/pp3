public class CinemaTicket {
    static String cinemaName = "Kino1";
    String filmTitle;
    int row;
    int seat;
    int price;

    public String toString() {
        return "Your ticket is for " + filmTitle + " in the " + row + " row and " + seat + " seat, and it costs "
                + price;
    }

    CinemaTicket(String filmTitle, int row, int seat) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if (row < 3) {
            this.price = 10;
        } else {
            this.price = 25;
        }
    }
}
