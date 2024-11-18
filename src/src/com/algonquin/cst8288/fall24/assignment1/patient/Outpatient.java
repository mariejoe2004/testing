package src.com.algonquin.cst8288.fall24.assignment1.patient;

public class Outpatient extends Patient {
    private String appointmentDate; // Appointment date for the outpatient

    // Constructor to initialize Outpatient with necessary details
    public Outpatient(String id, String name, String email, String phoneNumber, String dateOfBirth, String appointmentDate) {
        super(id, name, email, phoneNumber, dateOfBirth); // Call to superclass constructor
        this.appointmentDate = appointmentDate; // Set the appointment date
    }

    // Getter for appointment date
    public String getAppointmentDate() {
        return appointmentDate;
    }
}