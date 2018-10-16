package edu.wctc.eligrow.lab1.test;

import edu.wctc.eligrow.lab1.AdvancedJavaCourse;
import edu.wctc.eligrow.lab1.IntroJavaCourse;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntroJavaCourseTest extends TestCase {

    IntroJavaCourse course;

    @Before
    public void setUp() throws Exception {
        course = new IntroJavaCourse("Class", "1234");
        course.setPrerequisites("Pre");
    }

    @Test
    public void testGetPrerequisites() {
        assertEquals("This will result in \"Pre\"", "Pre", course.getPrerequisites());
    }
}