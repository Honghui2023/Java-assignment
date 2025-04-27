import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HkTask {
    private String taskID;
    private Room room;
    private Staff assignedTo;
    private LocalDate date;
    private String status;
    private String notes;
    private List<ItemStatus> itemStatuses;
    private static final String[] VALID_STATUSES = {"Pending", "In Progress", "Completed", "Cancelled"};

    public HkTask(String taskID, Room room, Staff assignedTo, LocalDate date, String status, String notes) {
        this.taskID = taskID;
        this.room = room;
        this.assignedTo = assignedTo;
        this.date = date;
        this.status = status;
        this.notes = notes;
        this.itemStatuses = new ArrayList<>();
    }

    // getter
    public String getTaskID() {
        return taskID;
    }
    public Room getRoom() { 
        return room;
    }
    public Staff getAssignedTo() { 
        return assignedTo;
    }
    public LocalDate getDate() { 
        return date; 
    }
    public String getStatus() { 
        return status; 
    }
    public String getNotes() { 
        return notes; 
    }

    // setter
    public void setTaskID(String taskID) {
        if(taskID == null && taskID.length() > 6) {
            System.out.println("Task ID must be in format TXXXX");
        }
        this.taskID = taskID;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setNotes(String notes) { 
        this.notes = notes; 
    }

    public void initializeItemStatus() {
        for (RoomItem item : RoomItem.ALL) {
            itemStatuses.add(new ItemStatus(item, "Clean", ""));
        }
    }

    public void updateItemStatus(RoomItem item, String status, String notes) {
        for (ItemStatus itemStatus : itemStatuses) {
            if (itemStatus.getItem().equals(item)) {
                itemStatus.setStatus(status);
                itemStatus.setNotes(notes);
                break;
            }
        }
    }

    public List<ItemStatus> getItemStatuses() {
        return itemStatuses;
    }

    // toString
    public String toString() {
        String result = "";
        result += "Task ID: " + taskID + "\n";
        result += "Room: " + room.getId() + "\n";
        result += "Status: " + status + "\n";
        result += "Notes: " + notes + "\n";
    
        // Simple item status listing
        result += "Items:\n";
        for (ItemStatus item : itemStatuses) {
            result += "- " + item.getItem().getDisplayName() + ": " + item.getStatus() + "\n";
        }
    
        return result;
    }

    public static String[] getValidStatus() {
        return VALID_STATUSES;
    }

}
