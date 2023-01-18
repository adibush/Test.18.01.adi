import java.time.LocalDateTime;

public class RegularTickets extends Tickets implements Priceable {

    public RegularTickets(String showName, LocalDateTime showDate, int rowNumber, int sitNumber, Customer customer) {
        super(showName, showDate, rowNumber, sitNumber, customer);
        this.setPrice(calculateTicketPrice());
    }

    @Override
    public double calculateTicketPrice() {
        return this.getPrice();

    }
}
