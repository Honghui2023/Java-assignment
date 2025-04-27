import java.time.LocalDate;
import java.util.ArrayList;

public class HkMain {
    public static void main(String[] args) {
        Staff housekeeper1 = new Staff("HK001", "John", "Lee", "Housekeeper", "Housekeeping", 2500.00);
        Staff housekeeper2 = new Staff("HK002", "Alice", "Wong", "Housekeeper", "Housekeeping", 2700.00);

        Room room101 = new Room("101", "Deluxe Room", 250.0, 2, "Occupied", "Spacious deluxe room");
        Room room105 = new Room("105", "Standard Room", 150.0, 1, "Available", "Simple standard room");
        Room room201 = new Room("201", "Suite", 350.0, 3, "Occupied", "A larger room");

        // Create housekeeping tasks
        HkTask task1 = new HkTask("T001", room101, housekeeper1, LocalDate.now(), "In Progress", "VIP guest room");
        task1.initializeItemStatus();
        task1.updateItemStatus(RoomItem.ALL[1], "Dirty", "Pillow needs changing");
        task1.updateItemStatus(RoomItem.ALL[2], "Dirty", "Bed needs changing");
        task1.updateItemStatus(RoomItem.ALL[0], "Clean", "Fresh towels placed");

        HkTask task2 = new HkTask("T002", room105, housekeeper2, LocalDate.now(), "Pending", "Check all items");
        task2.initializeItemStatus();

        // Create housekeeping manager
        HousekeepingManager manager = new HousekeepingManager();
        manager.addTask(task1);
        manager.addTask(task2);

        System.out.println("=== Initial Tasks for Room 101 ===");
        manager.displayTasksForRoom("101");

        ArrayList<String> brokenItems1 = new ArrayList<>();
        brokenItems1.add("Hairdryer");
        brokenItems1.add("Mirror");

        ArrayList<String> brokenItems2 = new ArrayList<>();
        brokenItems2.add("Glass");

        Schedule schedule1 = new Schedule("S001", "2025-03-14", housekeeper1.getStaffId() + " - " + housekeeper1.getFullName(), brokenItems1);
        Schedule schedule2 = new Schedule("S002", "2025-03-15", housekeeper2.getStaffId() + " - " + housekeeper2.getFullName(), brokenItems2);

        HkTask repairTask1 = new HkTask("T003", room101, housekeeper1, 
                                      LocalDate.parse("2023-03-14"), 
                                      "Pending", "Repair " + String.join(", ", brokenItems1));
        repairTask1.initializeItemStatus();
        
        HkTask repairTask2 = new HkTask("T004", room201, housekeeper2, 
                                      LocalDate.parse("2023-03-15"), 
                                      "Pending", "Repair " + String.join(", ", brokenItems2));
        repairTask2.initializeItemStatus();

        manager.addTask(repairTask1);
        manager.addTask(repairTask2);

        // Display all task details
        System.out.println("\n=== Complete Task Details ===");
        System.out.println(task1);
        System.out.println("\n" + task2);
        System.out.println("\n" + repairTask1);
        System.out.println("\n" + repairTask2);

        // Schedule
        System.out.println("\n=== Schedules ===");
        schedule1.displayInfo();
        System.out.println();
        schedule2.displayInfo();

        // Update status
        manager.updateTaskStatus("T002", "In Progress");
        System.out.println("\n=== After updating task status ===");
        manager.displayTasksForRoom("105");

    }
}