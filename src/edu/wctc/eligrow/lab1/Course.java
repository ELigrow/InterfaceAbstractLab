package edu.wctc.eligrow.lab1;

import javax.swing.*;

public abstract class Course {

    String courseName;
    String courseNumber;
    double credits;

    /**
     * Sets credits for courses
     * @param credits Double: Number of credits
     */
    public abstract void setCredits(double credits);

    /**
     * Returns number of credits
     * @return Double: Number of credits
     */
    public final double getCredits() { return credits; }

    /**
     * Sets course number
     * @param number String: Course number
     */
    public abstract void setCourseNumber(String number);

    /**
     * Returns course number
     * @return String: Course number
     */
    public final String getCourseNumber() { return courseNumber; }

    /**
     * Returns course name
     * @return String: Course name
     */
    public final String getCourseName() {
        return courseName;
    }

    /**
     * Validates credits against a maximum and a minimum
     * @param credits Double: Number to validate
     * @param min Double: Lower bound of validation
     * @param max Double: Upper bound of validation
     */
    public final void validateCredits(double credits, double min, double max){
        if(credits < min || credits > max) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
    }



}
