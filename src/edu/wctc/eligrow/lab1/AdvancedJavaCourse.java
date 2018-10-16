package edu.wctc.eligrow.lab1;

import javax.swing.JOptionPane;

/**
 * Creates and sets attributes of AdvancedJavaCourse objects, including name, prerequisites, credits, and course number.
 *
 * @author      Elijah Ligrow
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {
    private String prerequisites;
    private final double MIN_CREDIT = 0.5;
    private final double MAX_CREDIT = 4.0;

    /**
     * Constructor for AdvancedJavaCourse objects
     * @param courseName String: Name of the course
     * @param courseNumber String: Course number
     */
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
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
     * Sets the name of the course. Inherits from Course
     * @param courseName String: Name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Sets course number. Overrides from Course
     * @param courseNumber String: Number of course
     */
    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
}
