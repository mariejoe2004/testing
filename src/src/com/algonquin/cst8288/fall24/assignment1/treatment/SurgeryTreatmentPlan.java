package src.com.algonquin.cst8288.fall24.assignment1.treatment;

import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * The SurgeryTreatmentPlan class implements the TreatmentPlan interface
 * and provides a specific treatment plan for patients who require surgery.
 * This plan is created based on the patient's diagnosis, age, and risk factors.
 */
public class SurgeryTreatmentPlan implements TreatmentPlan {

    /**
     * Creates a surgery treatment plan based on the patient's age and diagnosis.
     * The treatment plan includes the surgery requirement, fasting instructions,
     * risk factor assessment, and follow-up details.
     *
     * @param patient the patient for whom the treatment plan is created
     * @return a String containing the detailed treatment plan
     */
    @Override
    public String createTreatmentPlan(Patient patient) {
        // Create a StringBuilder to construct the treatment plan step by step
        StringBuilder plan = new StringBuilder();
        
        // Add patient's diagnosis and surgery requirement to the plan
        plan.append("The patient is diagnosed with ").append(patient.getDiagnosis()).append(" and requires surgery.\n");
        
        // Add patient's age to the plan and assess risk factors based on age
        plan.append("The patient is ").append(patient.getAge()).append(" years old with a risk factor of ");
        
        // Initialize variables for risk factor, fasting, and follow-up details
        String riskFactor;
        String fasting;
        String followUp;

        // Determine risk factor, fasting requirement, and follow-up based on patient's age
        if (patient.getAge() < 6) {
            // High risk for very young patients
            riskFactor = "High";
            fasting = "No Fasting";  // No fasting required for young children
            followUp = "Next Day";   // Immediate follow-up needed
        } else if (patient.getAge() <= 18) {
            // Medium risk for older children and teenagers
            riskFactor = "Medium";
            fasting = "2 Hours Before";  // Short fasting period
            followUp = "In a Week";   // Follow-up after a week
        } else {
            // Low risk for adults
            riskFactor = "Low";
            fasting = "8 Hours Before";  // Standard fasting period for adults
            followUp = "In a Month";   // Follow-up after a month
        }

        // Add the risk factor to the treatment plan
        plan.append(riskFactor).append(".\n");

        // Add details about the surgery and the diagnosis being treated
        plan.append("It is required to perform a minor surgery in order to address the ")
            .append(patient.getDiagnosis()).append(" issue.\n");
        
        // Add fasting requirement to the plan
        plan.append("Fasting requirement: ").append(fasting).append(".\n");

        // Add follow-up instructions to the plan
        plan.append("Follow-up: ").append(followUp).append(".\n");

        // Return the completed treatment plan as a string
        return plan.toString();
    }
}
