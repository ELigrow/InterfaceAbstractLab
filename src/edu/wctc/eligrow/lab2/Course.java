package edu.wctc.eligrow.lab2;

public interface Course {

    /**
     * Sets the number of credits
     * @param credits Double: Number of credits
     */
    public abstract void setCredits(double credits);

    /**
     * Returns number of credits
     * @return Double: Number of credits
     */
    public double getCredits();

    /**
     * Sets course number
     * @param number String: Course number
     */
    public abstract void setCourseNumber(String number);

    /**
     * Returns course number
     * @return String: Course number
     */
    public  String getCourseNumber();

    /**
     * Returns course name
     * @return String: Course name
     */
    public  String getCourseName();

    /**
     * Validates credits against a maximum and a minimum
     * @param credits Double: Number to validate
     * @param min Double: Lower bound of validation
     * @param max Double: Upper bound of validation
     */
    public void validateCredits(double credits, double min, double max);

}
