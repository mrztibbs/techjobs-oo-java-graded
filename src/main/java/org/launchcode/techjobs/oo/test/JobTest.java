package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    //Making sure each object gets a unique ID - AGT
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(),job2.getId());
    }

    //Makes sure all fields set properly by constructor - AGT
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName() == "Product tester");
        assertTrue(job3.getEmployer().toString() == "ACME");
        assertTrue(job3.getLocation().toString() == "Desert");
        assertTrue(job3.getPositionType().toString() == "Quality control");
        assertTrue(job3.getCoreCompetency().toString() == "Persistence");

        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().toString());
        assertEquals("Desert", job3.getLocation().toString());
        assertEquals("Quality control", job3.getPositionType().toString());
        assertEquals("Persistence", job3.getCoreCompetency().toString());
    }

    //Making sure that 2 jobs with identical input are not equal - AGT
    @Test
    public void testJobsForEquality(){
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobA.equals(jobB));
    }

    //Job toString needs to be formatted correctly
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobC = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobC.toString().charAt(0), '\n');
        assertEquals(jobC.toString().charAt(1), 'I');
        assertEquals(jobC.toString().charAt(6), '\n');
        assertEquals(jobC.toString().charAt(7), 'N');
        assertEquals(jobC.toString().charAt(27), '\n');
        assertEquals(jobC.toString().charAt(28), 'E');
        assertEquals(jobC.toString().charAt(42), '\n');
        assertEquals(jobC.toString().charAt(43), 'L');
        assertEquals(jobC.toString().charAt(59), '\n');
        assertEquals(jobC.toString().charAt(60), 'P');
        assertEquals(jobC.toString().charAt(90), '\n');
        assertEquals(jobC.toString().charAt(91), 'C');
        assertEquals(jobC.toString().charAt(jobC.toString().length()-1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobD = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: 4\n" + "Name: Product tester\n" + "Employer: ACME\n" + "Location: Desert\n" +
                "Position Type: Quality control\n" + "Core Competency: Persistence\n", jobD.toString());
    }

    @Test
    public void testToStringHandlesEmptyField () {
        Job jobE = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals("\nID: 3\n" + "Name: Product tester\n" + "Employer: ACME\n" + "Location: Desert\n" +
                "Position Type: Data not available\n" + "Core Competency: Persistence\n", jobE.toString());
    }
}
