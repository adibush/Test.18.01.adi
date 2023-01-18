import java.time.LocalDateTime;

public class VipTickets extends Tickets implements Priceable {

    public VipTickets(String showName, LocalDateTime showDate, int rowNumber, int sitNumber, Customer customer) {
        super(showName, showDate, rowNumber, sitNumber, customer);
        this.setPrice(calculateTicketPrice());
    }

    @Override
    public double calculateTicketPrice() {
        if (this.getCustomer().getCustomerType() == CustomerType.Vip) {
            return this.getPrice() - this.getPrice() / 100 * this.getCustomer().getCustomerDiscount();
        } else {
            return this.getPrice();
        }
    }


}
