package edu.wctc.eligrow.lab1.test;

import edu.wctc.eligrow.lab1.IntroJavaCourse;

import static org.junit.Assert.*;

public class CourseTest extends junit.framework.TestCase {

    IntroJavaCourse course;

    @org.junit.Before
    public void setUp() throws Exception {
        course = new IntroJavaCourse("Class", "1234");
        course.setCredits(4);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testGetCredits() {
        assertEquals("This will result in 4.0", 4.0, course.getCredits());
    }

    @org.junit.Test
    public void testGetCourseNumber() {
        assertEquals("This will result in \"1234\"","1234",course.getCourseNumber());
    }

    @org.junit.Test
    public void testGetCourseName() {
        assertEquals("This will result in \"Class\"","Class", course.getCourseName());
    }
}