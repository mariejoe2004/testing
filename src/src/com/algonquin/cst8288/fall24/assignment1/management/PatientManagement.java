package src.com.algonquin.cst8288.fall24.assignment1.management;

import java.io.IOException;
import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import src.com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;

/**
 * The PatientManagement class manages the creation of treatment plans and the generation
 * of prescriptions for patients. It leverages external services for validation, treatment plan
 * creation, and prescription generation.
 * 
 * @version 1.0
 * @since 2024-09-29
 */
public class PatientManagement {

    // Dependency objects for validating patients, creating treatment plans, and generating prescriptions
    private PatientValidator validator;
    private TreatmentPlanCreator treatmentPlanCreator;
    private PrescriptionGenerator prescriptionGenerator;

    /**
     * Constructs a new PatientManagement object.
     * 
     * @param validator The validator object used to validate patient details.
     * @param treatmentPlanCreator The object responsible for creating treatment plans.
     * @param prescriptionGenerator The object used to generate prescriptions in various formats.
     */
    public PatientManagement(PatientValidator validator, TreatmentPlanCreator treatmentPlanCreator, PrescriptionGenerator prescriptionGenerator) {
        this.validator = validator;
        this.treatmentPlanCreator = treatmentPlanCreator;
        this.prescriptionGenerator = prescriptionGenerator;
    }

    /**
     * Creates a treatment plan for the given patient if validation is successful.
     * 
     * @param patient The patient for whom the treatment plan is being created.
     * @param treatment The treatment plan details specific to the patient's needs.
     */
    public void createTreatmentPlan(Patient patient, TreatmentPlan treatment) {
        // Validate the patient details before proceeding with the treatment plan creation
        if (validator.validate(patient)) {
            // Create the treatment plan and print it out
            String plan = treatmentPlanCreator.create(patient, treatment);
            System.out.println(plan);
        }
    }

    /**
     * Generates a prescription for the given patient in the specified format.
     * 
     * @param patient The patient for whom the prescription is being generated.
     * @param format The format in which the prescription should be generated (e.g., PDF, text).
     * @throws IOException If an I/O error occurs while generating the prescription.
     */
    public void generatePrescription(Patient patient, String format) throws IOException {
        // Call the prescription generator to create the prescription in the desired format
        prescriptionGenerator.generate(patient, format);
    }
}
