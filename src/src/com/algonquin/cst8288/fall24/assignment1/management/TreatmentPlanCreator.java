package src.com.algonquin.cst8288.fall24.assignment1.management;

import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import src.com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;

public class TreatmentPlanCreator {

    private Age age = new Age(); // Instance of Age class to calculate age and life stage

    // Method to create a treatment plan for a patient
    public String create(Patient patient, TreatmentPlan treatment) {
        // Calculate the patient's age based on their date of birth
        int patientAge = (int) age.calculatePatientAge(patient.getDateOfBirth());
        
        // Set the patient's age
        patient.setAge(patientAge);
        
        // Determine and set the patient's life stage based on their age
        patient.setLifeStage(age.determineLifeStage(patientAge));
        
        // Create and return the treatment plan for the patient
        return treatment.createTreatmentPlan(patient);
    }
}