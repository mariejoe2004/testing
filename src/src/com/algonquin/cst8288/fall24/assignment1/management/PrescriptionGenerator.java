package src.com.algonquin.cst8288.fall24.assignment1.management;

import java.io.FileWriter;
import java.io.IOException;
import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;

public class PrescriptionGenerator {
    // Method to generate a prescription file for a patient
    public void generate(Patient patient, String format) throws IOException {
        // Create a file name based on the patient's name and the specified format
        String fileName = patient.getName().replace(" ", "_") + "_prescription." + format;
        
        // Try-with-resources to ensure FileWriter is closed after use
        try (FileWriter writer = new FileWriter(fileName)) {
            // Write the prescription details to the file
            writer.write("Printable Prescription\n\n");
            writer.write("Treatment Plan:\n");
            writer.write("Patient Name: " + patient.getName() + "\n");
            writer.write("Date of Birth: " + patient.getDateOfBirth() + "\n");
            writer.write("Age: " + patient.getAge() + "\n");
            writer.write("Medication Frequency: 3 times per day\n"); // Example value, adjust as needed
            writer.write("Duration of Treatment: 30 days\n"); // Example value, adjust as needed
            writer.write("Medication Type: Antibiotics\n\n"); // Example value, adjust as needed
            writer.write("Prescription Details:\n");
            writer.write("Dosage: 2\n"); // Example value, adjust as needed
            writer.write("Duration: 7 days\n"); // Example value, adjust as needed
            writer.write("Condition: " + patient.getConditionType() + "\n");
        }
    }
}