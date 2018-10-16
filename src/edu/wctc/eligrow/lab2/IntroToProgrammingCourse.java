package edu.wctc.eligrow.lab2;

import javax.swing.JOptionPane;

/**
 * Creates and sets attributes of IntroToProgrammingCourse objects, including name, credits, and course number.
 *
 * @author      Elijah Ligrow
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private final double MIN_CREDIT = 0.5;
    private final double MAX_CREDIT = 4.0;

    /**
     * Constructor for IntroToProgrammingCourse objects
     * @param courseName String: Name of the course
     * @param courseNumber String: Course number
     */
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    /**
     * Returns course number
     * @return String: Course number
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Sets course number.
     * @param courseNumber String: Course number
     */
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    /**
     * Returns credits
     * @return Double: Credits
     */
    public double getCredits() {
        return credits;
    }

    /**
     * Sets credits
     * @param credits Double: Number of credits
     */
    public void setCredits(double credits) {
        validateCredits(credits, MIN_CREDIT, MAX_CREDIT);
        this.credits = credits;
    }

    /**
     * Returns course name
     * @return String: Course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Validates credits against a maximum and a minimum
     * @param credits Double: Number to validate
     * @param min Double: Lower bound of validation
     * @param max Double: Upper bound of validation
     */
    @Override
    public void validateCredits(double credits, double min, double max) {
        if(credits < min || credits > max) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
    }

    /**
     * Sets course name
     * @param courseName String: Course name
     */
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}
