import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class order {
    public int id ;
    public int customerId;
    public int quantity;
    public LocalDate timeOder;

    private item item;

    public order(int id, int customerId, int quantity, LocalDate timeOder, item item) {
        this.id = id;
        this.customerId = customerId;
        this.quantity = quantity;
        this.timeOder = timeOder;
        this.item = item;
    }
}
