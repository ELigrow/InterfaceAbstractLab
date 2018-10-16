package edu.wctc.eligrow.lab2.test;

import edu.wctc.eligrow.lab1.AdvancedJavaCourse;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdvancedJavaCourseTest extends TestCase {

    AdvancedJavaCourse course;

    @Before
    public void setUp() throws Exception {
        course = new AdvancedJavaCourse("Class", "1234");
        course.setCredits(4);
        course.setPrerequisites("Pre");
    }

    @Test
    public void testGetCourseNumber() {
        assertEquals("This will result in \"1234\"","1234",course.getCourseNumber());
    }

    @Test
    public void testGetCredits() {
        assertEquals("This will result in 4.0", 4.0, course.getCredits());
    }

    @Test
    public void testGetPrerequisites() {
        assertEquals("This will result in \"Pre\"", "Pre", course.getPrerequisites());
    }

    @Test
    public void testGetCourseName() {
        assertEquals("This will result in \"Class\"","Class", course.getCourseName());
    }
}