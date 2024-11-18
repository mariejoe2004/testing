package src.com.algonquin.cst8288.fall24.assignment1.prescription;

import src.com.algonquin.cst8288.fall24.assignment1.patient.Patient;

public class OnlinePrescriptionService implements PrescriptionService {

    @Override
    public String generatePrescription(Patient patient) {
        StringBuilder prescription = new StringBuilder();
        
        prescription.append("Printable Prescription\n");
        prescription.append("\n");
        prescription.append("Treatment Plan:\n");
        prescription.append("Patient Name: ").append(patient.getName()).append("\n");
        prescription.append("Date of Birth: ").append(patient.getDateOfBirth()).append("\n");
        prescription.append("Age: ").append(patient.getAge()).append("\n");
        prescription.append("Medication Frequency: 3 times per day\n");
        prescription.append("Duration of Treatment: 30 days\n");
        prescription.append("Medication Type: Antibiotics\n");
        prescription.append("\n");
        prescription.append("Prescription Details:\n");
        prescription.append("Dosage: 2\n");
        prescription.append("Duration: 7 days\n");
        prescription.append("Condition: Infection\n");
        
        return prescription.toString();
    }
}