import java.util.Arrays;

public class ItemStatus {
    private RoomItem item;
    private String status;
    private String notes;
    private static final String[] VALID_STATUSES = {"Clean", "Dirty", "Damaged", "Missing"};

    public ItemStatus(RoomItem item, String status, String notes) {
        this.item = item;
        this.status = status;
        this.notes = notes;
    }



    // accessor/getter
    public RoomItem getItem() {
        return item;
    }
    public String getStatus() {
        return status;
    }
    public String getNotes() {
        return notes;
    }

    // mutator/setter
    public void setItem(RoomItem item) {
        if(item == null) {
            System.out.println("Item cannot be null.");
        }
        this.item = item;
    }
    public void setStatus(String status) {
        if(!Arrays.asList(VALID_STATUSES).contains(status)) {
            System.out.println("Invalid item status.");
        }
        this.status = status;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    // toString
    public String toString() {
        String result = item.getDisplayName() + ": " + status;

        if (notes != null && !notes.isEmpty()) {
            result += " (" + notes + ") ";
        }
        return result;
    }

}
