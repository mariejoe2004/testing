package src.com.algonquin.cst8288.fall24.assignment1.management;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import src.com.alognquin.cst8288.fall24.assignment1.Constants;

/**
 * The Age class provides methods to calculate the age of a patient 
 * and determine their life stage based on the calculated age.
 * This class follows the Java Coding Conventions.
 * 
 * @version 1.0
 * @since 2024-09-29
 */
public class Age {

    /**
     * Calculates the age of a patient based on their date of birth.
     *
     * @param dob The date of birth in the format "yyyy-MM-dd".
     * @return The age of the patient in years.
     */
    public long calculatePatientAge(String dob) {
        // Define a formatter to parse the date of birth string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Parse the date of birth into a LocalDate object
        LocalDate dateOfBirth = LocalDate.parse(dob, formatter);
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Calculate and return the number of years between the birthdate and the current date
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    /**
     * Determines the life stage of a patient based on their age.
     *
     * @param age The age of the patient in years.
     * @return A string representing the life stage: child, youth, or adult.
     */
    public String determineLifeStage(long age) {
        // Return the appropriate life stage based on the age
        return (age <= 6) ? Constants.CHILD : 
               (age <= 18) ? Constants.YOUTH : 
               Constants.ADULT;   
    }
}
