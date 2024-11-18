package src.com.algonquin.cst8288.fall24.assignment1.patient;

public class Patient {
    private String id; // Patient ID
    private String name; // Patient name
    private String email; // Patient email
    private String phoneNumber; // Patient phone number
    private String dateOfBirth; // Patient date of birth
    private String diagnosis; // Patient diagnosis
    private String conditionType; // Type of condition the patient has
    private int age; // Patient age
    private String lifeStage; // Patient life stage

    // Constructor to initialize Patient with basic details
    public Patient(String id, String name, String email, String phoneNumber, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    // Unsupported constructor, likely for testing or future use
    public Patient(String john_Doe, int i, String acute) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters and setters for the Patient attributes
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLifeStage() {
        return lifeStage;
    }

    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }
}