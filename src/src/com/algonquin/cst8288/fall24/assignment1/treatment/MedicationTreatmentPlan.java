package src.com.algonquin.cst8288.fall24.assignment1.treatment;

import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * This class implements the TreatmentPlan interface and generates
 * a medication treatment plan based on the patient's diagnosis, age,
 * and condition type.
 */
public class MedicationTreatmentPlan implements TreatmentPlan {

    /**
     * Creates a medication treatment plan for the given patient.
     * 
     * @param patient the patient for whom the treatment plan is generated
     * @return a string containing the details of the treatment plan
     */
    @Override
    public String createTreatmentPlan(Patient patient) {
        StringBuilder plan = new StringBuilder();
        
        // Add diagnosis and age details
        plan.append("The patient is diagnosed with ")
            .append(patient.getDiagnosis()).append(".\n");
        plan.append("The patient is ").append(patient.getAge())
            .append(" years old and requires medication.\n");

        // Determine medication frequency based on age
        int dosesPerDay;
        if (patient.getAge() < 12) {
            dosesPerDay = 1; // CHILD
        } else if (patient.getAge() < 18) {
            dosesPerDay = 2; // YOUTH
        } else {
            dosesPerDay = 3; // ADULT
        }
        plan.append("The patient should take medication ")
            .append(dosesPerDay).append(" times per day.\n");

        // Determine treatment duration based on condition type
        String duration;
        switch (patient.getConditionType()) {
            case "Acute":
                duration = "7 days (No Medication)";
                break;
            case "Infection":
                duration = "14 days (Antibiotics)";
                break;
            case "Chronic":
                duration = "180 days (Specialized Medication)";
                break;
            default:
                duration = "unknown duration";
        }
        plan.append("The duration of the doses is ")
            .append(duration).append(".\n");

        // Return the generated treatment plan
        return plan.toString();
    }
}
