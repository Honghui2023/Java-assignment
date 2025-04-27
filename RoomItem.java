public class RoomItem {
    public static final RoomItem[] ALL = {
        new RoomItem("Towel"),
        new RoomItem("Pillow"),
        new RoomItem("Bed"),
        new RoomItem("Mirror"),
        new RoomItem("Chair"),
        new RoomItem("Door"),
        new RoomItem("Hairdryer"),
        new RoomItem("Window"),
        new RoomItem("Glass"),
        new RoomItem("Fridge"),
        new RoomItem("Room Chard")
    };

    public static RoomItem[] DEFAULT_ITEMS;

    private final String displayName;
    public RoomItem(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setStatus(String status) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStatus'");
    }
}
