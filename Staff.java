public class Staff {
    private String staffId;
    private String firstName;
    private String lastName;
    private String role;
    private String department;
    private double salary;

    public Staff(String staffId, String firstName, String lastName, 
                   String role, String department, double salary) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.department = department;
        this.salary = salary;
}

 // Getter
 public String getStaffId() { 
    return staffId; 
}
 public String getFullName() { 
    return firstName + " " + lastName; 
}
 public String getRole() { 
    return role; 
}
 public String getDepartment() { 
    return department; 
}
 public double getSalary() { 
    return salary; 
}

// toString
 public String toString() {
     return "Staff ID: " + staffId + ", Name: " + getFullName() + 
            ", Role: " + role + ", Department: " + department;
 }
}
