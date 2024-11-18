package src.com.algonquin.cst8288.fall24.assignment1.treatment;

import org.junit.jupiter.api.Test;
import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class tests the SurgeryTreatmentPlan class to verify that the 
 * treatment plan is generated correctly based on the patient's age.
 */
public class SurgeryTreatmentPlanTest {

    /**
     * Test for SurgeryTreatmentPlan when the patient is a child (age 5).
     * It verifies that the treatment plan has the appropriate values for 
     * a child: High risk, No Fasting, and Next Day surgery.
     */
    @Test
    public void testChildSurgeryPlan() {
        // Create a new Patient object with age 5
        Patient patient = new Patient("John Doe", 5, "Condition");

        // Create a new SurgeryTreatmentPlan object
        SurgeryTreatmentPlan plan = new SurgeryTreatmentPlan();

        // Generate the treatment plan for the child patient
        String treatmentPlan = plan.createTreatmentPlan(patient);

        // Print the treatment plan to the console for debugging
        System.out.println(treatmentPlan);

        // Assert that the treatment plan contains the expected values for a child
        assertTrue(treatmentPlan.contains("High")); // High risk for child surgery
        assertTrue(treatmentPlan.contains("No Fasting")); // No fasting required
        assertTrue(treatmentPlan.contains("Next Day")); // Surgery planned for the next day
    }

    /**
     * Test for SurgeryTreatmentPlan when the patient is a youth (age 16).
     * It verifies that the treatment plan has the appropriate values for 
     * a youth: Medium risk, 2 Hours Before fasting, and surgery In a Week.
     */
    @Test
    public void testYouthSurgeryPlan() {
        // Create a new Patient object with age 16
        Patient patient = new Patient("Jane Doe", 16, "Condition");

        // Create a new SurgeryTreatmentPlan object
        SurgeryTreatmentPlan plan = new SurgeryTreatmentPlan();

        // Generate the treatment plan for the youth patient
        String treatmentPlan = plan.createTreatmentPlan(patient);

        // Print the treatment plan to the console for debugging
        System.out.println(treatmentPlan);

        // Assert that the treatment plan contains the expected values for a youth
        assertTrue(treatmentPlan.contains("Medium")); // Medium risk for youth surgery
        assertTrue(treatmentPlan.contains("2 Hours Before")); // Fasting required 2 hours before surgery
        assertTrue(treatmentPlan.contains("In a Week")); // Surgery planned in a week
    }

    /**
     * Test for SurgeryTreatmentPlan when the patient is an adult (age 25).
     * It verifies that the treatment plan has the appropriate values for 
     * an adult: Low risk, 8 Hours Before fasting, and surgery In a Month.
     */
    @Test
    public void testAdultSurgeryPlan() {
        // Create a new Patient object with age 25
        Patient patient = new Patient("Alice Doe", 25, "Condition");

        // Create a new SurgeryTreatmentPlan object
        SurgeryTreatmentPlan plan = new SurgeryTreatmentPlan();

        // Generate the treatment plan for the adult patient
        String treatmentPlan = plan.createTreatmentPlan(patient);

        // Print the treatment plan to the console for debugging
        System.out.println(treatmentPlan);

        // Assert that the treatment plan contains the expected values for an adult
        assertTrue(treatmentPlan.contains("Low")); // Low risk for adult surgery
        assertTrue(treatmentPlan.contains("8 Hours Before")); // Fasting required 8 hours before surgery
        assertTrue(treatmentPlan.contains("In a Month")); // Surgery planned in a month
    }
}
