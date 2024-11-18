package src.com.algonquin.cst8288.fall24.assignment1.prescription;

import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * This interface defines the contract for generating detailed prescriptions
 * based on the patient's treatment plan.
 */
public interface PrescriptionService {
    /**
     * Generates a detailed prescription for a given patient.
     * 
     * @param patient the patient for whom the prescription is being generated
     * @return a string containing the generated prescription details
     */
    String generatePrescription(Patient patient);
}
