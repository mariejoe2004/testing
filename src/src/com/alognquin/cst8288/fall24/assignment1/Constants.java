package src.com.alognquin.cst8288.fall24.assignment1;

/**
 * The Constants class defines a set of constant values that are used throughout
 * the application. These constants include durations for different disease types,
 * disease names, age group categories, and risk levels.
 * 
 * This class is meant to provide easy access to static final variables, which 
 * ensure consistency and prevent magic numbers or strings from being scattered 
 * across the codebase.
 */
public class Constants {

    // Duration constants for different disease types (in days)
    
    /** Duration for acute diseases (7 days). */
    public static final long ACUTE_DURATION = 7;
    
    /** Duration for infection diseases (30 days). */
    public static final long INFECTION_DURATION = 30;
    
    /** Duration for chronic diseases (180 days). */
    public static final long CHRONIC_DURATION = 180;

    // Disease type constants
    
    /** Represents an acute disease. */
    public static final String ACUTE = "Acute Disease";
    
    /** Represents an infectious disease. */
    public static final String INFECTION = "Infection Disease";
    
    /** Represents a chronic disease. */
    public static final String CHRONIC = "Chronic Disease";

    // Age group constants
    
    /** Represents the 'Children' age group. */
    public static final String CHILD = "Children";
    
    /** Represents the 'Youth' age group. */
    public static final String YOUTH = "Youth";
    
    /** Represents the 'Adult' age group. */
    public static final String ADULT = "Adult";

    // Risk level constants
    
    /** High risk level. */
    public static final String HIGH = "High";
    
    /** Medium risk level. */
    public static final String MEDIUM = "Medium";
    
    /** Low risk level. */
    public static final String LOW = "Low";
}
