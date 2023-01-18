import java.time.LocalDateTime;

public abstract class Tickets {
    private static int originalId = 1;

    private int id;
    private String showName;
    private LocalDateTime showDate;
    private int rowNumber;
    private int sitNumber;
    private Customer customer;
    private double price;


    public Tickets(String showName, LocalDateTime showDate, int rowNumber, int sitNumber, Customer customer) {
        this.id = originalId++;
        this.showName = showName;
        this.showDate = showDate;
        this.rowNumber = rowNumber;
        this.sitNumber = sitNumber;
        this.customer = customer;
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

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSitNumber() {
        return sitNumber;
    }

    public void setSitNumber(int sitNumber) {
        this.sitNumber = sitNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
