package edu.wctc.eligrow.lab1;

import javax.swing.JOptionPane;

/**
 * Creates and sets attributes of IntroToProgrammingCourse objects, including name, credits, and course number.
 *
 * @author      Elijah Ligrow
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course {

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
     * Sets the course number. Overrides from Course
     * @param courseNumber String: Course number
     */
    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    /**
     * Sets credits of course. Overrides from Course
     * @param credits Double: Number of credits
     */
    @Override
    public void setCredits(double credits) {
        validateCredits(credits, MIN_CREDIT, MAX_CREDIT);
        this.credits = credits;
    }

    /**
     * Sets course name.
     * @param courseName String: Course name
     */
    public final void setCourseName(String courseName) {
        validateCourseName(courseName);
        this.courseName = courseName;
    }

    /**
     * Validates course name. Helper class to setCourseName()
     * @param courseName String: Name to be validated
     */
    private void validateCourseName(String courseName){
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
    }

    
}
