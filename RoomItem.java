import java.util.HashMap;

public class RoomItem {
    static {
        ALL = new HashMap<>();
        ALL.put("01", new RoomItem("Towel"));
        ALL.put("02", new RoomItem("Pillow"));
        ALL.put("03", new RoomItem("Bed"));
        ALL.put("04", new RoomItem("Mirror"));
        ALL.put("05", new RoomItem("Chair"));
        ALL.put("06", new RoomItem("Door"));
        ALL.put("07", new RoomItem("Hairdryer"));
        ALL.put("08", new RoomItem("Window"));
        ALL.put("09", new RoomItem("Glass"));
        ALL.put("10", new RoomItem("Fridge"));
        ALL.put("11", new RoomItem("Light bulb"));
        ALL.put("12", new RoomItem("Room Chard"));
    }

    public static void main(String[] args) {
        // Example of accessing the dictionary
        RoomItem item = ALL.get("01");
        System.out.println("Item with key 01: " + item.getName());
    }
}
