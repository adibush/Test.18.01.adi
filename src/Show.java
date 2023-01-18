import java.time.LocalDateTime;
import java.util.ArrayList;

public class Show {
    private static int originalId = 1;

    private int id;
    private String showName;
    private LocalDateTime showDate;
    private ArrayList<Tickets> listOfTickets;

    public Show(String showName, LocalDateTime showDate, ArrayList<Tickets> listOfTickets) {
        this.id = originalId++;
        this.showName = showName;
        this.showDate = showDate;
        this.listOfTickets = listOfTickets;
        calculateRevenue();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public LocalDateTime getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDateTime showDate) {
        this.showDate = showDate;
    }

    public ArrayList<Tickets> getListOfTickets() {
        return listOfTickets;
    }

    public void setListOfTickets(ArrayList<Tickets> listOfTickets) {
        this.listOfTickets = listOfTickets;
    }

    public void addTickets(Tickets ticket) {
        if (!listOfTickets.contains(ticket)) {
            listOfTickets.add(ticket);
        }
    }

    public void removeTickets(Tickets ticket) {
        if (listOfTickets.contains(ticket)) {
            listOfTickets.remove(ticket);
        }
    }

    public double calculateRevenue() {
        int sum = 0;
        for (Tickets ticket : listOfTickets) {
            sum += ticket.getPrice();
        }
        return sum;
    }


}
