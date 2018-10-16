package edu.wctc.eligrow.lab1;

import javax.swing.*;

/**
 * Creates and sets attributes of IntroJavaCourse objects, including name, prerequisites, credits, and course number.
 *
 * @author      Elijah Ligrow
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
    private String prerequisites;
    private final double MIN_CREDIT = 0;
    private final double MAX_CREDIT = 5.0;

    /**
     * Constructor for IntroJavaCourse objects
     * @param courseName String: Name of the course
     * @param courseNumber String: Course number
     */
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    /**
     * Sets course number. Overrides from Course
     * @param courseNumber String: Number of course
     */
    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }


    /**
     * Returns prerequisites;
     * @return String: prerequisites
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets prerequisites of the class
     * @param prerequisites String: Prerequisites of the class
     */
    public void setPrerequisites(String prerequisites) {
        validatePrerequisites(prerequisites);
        this.prerequisites = prerequisites;
    }

    /**
     * Sets number of credits. Overrides from Course
     * @param credits Double: Number of credits
     */
    @Override
        public void setCredits(double credits) {
        validateCredits(credits, MIN_CREDIT, MAX_CREDIT);
        this.credits = credits;
    }

    /**
     * Ensures prerequisites are valid. Helper class of setPrerequisites()
     * @param prerequisites String: Prerequisite to validate
     */
    private void validatePrerequisites(String prerequisites){
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
    }

}
