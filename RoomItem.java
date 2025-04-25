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

    private final String displayName;
    public RoomItem(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }
}
