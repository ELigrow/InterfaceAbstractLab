package edu.wctc.eligrow.lab2;

import javax.swing.*;

/**
 * Creates and sets attributes of IntroJavaCourse objects, including name, prerequisites, credits, and course number.
 *
 * @author      Elijah Ligrow
 * @version     1.00
 */
public class IntroJavaCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private final double MIN_CREDIT = 0;
    private final double MAX_CREDIT = 5.0;

    /**
     * Constructor for IntroJavaCourse objects
     * @param courseName String: Name of the course
     * @param courseNumber String: Course number
     */
    public IntroJavaCourse(String courseName, String courseNumber) {
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
     * Returns course number
     * @return String: Course name
     */
    @Override
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
     * Sets course number
     * @param courseNumber String: Course number
     */
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    /**
     * Sets course name
     * @param courseName String: Course name
     */
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public double getCredits() {
        return credits;
    }

    /**
     * Sets number of credits
     * @param credits Double: Number of credits
     */
    public void setCredits(double credits) {
        validateCredits(credits, MIN_CREDIT, MAX_CREDIT);
        this.credits = credits;
    }

    /**
     * Returns prerequisites
     * @return String: Prerequisites
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets prerequisites
     * @param prerequisites String: Prerequisites
     */
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    
}
