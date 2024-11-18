package src.com.algonquin.cst8288.fall24.assignment1.management;

import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * The PatientValidator class is responsible for validating the required details
 * of a Patient object, such as name, email, phone number, and date of birth.
 * 
 * @version 1.0
 * @since 2024-09-29
 */
public class PatientValidator {

    /**
     * Validates a Patient object by checking if all required fields are present.
     * 
     * @param patient The Patient object to validate.
     * @return true if the patient has all required fields properly filled; false otherwise.
     */
    public boolean validate(Patient patient) {
        // Check if the patient's name is not null or empty
        if (patient.getName() == null || patient.getName().isEmpty()) {
            return false;
        }

        // Check if the patient's email is not null or empty
        if (patient.getEmail() == null || patient.getEmail().isEmpty()) {
            return false;
        }

        // Check if the patient's phone number is not null or empty
        if (patient.getPhoneNumber() == null || patient.getPhoneNumber().isEmpty()) {
            return false;
        }

        // Check if the patient's date of birth is not null or empty
        if (patient.getDateOfBirth() == null || patient.getDateOfBirth().isEmpty()) {
            return false;
        }

        // All checks passed, return true
        return true;
    }
}
