package src.com.algonquin.cst8288.fall24.assignment1.patient;

public class Inpatient extends Patient {
    private String roomNumber; // Room number for the inpatient

    // Constructor to initialize Inpatient with necessary details
    public Inpatient(String id, String name, String email, String phoneNumber, String dateOfBirth, String roomNumber) {
        super(id, name, email, phoneNumber, dateOfBirth); // Call to superclass constructor
        this.roomNumber = roomNumber; // Set the room number
    }

    // Getter for room number
    public String getRoomNumber() {
        return roomNumber;
    }

    // Method to admit the inpatient
    public void admit() {
        System.out.println(getName() + " has been admitted to " + getRoomNumber());
    }
}