package src.com.algonquin.cst8288.fall24.assignment1.prescription;

import java.util.Date;

/**
 * Calculate the details of the prescription according to the business rules.
 * The information to include should cover daily doses, duration, disease type,
 * surgery date, etc.
 */
public class Prescription {
    long dailyDosageCount; // Number of doses per day
    long duration; // Duration of the treatment in days
    String diseaseType; // Type of disease being treated
    Date surgeryDate; // Date of surgery, if applicable
    String riskFactor; // Risk factors associated with the patient
    boolean isFastingRequired; // Whether fasting is required
    Date followUpDate; // Date for follow-up appointment
    // Add any other required attributes

    // Default constructor
    public Prescription() {
    }

    // Method to generate prescription details
    public String getPrescriptionDetails() {
        return String.format(
            "Disease Type: %s\nDaily Dosage Count: %d\nDuration: %d days\nSurgery Date: %s\nRisk Factor: %s\nFasting Required: %b\nFollow Up Date: %s",
            diseaseType, dailyDosageCount, duration, surgeryDate, riskFactor, isFastingRequired, followUpDate
        );
    }
}