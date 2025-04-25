public class ItemStatus {
    private RoomItem item;
    private String status;
    private String notes;

    public ItemStatus(RoomItem item, String status, String notes) {
        this.item = item;
        this.status = status;
        this.notes = notes;
    }

    // accessor/getter
    public RoomItem getItem() {
        return item;
    }
    public String status() {
        return status;
    }
    public String getNotes() {
        return notes;
    }

    // mutator/setter
    public void setStatus(String status) {
        this.status = status;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    // toString
    public String toString() {
        String result = item.getDisplayName() + ": " + status;

        if (notes != null && notes.isEmpty()) {
            result += " (" + notes + ") ";
        }
        return result;
    }

}
