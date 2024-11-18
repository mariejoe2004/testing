package src.com.algonquin.cst8288.fall24.assignment1.treatment;

import org.junit.jupiter.api.Test;
import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains unit tests for the MedicationTreatmentPlan class.
 * Each test method verifies that the correct treatment plan is generated 
 * based on the patient's age and condition type.
 */
public class MedicationTreatmentPlanTest {

    /**
     * Tests the treatment plan generated for a child patient with an acute condition.
     * The expected plan includes 1 dose per day and a duration of 7 days without medication.
     */
    @Test
    public void testChildMedicationPlan() {
        // Create a child patient (age 10) with an acute condition
        Patient patient = new Patient("John Doe", 10, "Acute");
        
        // Create an instance of the MedicationTreatmentPlan
        MedicationTreatmentPlan plan = new MedicationTreatmentPlan();
        
        // Generate the treatment plan for the patient
        String treatmentPlan = plan.createTreatmentPlan(patient);
        
        // Print the generated plan for debugging purposes
        System.out.println(treatmentPlan);
        
        // Assert that the plan includes 1 dose per day
        assertTrue(treatmentPlan.contains("1 times per day"));
        
        // Assert that the plan includes 7 days with no medication
        assertTrue(treatmentPlan.contains("7 days (No Medication)"));
    }

    /**
     * Tests the treatment plan generated for a youth patient with an infection.
     * The expected plan includes 2 doses per day and a duration of 14 days with antibiotics.
     */
    @Test
    public void testYouthInfectionPlan() {
        // Create a youth patient (age 15) with an infection condition
        Patient patient = new Patient("Jane Doe", 15, "Infection");
        
        // Create an instance of the MedicationTreatmentPlan
        MedicationTreatmentPlan plan = new MedicationTreatmentPlan();
        
        // Generate the treatment plan for the patient
        String treatmentPlan = plan.createTreatmentPlan(patient);
        
        // Print the generated plan for debugging purposes
        System.out.println(treatmentPlan);
        
        // Assert that the plan includes 2 doses per day
        assertTrue(treatmentPlan.contains("2 times per day"));
        
        // Assert that the plan includes 14 days with antibiotics
        assertTrue(treatmentPlan.contains("14 days (Antibiotics)"));
    }

    /**
     * Tests the treatment plan generated for an adult patient with a chronic condition.
     * The expected plan includes 3 doses per day and a duration of 180 days with specialized medication.
     */
    @Test
    public void testAdultChronicPlan() {
        // Create an adult patient (age 25) with a chronic condition
        Patient patient = new Patient("Alice Doe", 25, "Chronic");
        
        // Create an instance of the MedicationTreatmentPlan
        MedicationTreatmentPlan plan = new MedicationTreatmentPlan();
        
        // Generate the treatment plan for the patient
        String treatmentPlan = plan.createTreatmentPlan(patient);
        
        // Print the generated plan for debugging purposes
        System.out.println(treatmentPlan);
        
        // Assert that the plan includes 3 doses per day
        assertTrue(treatmentPlan.contains("3 times per day"));
        
        // Assert that the plan includes 180 days with specialized medication
        assertTrue(treatmentPlan.contains("180 days (Specialized Medication)"));
    }
}
