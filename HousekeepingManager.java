public class HousekeepingManager {
    private HkTask[] tasks = new HkTask[100]; 
    private int taskCount = 0; 

    public void addTask(HkTask task) {
        tasks[taskCount] = task;
        taskCount++;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public void displayTasksForRoom(String roomId) {
        System.out.println("Tasks for Room " + roomId + ":");
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getRoom().getId().equals(roomId)) {
                System.out.println(tasks[i].toString());
            }
        }
    }

    // Update task status
    public void updateTaskStatus(String taskId, String newStatus) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getTaskID().equals(taskId)) {
                tasks[i].setStatus(newStatus);
                break;
            }
        }
    }

    public void displayAllTasks() {
        System.out.println("=== All Housekeeping Tasks ===");
        for(int i = 0; i < taskCount; i++) {
            System.out.println(tasks[i].toString());
            System.out.println("-----------------------------");
        }
    }
}
