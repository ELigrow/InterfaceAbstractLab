package edu.wctc.eligrow.lab1;

public class Driver {
    public static void main(String[] args) {
        //In using Polymorphism, methods can later be created where a course is instantiated first, then is declared
        //as an AdvancedJavaCourse, etc.
        //This can be useful, but this can become confusing to a new user.
        Course advJava = new AdvancedJavaCourse("Advanced Java", "1234");
        Course introJava = new IntroJavaCourse("Intro to Java", "5678");
        Course introProgramming = new IntroToProgrammingCourse("Intro to Programming", "9100");

        //The methods below showcase methods that are in the abstract Course superclass.
        advJava.setCredits(3.0);
        introJava.setCredits(4.0);
        introProgramming.setCredits(3.0);

        System.out.println("Advanced Java:");
        System.out.println("\tAdvanced Java class name: " +  advJava.getCourseName());
        System.out.println("\tAdvanced Java credits: " +  advJava.getCredits());
        System.out.println("\tAdvanced Java course #: " + advJava.getCourseNumber());

        System.out.println("Intro to Java:");
        System.out.println("\tIntro to Java class name: " + introJava.getCourseName());
        System.out.println("\tIntro to Java credits: " + introJava.getCredits());
        System.out.println("\tIntro to Java course #: " + introJava.getCourseNumber());

        System.out.println("Intro to Programming:");
        System.out.println("\tIntro to Programming class name: " + introProgramming.getCourseName());
        System.out.println("\tIntro to Programming credits: " + introProgramming.getCredits());
        System.out.println("\tIntro to Programming course #: " + introProgramming.getCourseNumber());

    }
}
