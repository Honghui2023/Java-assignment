import java.util.ArrayList;

public class Schedule {
    private String id;
    private String scheduleDate;
    private String staffAssigned;
    private ArrayList<String> brokenItems;

    public Schedule(String id, String scheduleDate, String staffAssigned, ArrayList<String> brokenItems) {
        this.id = id;
        this.scheduleDate = scheduleDate;
        this.staffAssigned = staffAssigned;
        this.brokenItems = brokenItems;
    }

    // Accessor
    public String getId() {
        return id;
    }

    // display the info
    public void displayInfo() {
        System.out.println("Room ID: " + id);
        System.out.println("Cleaning Date: " + scheduleDate);
        System.out.println("Staff: " + staffAssigned);
        if (!brokenItems.isEmpty()) {
            System.out.println("Broken Items: " + String.join(", ", brokenItems));
        }
        else {
            System.out.println("No broken items.");
        }
    }
}