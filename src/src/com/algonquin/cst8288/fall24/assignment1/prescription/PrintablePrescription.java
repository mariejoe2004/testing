package src.com.algonquin.cst8288.fall24.assignment1.prescription;

/**
 * This class represents a printable prescription example for a patient.
 * It prints out details of the treatment plan and prescription.
 */
public class PrintablePrescription {

    public static void main(String[] args) {
        // Print a title for the prescription
        System.out.println("Printable Prescription\n");
        
        // Print treatment plan details
        System.out.println("Treatment Plan:");
        System.out.println("Patient Name: Anthony");
        System.out.println("Date of Birth: 1990-08-20");
        System.out.println("Age: 34");
        System.out.println("Medication Frequency: 3 times per day");
        System.out.println("Duration of Treatment: 30 days");
        System.out.println("Medication Type: Antibiotics\n");
        
        // Print prescription details
        System.out.println("Prescription Details:");
        System.out.println("Dosage: 2 tablets");
        System.out.println("Duration: 7 days");
        System.out.println("Condition: Infection");
    }
}
