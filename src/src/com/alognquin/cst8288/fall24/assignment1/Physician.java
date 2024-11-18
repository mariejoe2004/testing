package src.com.alognquin.cst8288.fall24.assignment1;

import java.io.IOException;
import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import src.com.algonquin.cst8288.fall24.assignment1.treatment.MedicationTreatmentPlan;
import src.com.algonquin.cst8288.fall24.assignment1.treatment.SurgeryTreatmentPlan;
import src.com.algonquin.cst8288.fall24.assignment1.management.PatientManagement;
import src.com.algonquin.cst8288.fall24.assignment1.management.PatientValidator;
import src.com.algonquin.cst8288.fall24.assignment1.management.TreatmentPlanCreator;
import src.com.algonquin.cst8288.fall24.assignment1.management.PrescriptionGenerator;

/**
 * The Physician class serves as the entry point of the application and simulates
 * the process of managing patients, creating treatment plans, and generating
 * prescriptions. It uses various components such as PatientManagement, 
 * PatientValidator, TreatmentPlanCreator, and PrescriptionGenerator to manage the workflow.
 */
public class Physician {
    
    /**
     * The main method is the starting point of the program. It creates two patients, 
     * applies different treatment plans, and generates prescriptions for them in both
     * HTML and text formats.
     *
     * @param args command-line arguments (not used in this application)
     * @throws IOException if an error occurs during file operations
     */
    public static void main(String[] args) throws IOException {
        
        // Create two instances of the 'Patient' class with sample data
        Patient patient1 = new Patient("1", "John Doe", "john.doe@example.com", "123-456-7890", "1990-01-01");
        Patient patient2 = new Patient("2", "Jane Smith", "jane.smith@example.com", "098-765-4321", "1995-05-05");
        
        // Set diagnosis and condition type for each patient
        patient1.setDiagnosis("Flu");              // Patient 1 diagnosed with flu
        patient1.setConditionType("Acute");        // Acute condition for Patient 1
        
        patient2.setDiagnosis("Appendicitis");     // Patient 2 diagnosed with appendicitis
        patient2.setConditionType("Infection");    // Infection condition for Patient 2
        
        // Apply 'MedicationTreatmentPlan' for patient1 and 'SurgeryTreatmentPlan' for patient2
        MedicationTreatmentPlan medicationTreatment = new MedicationTreatmentPlan();
        SurgeryTreatmentPlan surgeryTreatment = new SurgeryTreatmentPlan();
        
        // Instantiate supporting objects needed for the management system
        PatientValidator validator = new PatientValidator();          // Validates patient data
        TreatmentPlanCreator treatmentPlanCreator = new TreatmentPlanCreator();  // Creates treatment plans
        PrescriptionGenerator prescriptionGenerator = new PrescriptionGenerator();  // Generates prescriptions
        
        // Instantiate PatientManagement with the above dependencies to manage patient workflows
        PatientManagement patientManagement = new PatientManagement(validator, treatmentPlanCreator, prescriptionGenerator);
        
        // Generate treatment plan for patient1 using medication
        patientManagement.createTreatmentPlan(patient1, medicationTreatment);
        
        // Generate treatment plan for patient2 using surgery
        patientManagement.createTreatmentPlan(patient2, surgeryTreatment);
        
        // Generate and save prescriptions for patient1 in both HTML and TXT formats
        patientManagement.generatePrescription(patient1, "html");  // HTML prescription for patient1
        patientManagement.generatePrescription(patient1, "txt");   // Text prescription for patient1
        
        // Generate and save prescriptions for patient2 in both HTML and TXT formats
        patientManagement.generatePrescription(patient2, "html");  // HTML prescription for patient2
        patientManagement.generatePrescription(patient2, "txt");   // Text prescription for patient2
    }
}
