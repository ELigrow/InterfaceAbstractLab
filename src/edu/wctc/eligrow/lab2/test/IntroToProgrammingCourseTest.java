package edu.wctc.eligrow.lab2.test;

import edu.wctc.eligrow.lab2.IntroJavaCourse;
import edu.wctc.eligrow.lab2.IntroToProgrammingCourse;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntroToProgrammingCourseTest extends TestCase {

    IntroToProgrammingCourse course;

    @Before
    public void setUp() throws Exception {
        course = new IntroToProgrammingCourse("Class", "1234");
        course.setCredits(4);
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
    public void testGetCourseName() {
        assertEquals("This will result in \"Class\"","Class", course.getCourseName());
    }
}